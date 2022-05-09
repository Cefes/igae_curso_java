package org.igae.lab08;

import java.lang.reflect.InvocationTargetException;

import org.igae.lab08.persistencia.PersistenceManager;
import org.igae.lab08.modelo.Departamento;
import org.igae.lab08.modelo.Empleado;

public class App1 {

	public static void main(String[] args) throws Exception, IllegalArgumentException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		
		PersistenceManager motorPersistencia = new PersistenceManager();
		Empleado e1 = new Empleado(44, "carlos");
		Departamento d1 = new Departamento();
		
		motorPersistencia.store(d1);
		// Esta linea da error de compilacion porque Departamento no implementa
		// Serializable
		// motorPersistencia.store(d1);
	}

}
