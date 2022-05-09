package org.igae.lab02.general.herencia.abstracta;


// Una consecuencia de ser abstract es que no puede hacer un "new" de la clase
public abstract class Padre {

	protected int dato1;
	
	public abstract void f();
	
	public void g() {
		System.out.println("codigo de g() en Padre");
	}

	
}
