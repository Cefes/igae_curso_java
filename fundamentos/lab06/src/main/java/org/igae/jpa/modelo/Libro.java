package org.igae.jpa.modelo;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="Libro") // Para mapear los objetos a una tabla especifica
@NamedQuery(name="Libro.buscarTodos", query="SELECT l FROM Libro l") // JPQL
@NamedNativeQuery(
        name = "getAllLibros",
        query = "SELECT id, titulo, isbn, , editorial.id, editorial.nombre " +
                    "FROM libro, editorial",
                    resultClass=Libro.class
    ) // SQL
public class Libro {
    @Id
    @GeneratedValue // autogenerado
    private Integer id;
    @Column(name="tit") // Para mapear el atributo a una columna especifica
    private String titulo;
    private String isbn;
 
    @ManyToOne(fetch = FetchType.LAZY) // LAZY --> No se carga el objeto editorial hasta que se sea necesario. EAGER --> se carga junto con el objeto Libro
    private Editorial editorial;
 
    @ManyToOne
    private Autor autor;

    public Autor getAutor() {
        return autor;
    }
}
