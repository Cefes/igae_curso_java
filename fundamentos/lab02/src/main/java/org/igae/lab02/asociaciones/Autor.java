package org.igae.lab02.asociaciones;

import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nombre;
    // atributo de asociacion (relacion 1-N)
    private List<Libro> libros;

    public Autor(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // metodo de asociacion
    public void escribeLibro(Libro libro){
        this.libros.add(libro);
    }
}
