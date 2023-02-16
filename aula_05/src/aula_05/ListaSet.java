package aula_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListaSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Double> notas = new HashSet<Double>();
		
		notas.add(7.0);
		notas.add(6.0);
		notas.add(2.0);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(20.0);
		
		
		
		
		
		System.out.println("Listando todas as notas:");
		notas.forEach(System.out::println);
		
		
		notas.remove(20.0);
		System.out.println("\nRemovendo uma nota:");
		notas.forEach(System.out::println);
		
		
		System.out.println("\nA nota 7 existe? "+notas.contains(7.0));
		
		System.out.println("Mostrando o HashCode");
		for(var nota : notas)
			System.out.println(nota.hashCode());
		
		
		
	}

}
