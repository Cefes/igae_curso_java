package org.igae.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.igae.jpa.modelo.Libro;

// Tenemos varias opciones para realizar consultas en JPA
public class LibroDAO {

	public List<Libro> findLibroByCriterio(String criterio) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("introduccionJPA"); 
	        EntityManager em = emf.createEntityManager(); 
	        
	        Query query = null;
	        
	        // OPCION 1. Query JPQL
	        String jpql = "SELECT l FROM Libro l where l.id =... and l.tipo=..."; 
	        query = em.createQuery(jpql); 
	        List<Libro> resultados = query.getResultList(); 
	     
	        // OPCION 2. Named Queries
	        query = em.createNamedQuery("Libro.buscarTodos");
	        resultados = query.getResultList();
	        
	        // OPCION 3. Native Queries (con SQL)
	        String sql = "SELECT * FROM LIBRO";
	        query = em.createNativeQuery(sql);
	        // ...
	        
	        return resultados;
	     
	}
	
}
