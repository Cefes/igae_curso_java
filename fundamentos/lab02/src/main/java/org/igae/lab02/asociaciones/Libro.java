package org.igae.lab02.asociaciones;

public class Libro {
    private Autor autor;
    private String isbn;
    private double precio;

    public Libro(Autor autor,String isbn,double precio){
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
    }
}
