package org.igae.lab14.services;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.igae.lab14.model.Book;


@Path("books")
public class BookRepository {

	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> all() {
		List<Book> listaDeLibros = Arrays.asList(new Book("El quijote",100),new Book("Momo",40));
		return listaDeLibros;
	}
}
