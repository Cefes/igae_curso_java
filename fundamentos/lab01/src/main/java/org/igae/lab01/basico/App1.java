package org.igae.lab01.basico;

public class App1 {
    // main es un metodo especial (punto de entrada de una app de consola)
    // dentro de un metodo se crean variables locales
    public static void main(String[] args) {

        // 1. FASE DE CREACION/INICIALIZACION DE OBJETOS
        // declaracion de una variable o atributo --> tipo nombre
        // Cuando se crea un objeto con el operador new se reserva memoria del Heap
        // e1 y e2 son referencias (algo asi como punteros a objetos)
        Empleado e1 = new Empleado("pepe"); // declaracion y creacion en una linea
        Empleado e2;
        e2 = new Empleado("luis");


        // 2.- USO DE LOS OBJETOS
        System.out.println("Empleado e1 " + e1.getNombreEmpleado());
        System.out.println("Empleado e1 - Mes Contratacion: " + e1.getMesContratacion());
        System.out.println("Empleado e1 - Numero de empleado: " + e1.getNumeroEmpleado());
    }
}
