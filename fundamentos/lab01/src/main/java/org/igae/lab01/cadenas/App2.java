package org.igae.lab01.cadenas;

// OBJETIVO: Concepto de cadenas variables

public class App2 {

	public static void main(String[] args) {
		
		// Thread-safe (clase segura frente a hilos quiere decir que sus metodos están sincronizados total o parcialmente)
		// Thread-safe --> Mas seguridad frente a multihilo pero peor rendimiento
		StringBuffer s1 = new StringBuffer("Hola");
		s1.insert(2, "ooooo").append(" que tal");
		System.out.println(s1);
		
		// No Thread-safe
		StringBuilder s2 = new StringBuilder("Adios");
		
		
	}

}
