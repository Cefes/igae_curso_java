package org.igae.lab11.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.igae.lab11.business.EmpleadoService;
import org.igae.lab11.model.Empleado;

public class ServletConsultaPlantilla extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        EmpleadoService empleadoService = new EmpleadoService();  
        ArrayList<Empleado> listaCompletaEmpleados = empleadoService.consultaPlantillaCompleta();
        // El objeto request es el más común a la hora de pasar información entre componentes web
        request.setAttribute("plantilla", listaCompletaEmpleados); 
        this.getServletContext().getRequestDispatcher("/empleados/plantilla.jsp").forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doWork(request, response);
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doWork(request, response);
	}

}
