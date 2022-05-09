package org.igae.lab03.excepciones;

// OBJETIVO: Presentar la forma de crear excepciones (checked y not-checked)
// OBJETIVO: Analizar los elementos para capturar excepciones (try-catch y throws)

public class App1 {

	public static void main(String[] args) {
		// Para las unchecked exception es muy comun crear un manejador general de excepcion aqui
		// Es decir, un try-catch para que no se nos cuele nada
		Capa1 capa1 = new Capa1();
		capa1.f11();
	}

}
