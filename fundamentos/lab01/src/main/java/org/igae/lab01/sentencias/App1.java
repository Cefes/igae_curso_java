package org.igae.lab01.sentencias;

// OBJETIVO: Presentar las sentencias principales: for, if, switch,...

public class App1 {

	public static void main(String[] args) {
		int a,b;
		a=4;
		b=1;
		
		// Las llaves de bloque no son necesarias si solo hay una sentencia
		if(a>b) 
			System.out.println("a mayor que b");
		else 
			System.out.println("b mayor que a");
			
		// sintaxis general for(inicio;comparacion;incremento)
		
		// inicio --> solo se ejecuta una vez antes de empezar las iteraciones
		// comparacion --> expresion que se evalua al inicio de cada vuelta (si da false termina el bucle)
		// incremento --> se ejecuta despues de cada iteración (incremento positivo o negativo)
		
		for(int i=0;i<10;i++) {
			if(i % 2 == 0) continue; // continue termina que la iteracion actual y provoca que empiece la siguiente
			System.out.println("Valor de i " + i);
		}
		
		// el switch funciona con byte,short,char,int (y sus wrappers correspondientes), con Enum y con String
		int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break; // sin break todos los demas case despues de aquel que haga match se ejecutarían
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";
                     break;
            case 9:  monthString = "September";
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);
     
        int count = 1;
        System.out.println("while....");
        while (count < 11) {
        	if (count == 6) break; // break provoca que nos salgamos completamente del while
            System.out.println("Count is: " + count);
            count++;
        }
        
        
        count = 1;
        System.out.println("do while....");
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
        
	}
}
