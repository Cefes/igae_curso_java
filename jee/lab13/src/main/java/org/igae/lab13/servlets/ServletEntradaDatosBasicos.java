package org.igae.lab13.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igae.lab13.model.Empleado;

// Este es el primer servlet que se ejecuta puesto que está asi indica en los links de la pagina index.html
public class ServletEntradaDatosBasicos extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/datosBasicos.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Empleado empleado = new Empleado();
		
		empleado.setNombre(req.getParameter("nombre"));
		empleado.setEdad(Integer.parseInt(req.getParameter("edad")));
		
		req.getSession().setAttribute("atributoEmpleado", empleado);
		
		// NOTA: ej de una redireccion de servidor
		// this.getServletContext().getRequestDispatcher("/url_servlet_o_jsp").forward(req, res);
		
		// redireccion de cliente (envia al navegador un HTTP 300 + la nueva url a la que saltar)
		resp.sendRedirect("datosPuesto.accion");		
	}
	
}
