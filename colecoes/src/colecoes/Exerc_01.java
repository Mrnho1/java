package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Exerc_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner leia = new Scanner (System.in);
		ArrayList<String> nomes = new ArrayList<String>();
		
		
		
		String nome;
		
		for (int contador = 0 ; contador < 5 ; contador ++) {
			System.out.println("Digite as cores: ");
			nome = leia.next();
			nomes.add(nome);
		}
		
		
		System.out.println("Listar todas as Cores: ");
		nomes.forEach(System.out::println);
		
		
		System.out.println("\nOrdenar as cores: ");
		nomes.sort(null);
		nomes.forEach(System.out::println);
		
		
		
		leia.close();
	}

}
