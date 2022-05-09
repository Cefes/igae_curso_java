package org.igae.lab02.interfaces.impl;

// OBJETIVO: Comprender el uso de los interfaces (implements)
// OJBETIVO: Analizar los metodos static y default en un interface
// OBJETIVO: Analizar que ocurre cuando implementamos interfaces con un mismo metodo y ademas por herencia de clase
// OBJETIVO: Analizar el comportamiento de implentación de un interface por una clase abstract

public class App1 {

	public static void main(String[] args) {

			Producto1 p1 = new Producto1();
			Producto3 p3 = new Producto3();
			p1.f();
			p3.f();
	}

}
