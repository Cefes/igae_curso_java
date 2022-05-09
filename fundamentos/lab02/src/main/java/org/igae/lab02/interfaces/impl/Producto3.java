package org.igae.lab02.interfaces.impl;

import org.igae.lab02.interfaces.Cerrable;
import org.igae.lab02.interfaces.Clonable;

public class Producto3 implements Clonable, Cerrable {

	// Hemos podido sobreescribir el metodo default de Clonable (OJO: el estatic no se puede)
	@Override
	public void f() {
		System.out.println("f() de Producto3");
	}

	
	@Override
	public void clonar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cerrar() {
		// TODO Auto-generated method stub
		
	}

	
	// OJO: Si hacemos un override de metodo default que está presente en los dos interfaces NO da error
	// La explicación es sencilla, el compilador ahora sabe que manda el h() de Producto3
	@Override
	public void h() {
		// Y dentro del metodo podrias invocar al que quisieras de los dos h() que has "heredado" (o a ninguno)
		Cerrable.super.h();
		Clonable.super.h();
	}

	
	
}
