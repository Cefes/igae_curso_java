package org.igae.lab02.anotaciones;

public class Producto {

	@Seguridad(rol="ADMIN")
	public void metodoNegocio1() {
		// ...
	}
	
	@Seguridad(rol="USER")
	public void metodoNegocio2() {
		// ...
	}
	
}
