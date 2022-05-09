package org.igae.lab03.excepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Capa2 {

	private static final Logger LOGGER = LogManager.getLogger(Capa2.class);

	private Capa3 capa3 = new Capa3();
	
	// opcion1. permitir que se eleve al llamante
	public void g11() throws NegocioException,ValidacionException{
		capa3.h1();
	}
	
	// opcion2. tratar la excepcion en esta capa
	public void g12() {
		try {
			capa3.h1();
		} catch (NegocioException|ValidacionException e) {
			LOGGER.debug("Excepcion capturada en capa2");
		} finally {
			//este bloque se ejecutará siempre (se hay producido error o no)
		}
	}

	
	public void g2() {
		// no me obliga a capturar nada al ser "not-checked"
		capa3.h2();
	}
	
}
