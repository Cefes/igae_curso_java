package org.igae.lab01.cadenas;


// OBJETIVO: Mostrar String como objeto inmutable
// OBJETIVO: Mostrar algunos metodos de clase String
// OBJETIVO: Observar el funcionamiento del String pool

public class App1 {

	public static void main(String[] args) {
		
		// 1. Probar concepto de Pool de Strings
		String a = "abc";
		String b = "abc";
		
		//same reference
		if (a==b) {
			System.out.println("Ambas cadenas apuntan al mismo objeto"); // MOTIVO: Pool (probar con "new"/heap)
		}
		
		
		// 2. Algunos metodos/operadores de String
		String cad1 = "En un pais muy lejano";
		System.out.println(cad1.length());
		System.out.println(cad1.substring(3, 10));
		System.out.println(cad1.indexOf("pais", 1));
		System.out.println(cad1.charAt(0));
		System.out.println(cad1.replaceAll("u", "U"));
		System.out.println(cad1.toCharArray()); // devuevel char[]
		System.out.println(cad1.trim()); // elimina espacios en blanco de mas al inicio y al final
		System.out.println(cad1.getBytes()); // devuelve byte[]
		System.out.println(cad1.matches("[a-z A-Z]+")); // true
		System.out.println(String.valueOf(50)); // convierte un entero al String "50"
		System.out.println(cad1.toUpperCase()); // todo a mayusculas
		String cad2 = cad1 + " habia"; // concatenacion (no modifica cad1)
		System.out.println("Valor de cad1: " + cad1);
		// Peligro (memory leak)
		String cad3 = new String("okaoskdoas");
		cad3 = cad3 + "ada" + "erere";
		cad3 = cad3 + "asdadad";
		// Solucion (usar cadenas variables)
		StringBuffer sb = new StringBuffer("okaoskdoas");
		sb.append("ada");
		sb.append("erere");
		sb.append("asdadad");
		
	}

}
