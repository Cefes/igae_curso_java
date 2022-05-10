package org.igae.lab13.model;

import java.io.Serializable;

public class Empleado implements Serializable {

	// datos basicos
	private String nombre;
	private int edad;
	
	// datos puesto
	private String puesto;
	
	// datos economicos
	private double salario;
	
	
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
