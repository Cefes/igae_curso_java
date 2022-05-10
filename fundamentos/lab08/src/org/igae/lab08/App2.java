package org.igae.lab08;

import org.igae.lab08.espia.Espia;
import org.igae.lab08.modelo.Empleado;

import java.util.ArrayList;

public class App2 {
    public static void main(String[] args) {
        // La funcion espiar(Object objeto) de la clase Espia recibe un Object como parametro
        // En Java tenemos un API llamada Reflection para poder obtener en tiempo de ejecucion todos los "metadatos" de un objeto
        Empleado e1 = new Empleado(30,"pepe");
        ArrayList<String> lista1 = new ArrayList<>();
        // Como el parametro de entrada es de tipo Object se produce un up-casting
        // En java el up-casting siempre es implicito --> no hay que hacer nada
        Espia.espiar(lista1);
    }
}
