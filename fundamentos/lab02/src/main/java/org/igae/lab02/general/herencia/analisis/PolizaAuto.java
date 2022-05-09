package org.igae.lab02.general.herencia.analisis;

public class PolizaAuto extends Poliza {
    public PolizaAuto(float prima){
        super(prima);
    }

    // En Java lo que empieza por @ se le llama anotacion
    @Override
    public void recalcularPrima() {
        // super algoritmo de recalculo de prima de Vida
        this.prima = 200;
    }
}
