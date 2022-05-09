package org.igae.lab02.anotaciones;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Retention(RUNTIME) // Esta anotacion estará disponible (por reflexion) en el bytecode de la clase (en memoria)
@Target(METHOD) // Nos indica que solo podemos usar esta anotacion sobre un metodo
public @interface Seguridad {
	public String rol();
}
