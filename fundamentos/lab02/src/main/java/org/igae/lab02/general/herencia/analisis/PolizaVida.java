package org.igae.lab02.general.herencia.analisis;

public class PolizaVida extends Poliza {
    public PolizaVida(float prima){
        super(prima);
    }

    @Override
    public void recalcularPrima() {
        // super algoritmo de recalculo de prima de Vida
        this.prima = 100;
    }

}
