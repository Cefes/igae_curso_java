package org.igae.lab02.general.herencia.polimorfismo;

public class PolizaAuto extends PolizaAbstracta {
    public PolizaAuto(float prima){
        super(prima);
    }

    // En Java lo que empieza por @ se le llama anotacion
    @Override
    public void recalcularPrima() {
        // super algoritmo de recalculo de prima de Vida
        this.prima = 200;
        System.out.println("recalculo de prima de Poliza de Auto");
    }
}
