package org.igae.lab03.excepciones;

public class Capa3 {

	public void h1() throws NegocioException,ValidacionException {
		throw new NegocioException();
	}
	
	// al ser una "unchecked" no me obliga a poner una declaracion especifica
	public void h2() {
		throw new BBDDExcepcion();
	}
	
}
