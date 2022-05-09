package org.igae.lab01.basico;

import java.util.Date;
import java.util.UUID;

public class Empleado {

    // Zona de atributos
    // Un atributo está declarado directamente dentro de la clase de turno
    // Al no tener metodo set lo dejamos de solo lectura
    private String numeroEmpleado;
    private String nombreEmpleado;

    //v1
    // Ej. dd/MM/yyyy
    private String fechaContracion;

    //v2
    private int dia;
    private int mes;
    private int año;

    //v3
    private Date fechaContrato;

    // Para poder inicializar con datos a un objeto de esta clase existen dos metodos
    //
    //  1.- Metodos constructores
    //  2.- Metodos get/set (sirve para algo mas)

    // El constructor es un metodo que se invocará automaticamente cuando se ejecute --> new Empleado("....")
    public Empleado(String paramNombre) {
        // this es una autoreferencia al objeto "actual". En nuestro codigo de App1 en un momento dado
        // this hara referencia a e1 y en otro momento a e2
        this.nombreEmpleado = paramNombre;
        this.numeroEmpleado = UUID.randomUUID().toString();
    }

    // Zona de getters y setters
    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    // Zona de metodos de logica
    public int getMesContratacion(){
        // v1
            // return fechaContracion.substring(3,4);
        // v2
            // return mes;
        // v3
            // return fechaContrato.getMonth();
        return 0;
    }

}
