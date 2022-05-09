package org.igae.lab02.general.herencia.interno;

public class App1 {

	public static void main(String[] args) {
		Hija h1 = new Hija();
		// h1.dato1 = 30; // OJO: no podemos acceder al atributo "protegido" porque este App1 está en otro paquete
	}

}
