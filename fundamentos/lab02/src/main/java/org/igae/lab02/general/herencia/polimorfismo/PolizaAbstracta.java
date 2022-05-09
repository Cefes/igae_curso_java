package org.igae.lab02.general.herencia.polimorfismo;

// abstract le dice a Java que esa clase está a medio hacer
// consecuencia --> de una clase abstracta no se puede crear objetos
public abstract class PolizaAbstracta implements Poliza {
    // private quiere decir que solamente los metodos de esta clase (ni siquiera futuros hijos) puede acceder a este atributo
    protected float prima;
    public void registrarSiniestro(String causa){
        System.out.println("Registrando siniestro. Causa=" + causa);
    }
    public PolizaAbstracta(float prima){
        this.prima = prima;
    }
}
