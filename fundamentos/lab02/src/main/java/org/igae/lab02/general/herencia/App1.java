package org.igae.lab02.general.herencia;

// OBJETIVO: Comprender las propiedades de una clase abstracta
// OBJETIVO: Analizar la visibilidad "protected"
// OBJETIVO: Comprender el concepto de sobrecarga de metodos

public class App1 {

	public static void main(String[] args) {
		Hija h1 = new Hija();
		h1.f();
		h1.dato1 = 30; // OJO: podemos acceder al atributo "protegido" desde cualquier clase del mismo paquete
	}

}
