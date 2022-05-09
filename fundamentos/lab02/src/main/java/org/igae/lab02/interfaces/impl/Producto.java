package org.igae.lab02.interfaces.impl;

public class Producto {

	// OJO: No pasa por proporcionar un f() que tambien tenemos en un metodo default de un interface (el de la clase tiene prioridad)
	
	public void f() {
		System.out.println("f() de Producto");
	}
	
	
	public void calcular() {
		System.out.println("calcular...");
	}
	
}
