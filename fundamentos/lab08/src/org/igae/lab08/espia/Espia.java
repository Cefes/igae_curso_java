package org.igae.lab08.espia;

public class Espia {

	public static void espiar(Object objeto){

		System.out.println("Informe de las caras/tipos por los que puede pasar objeto");
		System.out.println("---------------------------------------------------------");
		
		Class clase;
		
		clase = objeto.getClass();
		
		System.out.println(clase.getName());
		
		Class[] interfaces = clase.getInterfaces();
		
		for (Class interfase : interfaces) {
			System.out.println(interfase.getName());
			// ahora obtenemos los superinterfaces que puediera tener cada uno de ellos
			Class superInterface = interfase.getSuperclass();
			while(superInterface != null){
				System.out.println(superInterface.getName());
				superInterface = superInterface.getSuperclass();
			}
		}
		
		clase = clase.getSuperclass();
		
		while(clase != null){
			System.out.println(clase.getName());
			
			interfaces = clase.getInterfaces();
			
			for (Class interfase : interfaces) {
				System.out.println(interfase.getName());
				// ahora obtenemos los superinterfaces que puediera tener cada uno de ellos
				Class superInterface = interfase.getSuperclass();
				while(superInterface != null){
					System.out.println(superInterface.getName());
					superInterface = superInterface.getSuperclass();
				}
			}
			clase = clase.getSuperclass();
		}
	}
	
	
}
