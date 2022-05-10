package org.igae.lab12;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConsultaCuentas extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<html><body>");
		out.print("<h1> Datos de las cuentas</h1>");
		out.print("<h3> CCC ES44-3332-21-3456742334 --> 10.000 euros </h3>");
		out.print("<h3> CCC ES22-5621-67-7433742311 --> 130.000 euros </h3>");
        out.println("</table>");
        out.println("</body></html>");
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
