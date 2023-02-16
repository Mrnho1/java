package estruturaDados;

import java.util.Scanner;
import java.util.Stack;

public class Exerc_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner (System.in);
		Stack<String> livros = new Stack<String>();
		
		
		int opcao=0;
		String livro;
		
		
		do {
			System.out.println("===========================================");
			System.out.println("\n1- Adicionar Livro na pilha");
			System.out.println("2- Listar todos os Livros");
			System.out.println("3- Retirar Livro da pilha");
			System.out.println("0- Sair\n");
			System.out.println("===========================================");
			System.out.print("Digite a opção desejada:");
			opcao = leia.nextInt();
			
			switch(opcao) {
			
			case 1:
				System.out.print("\nDigite o nome do livro: ");
				leia.skip("\\R?");
				livro = leia.nextLine();
				livros.add(livro);
				System.out.println("Pilha\n");
				for(var elemento : livros) {
					System.out.println(elemento);
				}
				System.out.println("\nLIVRO ADICIONADO!\n");
				break;
				
			case 2:
				System.out.println("\nLISTA DE LIVROS NA PILHA");

				if (livros.isEmpty())
					System.out.println("\nA PILHA ESTÁ VAZIA!\n");
				else
					livros.forEach(System.out::println);
				break;
				
			case 3:
				if (livros.isEmpty()) {
					System.out.println("\nA PILHA ESTÁ VAZIA!\n");
				}
				else {
				livros.pop();
				System.out.println("PILHA\n");
				for(var elemento : livros) {
					System.out.println(elemento);
				}
				System.out.println("UM LIVRO DOI RETIRADO DA PILHA");
				}
				break;
				
			default:
				
			
			
			}
			
			
			
			
			
		}while(opcao!=0);
		
		
		
		
		
		
		
		
		leia.close();
	}

}
