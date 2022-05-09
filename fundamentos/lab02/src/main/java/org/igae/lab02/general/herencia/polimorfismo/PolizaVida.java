package org.igae.lab02.general.herencia.polimorfismo;

public class PolizaVida extends PolizaAbstracta {
    public PolizaVida(float prima){
        super(prima);
    }

    @Override
    public void recalcularPrima() {
        // super algoritmo de recalculo de prima de Vida
        this.prima = 100;
        System.out.println("recalculo de prima de Poliza de Vida");
    }

}

// Ahora la jerarquia de tipos sería asi:

/*
    Poliza (interface)
    PolizaAbstracta (clase abstracta con implements del interface)
    PolizaVida (herencia de la abstracta)

 */

// Otro ejemplo si solo hubieran compartido comportamiento

/*

    Poliza (interface)
    PolizaVida (implements del interface)

 */