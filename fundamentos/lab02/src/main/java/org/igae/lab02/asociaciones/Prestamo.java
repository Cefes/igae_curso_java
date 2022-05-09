package org.igae.lab02.asociaciones;

import java.time.LocalDate;

public class Prestamo {
    private Libro libro;
    private Cliente cliente;
    private LocalDate fecha;

    public Prestamo(Libro libro,Cliente cliente) {
        this.libro = libro;
        this.cliente = cliente;
        this.fecha = LocalDate.now();
    }
}
