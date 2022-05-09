package org.igae.lab08.modelo;

import org.igae.lab08.anotaciones.Guardable;

@Guardable
public class Empleado {
	
	private int edad;
	private String nombre;
	
	public Empleado(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	
	public int getedad() {
		return edad;
	}
	
	public String getnombre() {
		return nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
