package org.igae.lab03.excepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Capa1 {
	private static final Logger LOGGER = LogManager.getLogger(Capa1.class);

	private Capa2 capa2 = new Capa2();
	
	// la capa2 le deja la responsabilidad de tratar la excepcion a la capa1
	public void f11() {
		try {
			capa2.g11();
		} catch (NegocioException|ValidacionException e) {
			LOGGER.debug("Excepcion capturada en capa1");
		}
	}
	
	// en la capa1 no hay que hacer nada pero si hay un error en capa2 no me entero (ni se eleva)
	public void f12() {
		capa2.g12();
	}

	// en la capa1 no hay que hacer nada pero si se eleva el error (hacia un manejador general por ej)
	public void f2() {
		capa2.g2();
	}
	
	public void f3() {
		// La nueva sentencia try-with-resources libera automaticamente el recurso "writer" llamando a su metodo close()
		// Para que esto funcione el objeto tiene que pertenecer a una clase que implemente el interface Autocloseable
		try (PrintWriter writer = new PrintWriter(new File("test.txt"))) {
		    writer.println("Hello World");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	
}
