package org.igae.lab12;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletChequeoHttp extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private void doWork(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<html><body>");
		
		out.println(
                "<html>\n" +
                "<head><title>Cabeceras de la request</title></head>\n"+
                "<body bgcolor = \"#f0f0f0\">\n");
        out.println("<h1>Cabeceras de la request</h1>\n");		
        out.println("<table border = \"1\">\n" +
                "<tr bgcolor = \"#949494\">\n" +
                "<th>Header Name</th><th>Header Value(s)</th>\n"+
                "</tr>\n");
 
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()) {
            String paramName = (String)headerNames.nextElement();
            out.print("<tr><td>" + paramName + "</td>\n");
            String paramValue = request.getHeader(paramName);
            out.println("<td> " + paramValue + "</td></tr>\n");
        }
        out.println("</table>");
        
        out.println("<h1 >Otros datos de la request</h1>\n");		
        out.println("<table border = \"1\">\n" +
                "<tr bgcolor = \"#949494\">\n" +
                "<th>Name</th><th>Value(s)</th>\n"+
                "</tr>\n");
        
        out.print("<tr><td>Thread-Id</td>\n");
        out.println("<td> " + Thread.currentThread().getId() + "</td></tr>\n");
        out.print("<tr><td>Context Path</td>\n");
        out.println("<td> " + request.getContextPath() + "</td></tr>\n");
        out.print("<tr><td>Metodo</td>\n");
        out.println("<td> " + request.getMethod() + "</td></tr>\n");
        out.print("<tr><td>Request URI</td>\n");
        out.println("<td> " + request.getRequestURI() + "</td></tr>\n");        
        
        out.println("</table>");
        
        out.println("<h1 >Cookies en la request</h1>\n");		
        out.println("<table border = \"1\" >\n" +
                "<tr bgcolor = \"#949494\">\n" +
                "<th>Cookie Name</th><th>Cookie Value(s)</th>\n"+
                "</tr>\n");
        Cookie[] cookies = request.getCookies();
        
        if (cookies != null)
        for (Cookie cookie : cookies) {
            out.print("<tr><td>" + cookie.getName() + "</td>\n");
            out.println("<td> " + cookie.getValue() + "</td></tr>\n");        
            	
		}
        
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
