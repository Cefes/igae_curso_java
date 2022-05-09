package org.igae.lab02.general.herencia.polimorfismo;

public class App1 {
    public static void main(String[] args) {
        PolizaVida pVida1 = new PolizaVida(100);
        PolizaAuto pAuto1 = new PolizaAuto(200);
        pVida1.registrarSiniestro("fallecimiento");
        pAuto1.registrarSiniestro("accidente M-30");

        // En general, para poder llamar a un metodo de una clase --> primero crear un instancia de esa clase
        TarificadorV1 tarificadorV1 = new TarificadorV1();
        tarificadorV1.tarificar();

        // La excepcion son los miembros estaticos (atributo o metodos)
        // En este caso la sintaxis ya no es objeto.metodo() sino Clase.metodo()
        TarificadorV2.tarificar(pVida1);
        TarificadorV2.tarificar(pAuto1);
        TarificadorV2.espia(pVida1);
    }
}

