package org.igae.lab02.interfaces;

public interface Cerrable {
	
	public void cerrar();
	
	public default void h() {
		System.out.println("f() de Clonable");
	}
}
