package org.igae.jpa;

// Metodos importantes del interface EntityManager
// 
// 1. persist(obj) almacenar nuevas entidades en la BBDD
// 2. contains(obj) comprueba si una entidad está “manejada” por el EM
// 3. find(pk) localizar una entidad a través de un clave primaria
// 4. flush() provoca que los cambios pendientes del EM se sincronicen en la BBDD
// 5. merge(obj) convierte una entidad “no manejada” por el EM en “manejada”
// 6. remove(ojb) eliminar una entidad de la BBDD
//

import java.io.IOException;

import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.persistence.*;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;

import org.igae.jpa.modelo.EmpleadoInterno;

public class App1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager entityManager = emf.createEntityManager();

		EmpleadoInterno e = new EmpleadoInterno();
		e.setName("pepe");
		e.setEdad(44);
		e.setDocumento("34888821G");

		try {
			// iniciamos la transaccion
			entityManager.getTransaction().begin();
			// en este punto el entityManager usando el API de la reflexion realizará una instrospeccion sobre e
			// y generará dinamicamente la sentencia insert into correspondiente
			entityManager.persist(e);
			// consolidamos los cambios
			entityManager.getTransaction().commit();
		} catch (Exception ex) {
			 try {
				 entityManager.getTransaction().rollback();
			    } catch (Exception exe) {
			        System.out.println("Rollback failed: "+exe.getMessage());
			    }
		}
	}

}
