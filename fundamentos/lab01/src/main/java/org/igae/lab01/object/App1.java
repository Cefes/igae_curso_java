package org.igae.lab01.object;

// OBJETIVO: Comprender los metodos principales de Object y cuales tiene sentido sobreescribir

public class App1 {

	public static void main(String[] args) {
		
		Producto p1 = new Producto("mp3",200);
		Producto p2 = new Producto("mp3",200);
		Empleado e1 = new Empleado();


		if(p1==p2) System.out.println("Mismo objeto fisico");
		if(p1.equals(p2)) System.out.println("Mismo objeto de negocio");
		if(p1.equals(e1)) System.out.println("Mismo objeto de negocio");

		System.out.println(p1);
		System.out.println(e1); // saldrá un texto raro porque en Empleado no hemos sobreescrito toString()
		p1 = null;
		p2 = null;
	}

}
