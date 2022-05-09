package org.igae.lab02.general.herencia.abstracta;

public class Hija extends Padre{

	public Hija() {
		super();
		// ...
		// podemos acceder al atributo heredado por estar "protegido" para la subclases
		dato1=10;
	}

	@Override
	public void f() {
		System.out.println("f() en Hija");		
	}
	
	
}