package org.igae.lab04.arrays;

// OBJETIVO: Analizar funcionamiento del array "primitivo"

public class App1 {
	
	public static void main(String[] args) {
	
		// Arrays "primitivos". Son estatico o de longitud fija
		int[] datos1 = new int[5];
		int[] datos2 = {3,4,1,2,10};
		
		datos1[0]=10;
		datos1[1]=11;
	    datos1[2]=12;
	    datos1[3]=13;
	    datos1[4]=14;
		
		for (int dato : datos1) {
			System.out.println(dato);
		}
		
		// OJO: length en esos arrays es una PROPIEDAD, no un metodo
		for (int i = 0; i < datos2.length; i++) {
			System.out.println(datos2[i]);
		}
		
	}
}
