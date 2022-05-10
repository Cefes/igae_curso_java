package org.igae.lab13.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


import org.igae.lab13.model.Empleado;

public class ServletConsultaEmpleadosHTML extends HttpServlet {
	
	// Ojo!!! de un servlet solo se crea un objeto. Si tuviera un atributo, este sería "visible" por todos los Thread --> posibles problemas de concurrencia)
	// Solucion al problema anterior --> Si el atributo representa algo "constante" no pasa nada. En otro caso, no definir ese atributo !!
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Las variables locales se crean para cada Thread (es decir, no se comparten entre ellos-->no hay problemas de concurrencia)
		try {
			// Acceder al arbol JNDI para localizar el objeto de tipo DataSource que está registrado con el nombre "jdbc/rrhhDS" y me va a servir para pedir una conexion con la BBDD
			Context initContext = new InitialContext();
			DataSource ds  = (DataSource)initContext.lookup("java:jboss/datasources/RRHH_DS");
			
			// Al objeto datasource del paso anterior le pido una nueva conexion de BBDD
			Connection conn = ds.getConnection();
			PreparedStatement sqlConsultaEmpleados = conn.prepareStatement("select * from rrhh.empleado");
			ResultSet rsConsultaEmpleados = sqlConsultaEmpleados.executeQuery();
			resp.getWriter().println("<html><body><h1>Lista de empleados</h1><table>");
			while(rsConsultaEmpleados.next())
			{
				Empleado empleado = new Empleado();
				empleado.setNombre(rsConsultaEmpleados.getString("nombre"));
				empleado.setEdad(rsConsultaEmpleados.getInt("edad"));
				empleado.setPuesto(rsConsultaEmpleados.getString("puesto"));
				empleado.setSalario(rsConsultaEmpleados.getDouble("salario"));
				resp.getWriter().println("<tr><td>"+empleado.getNombre()+"</td><td>"+empleado.getEdad()+"</td><td>"+empleado.getPuesto()+"</td><td>"+empleado.getSalario()+"</td></tr>");
			}
			
			resp.getWriter().println("</table></body></html>");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
}
