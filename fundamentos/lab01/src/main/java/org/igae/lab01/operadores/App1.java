package org.igae.lab01.operadores;

// Comentario de una linea

/* Comentario de una linea */


/* 
 * Comentario de
 * varias
 * lineas
 * 
 */

/** 
 * 
 * Documentacion para la herramienta JavaDoc
 * 
 * @author miegimolle
 *
 */

// OBJETIVO: Presentar tipos de datos primitivos
// OBJETIVO: Presentar operadores

public class App1 {

	public static void main(String[] args) {
	
		// Un identificador COMIENZA por una letra, un carácter de subrayado (_) o un carácter de dólar ($).
		// Los SIGUIENTES caracteres pueden ser también dígitos. 
		// Pero NO pueden emplearse ESPACIOS u otros caracteres como el signo de interrogación (?) o el signo del tanto por ciento (%).
		
		// 1. Tipos primitivos
		
		// float (32bit precision simple IEEE 754), double (64bit precision doble IEEE 754), boolean, char (16bit UNICODE), 
		// byte (8bit con signo), int(32bit con signo), short(16 bit con signo), long(64 bit con signo)
		int dato1=10;
		char letra='a';
		float dato2=123.3f;
		double dato3=1.234e2; // notacion cientifica
		long creditCardNumber = 1234_5678_9012_3456L; // a partir de Java7 se puede usar "_" para mejorar la legibilidad
	
		// 2. Operadores
		
		// a) Aritmeticos
		
		// - , + , / (division entera), *, % (resto)
		// ++variable(incremento previo a usar la variable),variable++(incremento posterior a usar la variable)
		// variable+=valor --> variable = variable + dato;
		
		int dato4 = 20;
		System.out.println("7/2 = " + 7/2); // 3
		System.out.println("7%2 = " + 7%2); // 1
		System.out.println("(dato4++) = " + dato4++); // 20
		System.out.println("(++dato4) = " + ++dato4); // 22
		dato4+=20;
		System.out.println("(dato4+=) = " + dato4); // 42
		
		// b) Comparacion
		
		// ==, != (distinto), <, >, <=, >= 
			
		// c) Nivel de bit
		
		// ~ (complemento),  | (or binario), ^ (xor binario), & (and binario)
		System.out.println("~6 = " + ~6); // -7 (los negativos se trata en complemento a 2)
		
		// >> (desplazamiento a derecha con signo segun operando, por la izquierda siempre entra el bit mas significativo anterior)
		// >>> (idem al anterior pero ahora siempre entra un CERO por la izquierda)
		// << (desplazamiento a izquierda sin signo segun operando, por la derecha siempre entra un CERO)
		
		// d) Logicos o booleanos
		
		// ! (not logico), || (or logico cortociruito), && (and logico)
		// ?: (if en linea)
		
		int a = 5;
        int b = -10;
 
        // left shift operator
        // 0000 0101<<2 =0001 0100(20)
        // similar to 5*(2^2)
        System.out.println("a<<2 = " + (a << 2));
 
        // right shift operator
        // 0000 0101 >> 2 =0000 0001(1)
        // similar to 5/(2^2)
        System.out.println("b>>2 = " + (b >> 2));
 
        // unsigned right shift operator
        System.out.println("a>>>2 = " + (a >>> 2));
		
		// check si un objeto es compatible con un cierto tipo (instanceof))
        String cad = "Hello";
        if(cad instanceof String) System.out.println("String compatible!!");
        if(cad instanceof CharSequence) System.out.println("CharSequence compatible!!");
        if(cad instanceof Object) System.out.println("Object compatible!!");
               
        // if(cad instanceof Integer) System.out.println("String compatible!!"); el compilador no te deja ni siquiera porque no hay opcion
        
	}

}
