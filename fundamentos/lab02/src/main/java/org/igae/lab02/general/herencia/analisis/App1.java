package org.igae.lab02.general.herencia.analisis;

public class App1 {
    public static void main(String[] args) {
        PolizaVida pVida = new PolizaVida(100);
        PolizaAuto pAuto = new PolizaAuto(200);
        pVida.registrarSiniestro("fallecimiento");
        pAuto.registrarSiniestro("accidente M-30");
    }
}
