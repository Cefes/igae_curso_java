package org.igae.jpa.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//Si no se pone esta anotacion el motor de persistencia infiere que la tabla se llamará igual que la clase
@Table(name = "empleado_interno") 
public class EmpleadoInterno implements Serializable {
	
	private long empleadoId;
	private String name;
	private String documento;
	private int edad;

	@Id
	@GeneratedValue
	public long getEmpleadoId() {
		return empleadoId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="nif")
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setEmpleadoId(long empleadoId) {
		this.empleadoId = empleadoId;
	}



}
