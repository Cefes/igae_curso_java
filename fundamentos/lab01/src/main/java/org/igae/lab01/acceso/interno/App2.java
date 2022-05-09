package org.igae.lab01.acceso.interno;

import org.igae.lab01.acceso.Test1;

// OBJETIVO: Comprender que "default" solo da visibilidad a clases del mismo paquete, no un subpaquete
public class App2 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		t1.dato1 = 10;
		// no podemos acceder a dato2 porque es privado
		// t1.dato2 = 20;
		// no podemos acceder a dato3 porque App1 NO está en el mismo paquete que Test1
		// t1.dato3 = 30;
	}

}
