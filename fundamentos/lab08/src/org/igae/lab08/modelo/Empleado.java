package org.igae.lab08.modelo;

import org.igae.lab08.anotaciones.Entity;
import org.igae.lab08.anotaciones.Id;

import java.util.UUID;

@Entity
public class Empleado extends Persona {

	@Id
	private String idEmpleado;

	private int edad;
	private String nombre;
	
	public Empleado(int edad, String nombre) {
		this.idEmpleado = UUID.randomUUID().toString();
		this.edad = edad;
		this.nombre = nombre;
	}


	public String getidEmpleado() {
		return idEmpleado;
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

	public void subirSueldo(){
		//
	}
	
}
