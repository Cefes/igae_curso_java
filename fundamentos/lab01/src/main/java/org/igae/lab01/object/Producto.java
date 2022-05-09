package org.igae.lab01.object;

// Una clase Java, aunque no lo especifiques, hereda de Object
public class Producto {

	private String descripcion;
	private double precio;
	
	// si no especificas constructor el sistema te crea uno por defecto
	// pero si defines uno propio el sitema ya no lo crea
	public Producto(String descripcion, double precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}
	
	// Existen otros metodos interesantes que se heredan de la clase Object
	// hashCode(), wait(), notify(), notifyAll(), getClass() y clone()
	
	@Override // esta anotacion la usa el compilador para ver si has escrito bien esta sobreescritura
	public String toString() {
		return "Producto [descripcion="+this.descripcion+",precio="+precio+"]";
	}
	
	// Lo va a ejecutar el sistema cuando el objeto sea eliminado por el GC (son sus ultimas voluntades)
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Hasta luego Mari Carmen !");
	}
	
	// Como el "==" solo compara referencias es muy tipico implementar el equals a nivel de negocio en algunas clases
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (!(obj instanceof Producto)) return false; // no serían cosas comparables
		// Una vez que estoy seguro que obj es un objeto de la clase Producto tengo que hacer un casting (conversion de tipos)
		Producto p = (Producto)obj;
		return this.precio==p.precio && this.descripcion==p.descripcion;
	}
	
}
