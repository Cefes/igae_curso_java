package org.igae.lab11.business;

import java.util.ArrayList;

import org.igae.lab11.model.Empleado;

public class EmpleadoService {

	public Empleado consultaEmpleado(String documento) {
		// Todo: Tendremos que invocar a la capa de persistencia para recuperar al empleado
		Empleado e = new Empleado();
		if("1111".equals(documento)){
			e.setNombre("pepe");
			e.setEdad(33);
			e.setSalario(2000);
		}
		if("2222".equals(documento)){
			e.setNombre("luis");
			e.setEdad(21);
			e.setSalario(1500);
		}
		
		return e;
	}
	
	public ArrayList<Empleado> consultaPlantillaCompleta(){
		Empleado e = null;
		ArrayList<Empleado> listaCompleta = new ArrayList<Empleado>();
		
		e = new Empleado();
		e.setNombre("pepe");
		e.setDocumento("1111");
		listaCompleta.add(e);
		
		e=new Empleado();
		e.setNombre("juan");
		e.setDocumento("2222");
		listaCompleta.add(e);
		
		return listaCompleta;
	}
	
}
