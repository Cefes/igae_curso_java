package org.igae.lab02.estaticos;

import static org.igae.lab02.estaticos.Util.superMetodo;

// OBJETIVO: Analizar los distintos usos de la palabra static (bloque, atributo, metodo, import)
// OBJETIVO: Analizar los metodos estaticos cuando tenemos herencia

public class App1 {
    public static void main( String[] args ) {
    	B b = new B();
        A a = b;
        
        A.f();
        B.f();
        
        b.f(); 
        a.f();
    }
}


class A { 
	// atributo de instancia
	private int dato1;
	// atributo de clase
	private static int dato2;
	
    public static void f() {
    	 // en un metodo estatico no existe "this"
    	 // dato1=10 no podemos hacer esta asignacion porque no hay objeto sobre el que hacerlo
    	 dato2=20;
         System.out.println("f() de A");
    }
}


class B extends A { 
	// el bloque static es como el "constructor" de la clase (para todo lo estatico)
	static {
		dato3=10;
	}

	private static int dato3;
	
	
    public static void f() {
    	 // Como hemos hecho un import "estatico" no nos obliga a poner Util.superMetodo();
    	 superMetodo();
         System.out.println("f() de B");
         
    }
}