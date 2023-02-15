package estruturaDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exerc_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		int opcao = 0;
		String nome;

		do {
			System.out.println("\n1- Adicionar Cliente na Fila");
			System.out.println("2- Listar todos os Clientes");
			System.out.println("3- Retirar Cliente da Fila");
			System.out.println("0- Sair\n");
			System.out.print("Digite a opção desejada:");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.print("\nDigite o nome do cliente: ");
				leia.skip("\\R?");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.println("Fila\n");
				for(var elemento : fila) {
					System.out.println(elemento);
				}
				System.out.println("\nCLIENTE ADICIONADO!\n");
				break;
			case 2:
				System.out.println("\nLISTA DE CLIENTES NA FILA");

				if (fila.isEmpty())
					System.out.println("\nA FILA ESTÁ VAZIA!\n");
				else
					fila.forEach(System.out::println);
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("\nA FILA ESTÁ VAZIA!\n");
				}
				else {
				fila.poll();
				System.out.println("FILA\n");
				for(var elemento : fila) {
					System.out.println(elemento);
				}
				System.out.println("O CLIENTE FOI CHAMADO");
				}
				break;
			default:
				if (opcao > 3) {
					System.out.println("\nOPÇÃO INVÁLIDA");
					opcao = 0;
				}
				break;

			}
			;

		} while (opcao != 0);
		
		System.out.println("Programa Finalizado!");

	}

}
