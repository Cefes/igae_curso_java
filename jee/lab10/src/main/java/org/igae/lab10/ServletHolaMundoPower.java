package org.igae.lab10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class ServletHolaMundoPower extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	   resp.setContentType("text/plain");
	   PrintWriter salida = resp.getWriter();
	   salida.println("Hola Mundo");
	   salida.println("Hashcode del objeto servlet: " + this.hashCode());
	   salida.println("Id del hilo de ejecucion que pasa por aqui: " + Thread.currentThread().getId());
	   resp.addCookie(new Cookie("dato", "1234"));
	
	   HttpSession sesionDelUsuario = req.getSession(true); // por cada usuario conectado se crea una sesion
	   sesionDelUsuario.setAttribute("producto", "ssd 128gb");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

	
	
}
