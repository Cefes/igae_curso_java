package org.igae.lab11.servlets.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class AuditoriaFilter implements Filter{

	protected FilterConfig config;
	
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String requestURI = null;
		
		long inicio = System.currentTimeMillis();
		// con esta llamada a doFilter(...) provocamso que siga ejecutandose la cadena de filtros...
		// ...y sino hay más se invocará al servlet/jsp
		chain.doFilter(request, response);
		
		long duracion = System.currentTimeMillis() - inicio;
		
		if (request instanceof HttpServletRequest) {
			requestURI = ((HttpServletRequest) request).getRequestURI();
		    }
		
		config.getServletContext().log("La peticion al recurso: " + requestURI + " ha llevado: " + duracion + " ms");
	}

	public void destroy() {
		
	}
	
}
