package org.igae.lab08.persistencia;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.igae.lab08.anotaciones.Guardable;

public class PersistenceManager {

	public void store(Object objeto) throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException{
						
		// Precondicion: El objeto es guardable
		// Objetivo: objeto --> SQL
		// Ej. INSERT INTO tabla(campo1,campo2) VALUES (dato1,dato2)
		// Usamos StringBuffer porque representa a las cadenas variables
		// Un String es constante --> crearia muchos objetos intermedios --> Garbage Collector
		
				
		if(objeto.getClass().isAnnotationPresent(Guardable.class)){
					
		// Fin validacion precondicion ///////// 
		
		StringBuffer sql = new StringBuffer("INSERT INTO ");
		Class clase;
		// atributos[0],atributos[1],etc
		Field[] atributos;
		
		// Con esto tenemos la clase
		clase = objeto.getClass();
		sql.append(clase.getSimpleName() + "(");
		
		
		atributos = clase.getDeclaredFields();
		
		for (Field atributo : atributos) {
			sql.append(atributo.getName() + ",");
		}
		
		sql.deleteCharAt(sql.length()-1);
		
		sql.append(") VALUES (");

		for (Field atributo : atributos) {
			Method metodoGet;
			Object resultado;
			metodoGet = clase.getMethod("get"+atributo.getName(), null);
			// Equivalente a objeto.metodoGet() de manera no dinamica
			// Recordatorio: dentro de metodoGet objeto sera this			

			resultado=metodoGet.invoke(objeto,null);
			sql.append(resultado + ",");
		}
		
		sql.deleteCharAt(sql.length()-1);
		
		sql.append(")");
		
		System.out.println("SQL --> " + sql);
		}
	}

}
