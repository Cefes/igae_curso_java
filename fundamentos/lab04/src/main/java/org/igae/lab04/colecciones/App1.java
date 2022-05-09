package org.igae.lab04.colecciones;
import java.util.*;
import java.util.stream.Collectors;

// OBJETIVO: Analizar las clases que están debajo de la jerarquia Iterable --> Collecction -->[ List --> Vector --> Stack, Queue-->Deque y Set-->SortedSet ]

// Metodos importantes en estos Interfaces

/*
 * Iterable --> iterator()
 * Collection --> add(E), size(), toArray(), clear(), contains(obj), stream(), isEmpty()
 * List --> add(index,E),set(index,E),get(index),remove(index),indexOf(obj),subList(index,index),sort(Comparator)
 * Set --> nada significativo
 * Queue --> add(E), element() consulta la cabeza, peek() es un element() mejorado, offer(E) es un add(E) mejorado, poll() retorna y elimina la cabeza
 * Deque --> addFirst(E),addLast(E),peekFirst(),peekLast(),poolFirst(),poolLast(), etc  
 */ 

public class App1 {

	public static void main(String[] args) {

		ArrayList<Integer> datos1 = new ArrayList<Integer>(10); // dinamico
		List<Integer> datos2 = Arrays.asList(1,2,3,4,5);
		LinkedList<Integer> datos3 = new LinkedList<Integer>();
		List<Integer> datos4 = new LinkedList<Integer>(); // polimorfismo
		
		datos1.add(6);
		datos1.add(23);
		datos1.add(12);
		datos1.add(59);

		// suma de los elementos pares
		int pares = datos2.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
		// Creacion de una nueva lista con los cuadrados de cada elemento de la lista
		List<Integer> cuadrados = datos2.stream().map(x -> x*x).collect(Collectors.toList());

		// recorrer la lista de forma clasica
		for(int i=0;i<datos1.size();i++) {
			System.out.println("Dato: " + datos1.get(i));
		}
		// recorrer la lista haciendo uso del iterador de la propia lista
		Iterator<Integer> it;
		it = datos1.iterator(); // con esto hemos conseguido el iterador
		while(it.hasNext()) {
			int dato = it.next();
			System.out.println("Dato: " + dato);
		}
		
		Vector<Integer> v = new Vector();
		System.out.println("capacidad: " + v.capacity()); // 10
		v.add(1);
		v.add(2);
		v.add(3);
		System.out.println(v.elementAt(0)); // 1
		
		Stack<Integer> s = new Stack<>(); // Stack hereda de Vector
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.empty()); // false
		System.out.println(s.peek()); // 3 y NO modifica la pila
		System.out.println(s.pop()); // 3 y SI modifica la pila
		
	}
	
}
