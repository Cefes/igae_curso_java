package org.igae.lab02.general.herencia;

public class Hija extends Padre{

	public Hija() {
		// Invocation of a superclass constructor must be the first line in the subclass constructor
		super();
		// ...
		// podemos acceder al atributo heredado por estar "protegido" para la subclases
		dato1=10;
	}
	
	@Override
	public void f() {
		// codigo muy interesante otra vez (mas que el del padre) --> Sobreescritura TOTAL (sustitucion)
	}

	@Override
	public void g() {
		// codigo un poco interesante que necesita del papi --> Sobreescributra PARCIAL (ampliacion)
		// ...
		// ...
		super.g();
	}
	
	// sobrecarga del metodo calcular
	
	public void calcular() {
		
	}
	
	public void calcular(int a) {
		
	}
	
	public void calcular(int a,int b) {
		
	}
	
	
 
}