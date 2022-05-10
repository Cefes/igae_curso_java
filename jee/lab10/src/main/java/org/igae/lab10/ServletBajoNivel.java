package org.igae.lab10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;

public class ServletBajoNivel implements Servlet {

	
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	
		HttpServletRequest reqHttp = (HttpServletRequest)req;
		switch (reqHttp.getMethod()) {
		case "get":
			break;
		case "post":
			break;
		default:
			break;
		}
		
	}


	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
	}


	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}


	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}


	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	
	
}
