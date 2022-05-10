package org.igae.lab13.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.igae.lab13.model.Empleado;

public class ServletConfirmacionAltaEmpleado extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Empleado empleado = (Empleado)req.getSession().getAttribute("atributoEmpleado");
		
		resp.setContentType("text/html");
		
		resp.getWriter().println("<html><body>");
		resp.getWriter().println("<h1> Resumen del alta del empleado </h1>");
		resp.getWriter().println("<ul>");
		resp.getWriter().println("<li>" + empleado.getNombre() + "</li>");
		resp.getWriter().println("<li>" + empleado.getEdad() + "</li>");
		resp.getWriter().println("<li>" + empleado.getPuesto() + "</li>");
		resp.getWriter().println("<li>" + empleado.getSalario() + "</li>");
		resp.getWriter().println("</ul>");
		resp.getWriter().println("</body></html>");
		
		guardarEmpleado(empleado);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
	
	private void guardarEmpleado(Empleado empleado){
		try {
			// Acceder al arbol JNDI para localizar el objeto de tipo DataSource que está registrado con el nombre "jdbc/rrhhDS" y me va a servir para pedir una conexion con la BBDD
			Context initContext = new InitialContext();
			DataSource ds  = (DataSource)initContext.lookup("java:jboss/datasources/RRHH_DS");
			
		
			
			// Al objeto datasource del paso anterior le pido una nueva conexion de BBDD
			Connection conn = ds.getConnection();
			PreparedStatement insertEmpleado = conn.prepareStatement("insert into rrhh.empleado(idempleado,nombre,edad,puesto,salario) values(?,?,?,?,?)");
			
			insertEmpleado.setInt(1, (int)Math.round(Math.random()*1000));
			insertEmpleado.setString(2,empleado.getNombre());
			insertEmpleado.setInt(3, empleado.getEdad());
			insertEmpleado.setString(4, empleado.getPuesto());
			insertEmpleado.setDouble(5, empleado.getSalario());
			
			insertEmpleado.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
