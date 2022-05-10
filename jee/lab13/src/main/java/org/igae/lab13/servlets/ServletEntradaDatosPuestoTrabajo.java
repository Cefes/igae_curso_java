package org.igae.lab13.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.igae.lab13.model.Empleado;

public class ServletEntradaDatosPuestoTrabajo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/datosPuesto.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		HttpSession sesion = req.getSession();
		
		Empleado empleado = null;
		
		empleado = (Empleado)sesion.getAttribute("atributoEmpleado");
		empleado.setPuesto(req.getParameter("puesto"));
		
		resp.sendRedirect("datosEconomicos.accion");
	}
	

}
