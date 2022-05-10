package org.igae.lab10;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCalculadora extends HttpServlet {

	// Para invocar a este metodo vamos a usar el esquema http://localhost:8080/<app>/calculadora?param1=100&param2=200
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url_param1 = req.getParameter("param1");
		String url_param2 = req.getParameter("param2");
		int param1 = Integer.parseInt(url_param1);
		int param2 = Integer.parseInt(url_param2);
		int resultado = param1 + param2;
		resp.setContentType("application/json");
		// {"resultado":300}
		resp.getWriter().write("{");
		resp.getWriter().write("\"resultado\":"+resultado);
		resp.getWriter().write(",");
		resp.getWriter().write("\"hashCode de la instancia de mi servlet\":"+this.hashCode());
		resp.getWriter().write(",");
		resp.getWriter().write("\"Id del hilo que está pasando/ejecutando este doGet...\":"+Thread.currentThread().getId());
		resp.getWriter().write("}");
	}
	
}
