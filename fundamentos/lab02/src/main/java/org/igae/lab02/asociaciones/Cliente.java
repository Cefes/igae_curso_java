package org.igae.lab02.asociaciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cliente {
    // atributo de asociacion (relacion 1-N)
    private List<Prestamo> prestamos;

    public Cliente() {
        prestamos = new LinkedList<>();
    }

    // metodo de asociacion
    public void realizarPrestamo(Prestamo prestamo) {
        this.prestamos.add(prestamo);
    }

}
