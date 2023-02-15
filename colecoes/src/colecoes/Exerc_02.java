package colecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exerc_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		Set<Double> notas = new HashSet<Double>();

		double nota;

		for (int contador = 1; contador <= 10; contador++) {
			System.out.println("Digite o " + contador + "° numero sem repetir:");
			nota = leia.nextInt();
			notas.add(nota);
		}
		

		Iterator<Double> iNota = notas.iterator();
		
		
		System.out.println("Listar dados do set: ");
		while(iNota.hasNext()) {
			System.out.println(iNota.next());
		}
		
		
		

		leia.close();
	}

}
