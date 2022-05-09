package org.igae.lab08.anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Las anotaciones se crearon para poder dotar de m�s semantica a: UNA CLASE(TYPE), UN METODO, UN ATRIBUTO (FIELD), UN PARAMETRO DE ENTRADA, ...
// Es muy tipico que se hayan utilizado como mecanismo de configuracion directamente en el codigo (en lugar de en ficheros XML como se hacia en los 90)
// IMPORTANTE: las anotaciones no son comentarios!!! son parte de los metadatos que est�n dentro del .class (es decir, por reflexion se pueden consultar)
// Un ejemplo podria ser configurar el rol necesario para poder ejecutar ciertos metodos de una clase
// Ej.
//		@Seguridad(rol="admin")
//		@Configuracion(logging="false")
//		public void borrarFacturasPendientesDePago(...) { ... }
//

//El target sirve para especificar que tipo de cosas vas a anotar (atributo, metodo, clase, parametro,...)
@Target(value=ElementType.TYPE) 

//Cuando ponemos RUNTIME las anotaciones est�n disponibles en tiempo de ejecucion. Una excepcion es la anotacion @Override (cuyo target es SOURCE)
// Es decir, con RUNTIME la anotacion esta en el fichero java, luego en el .class del disco y m�s tarde en el .class en memoria
//			 	 CLASS la anotacion estar� en el fichero java y luego en el .class del disco (pero no cuando este se cargue en memoria)
//				 SOURCE la anotacion solo estar� en el fichero java
@Retention(value=RetentionPolicy.RUNTIME) 
public @interface Guardable {

}
