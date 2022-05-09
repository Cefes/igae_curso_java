package org.igae.lab02.asociaciones;

public class App1 {

    public static void main(String[] args) {
        Autor a1 = new Autor("pepe");
        Autor a2 = new Autor("carlos");
        Libro l1 = new Libro(a1,"titulo ZZZZZa",100);
        Libro l2 = new Libro(a1,"titulo ZZZZZb",110);
        Libro l3 = new Libro(a1,"titulo ZZZZZc",120);
        Libro l4 = new Libro(a2,"titulo ZZZZZd",90);

        Cliente c1 = new Cliente();
        Prestamo pr1 = new Prestamo(l1,c1);
        Prestamo pr2 = new Prestamo(l2,c1);
        // Siempre interesa bi-direccional ?
        c1.realizarPrestamo(pr1);
        c1.realizarPrestamo(pr2);
    }

}
