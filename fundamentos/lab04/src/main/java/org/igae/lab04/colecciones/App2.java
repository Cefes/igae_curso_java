package org.igae.lab04.colecciones;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

// OBJETIVO: Analizar las colecciones de tipo Map (OJO: que no hereda de Collection!!)

// Metodos importantes en este Interface

/*
* Map --> get(key), keySet(), put(key,valor), remove(key), size(), values(), entrySet()
*/

public class App2 {

	public static void main(String[] args) {
		
		// HashMap NO es Thread-safe y admite nulos (1 como clave y multiples en los valores). Hereda de AbstractMap
		HashMap<Integer, String> indiceDePersona = new HashMap<>();
		// Hashtable es Thread-safe y no admite nulos (ni en claves ni en valores). Hereda de Dictionary
		Hashtable<Integer, String> indiceDeProductos = new Hashtable<>();
		
		indiceDePersona.put(777, "pepe");
		indiceDePersona.put(222, "luis");
		indiceDePersona.put(333, "juan");
		indiceDePersona.put(444, "carlos");
		
		// Suponer que internamente la tabla Hash tiene 255 entradas (de 0 a 254)
		
		// Se aplica la funcion hash [key mod 255] (resto de la division) sobre las keys
		
		// Ej. Key=1000 --> Hash(1000 mod 255)=235
		// Ej. Key=255 --> Hash(...) = 0 (colision)
		// Ej. Key=510 --> Hash(...) = 0 (colision)
		
		Set<Integer> claves = indiceDePersona.keySet();
		
		for (Integer clave : claves) {
			System.out.println("Clave: " + clave);
		}
		
		Collection<String> valores = indiceDePersona.values();
	
		for (String valor : valores) {
			System.out.println("Valor: " + valor);
		}
		
		
	}
	
}
