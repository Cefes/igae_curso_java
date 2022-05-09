package org.igae.lab02.interfaces;

public interface Clonable {
	
	public default void f() {
		System.out.println("f() de Clonable");
	}
	
	
	public static void g() {
		System.out.println("g() de Clonable");
	}
	
	public void clonar();
	public void cerrar();
	
	public default void h() {
		System.out.println("f() de Clonable");
	}
	
}
