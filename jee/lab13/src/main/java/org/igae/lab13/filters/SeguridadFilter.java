package org.igae.lab13.filters;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.igae.lab13.model.Usuario;


public class SeguridadFilter implements Filter {

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest httpReq = (HttpServletRequest)req;
		HttpServletResponse httpResp = (HttpServletResponse)resp;
		
		// Comprobar si el usuario ha realizado login correctamente o que ya estaba autenticado
		if(httpReq.getSession().getAttribute("usuario") == null)
			if(httpReq.getRequestURI().endsWith("chequea_usuario.accion")){
				// Obtenemos de la BBDD el posible usuario que se corresponde con ese login que viene del formulario login.html
				Usuario usuario = obtenerUsuario(httpReq.getParameter("login")); 
				if ((usuario!=null) && (usuario.getPassword().equalsIgnoreCase(req.getParameter("password")))) {
					System.out.println("El usuario esta correctamente autenticado, se le deja paso y se guardan sus datos en la sesion");
					httpReq.getSession().setAttribute("usuario", usuario);
					httpResp.sendRedirect("index.html");
					return;
				}
				else{
					System.out.println("No existe ningun usuario con ese login o la password es incorrecta");
					httpResp.sendRedirect("login.html");
					return;
				}
			}
			else {
				System.out.println("No existe ningun usuario autenticado en estos momentos");
				httpResp.sendRedirect("login.html");
				return;
			}
		else {
			// con esta linea invocamos al siguiente componente de la cadena que ha establecido el web container (en base al web.xml)
			System.out.println("[SeguridadFilter] - Dando paso a la url: " + httpReq.getRequestURI());
			chain.doFilter(req, resp);
			return;
		}
	}

	public void destroy() {
		
	}

	public void init(FilterConfig config) throws ServletException {
	
	}
	
	private Usuario obtenerUsuario(String login){
		try {
			// Acceder al arbol JNDI para localizar el objeto de tipo DataSource que está registrado con el nombre "jdbc/rrhhDS" y me va a servir para pedir una conexion con la BBDD
			Context initContext = new InitialContext();
			DataSource ds  = (DataSource)initContext.lookup("java:jboss/datasources/RRHH_DS");
						
			// Al objeto datasource del paso anterior le pido una nueva conexion de BBDD
			Connection conn = ds.getConnection();
			PreparedStatement sqlConsultaUsuario = conn.prepareStatement("select * from rrhh.usuario where login=?");
			sqlConsultaUsuario.setString(1, login);
			ResultSet rsConsultaUsuario = sqlConsultaUsuario.executeQuery();
			if(rsConsultaUsuario.next()){
				Usuario usuario = new Usuario();
				usuario.setLogin(rsConsultaUsuario.getString("login"));
				usuario.setPassword(rsConsultaUsuario.getString("password"));
				return usuario;
			}
			else
				return null; // esto no está bien diseñado. Deberiamos de informar con una exception
			
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
