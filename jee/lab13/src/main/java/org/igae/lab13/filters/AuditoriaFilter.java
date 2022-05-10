package org.igae.lab13.filters;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.time.Instant;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.sql.DataSource;


public class AuditoriaFilter implements Filter {

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest httpReq = (HttpServletRequest)req;
		guardarPath(httpReq.getRequestURL().toString());
		
		// con esta linea invocamos al siguiente componente de la cadena que ha establecido el web container (en base al web.xml)
		chain.doFilter(req, resp);
	}

	public void destroy() {
		
	}

	public void init(FilterConfig config) throws ServletException {
	
	}
	
	private void guardarPath(String path){
		try {
			// Acceder al arbol JNDI para localizar el objeto de tipo DataSource que está registrado con el nombre "jdbc/rrhhDS" y me va a servir para pedir una conexion con la BBDD
			Context initContext = new InitialContext();
			DataSource ds  = (DataSource)initContext.lookup("java:jboss/datasources/RRHH_DS");
			
			
			// Al objeto datasource del paso anterior le pido una nueva conexion de BBDD
			Connection conn = ds.getConnection();			
			Timestamp now = Timestamp.from(Instant.now());
			PreparedStatement insertAuditoria= conn.prepareStatement("insert into rrhh.auditoria(path,fecha) values(?,?)");
			insertAuditoria.setString(1, path);
			insertAuditoria.setTimestamp(2, now);
			insertAuditoria.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
