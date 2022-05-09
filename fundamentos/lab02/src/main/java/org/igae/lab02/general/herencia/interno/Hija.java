package org.igae.lab02.general.herencia.interno;

import org.igae.lab02.general.herencia.Padre;

public class Hija extends Padre{

	public Hija() {
		super();
		// ...
		// podemos acceder al atributo heredado por estar "protegido" para la subclases (aunque estas esten en otro paquete)
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

 
}