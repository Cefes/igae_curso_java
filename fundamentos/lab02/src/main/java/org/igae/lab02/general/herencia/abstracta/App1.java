package org.igae.lab02.general.herencia.abstracta;

public class App1 {

	public static void main(String[] args) {
		Hija h1 = new Hija();
		h1.dato1 = 30; // OJO: podemos acceder al atributo "protegido" desde cualquier clase del mismo paquete
	}

}
