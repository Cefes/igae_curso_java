package org.igae.lab01.acceso;

// OBJETIVO: Analizar los distintos modificadores de acceso: public, private y default(package)
// OBJETIVO: Uso de final para declarar una constante (a nivel de cada objeto)

public class App1 {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		
		// podemos acceder a dato1 porque es publico (aunque rompa el principio de encapsulación)
		t1.dato1 = 10;
		
		// no podemos acceder a dato2 porque es privado
		// t1.dato2 = 20;
		
		// podemos acceder a dato3 porque App1 está en el mismo paquete que Test1
		t1.dato3 = 30;
		
		// no podemos modificar dato4 porque está declarado como final
		// t1.dato4 = 15;
		
	}
	
}
