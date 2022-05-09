package org.igae.lab02.general.herencia.polimorfismo;

public class TarificadorV2 {

    // esta seria una clase con mucho comportamiento pero poca o nada estructura

    // Al hecho de tener el mismo nombre de metodo pero distinto tipo y/o numero de parametros -->  SOBRECARGA
    /*
    public static void tarificar(PolizaVida pVida){
        pVida.recalcularPrima();
    }

    public static void tarificar(PolizaAuto pAuto){
        pAuto.recalcularPrima();
    }
     */

    // Nos van a pasar como parametro de entrada un objeto/instancia de una clase "compatible" con Poliza
    // "compatible" significa que esa clase habrá heredado de Poliza
    // "compatible" tambien quiere decir que podreis usar operador de casting de tipos

    public static void tarificar(Poliza poliza){
        poliza.recalcularPrima(); // late binding (runtime)
    }

    public static void espia(Object obj){
        // instanceof es un mal nombre --> comprueba realmente si un objeto es compatible con un cierto tipo (Clase o Interface)
        if(obj instanceof Poliza) System.out.println("el objeto compatible con el tipo Poliza");
        if(obj instanceof PolizaAbstracta) System.out.println("el objeto compatible con el tipo Poliza Abstracta");
        if(obj instanceof PolizaVida) System.out.println("el objeto compatible con el tipo PolizaVida");
        if(obj instanceof PolizaAuto) System.out.println("el objeto compatible con el tipo PolizaAuto");
        if(obj instanceof Object) System.out.println("el objeto compatible con el tipo Object");
    }


}
