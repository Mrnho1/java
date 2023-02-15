package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		ArrayList<Double> notas = new ArrayList<Double>();
		
		
		int opcao=0;
		double nota=0;
		
		
		do {
			System.out.println("\n1- Cadastrar Nota");
			System.out.println("2- Listar todas as Notas");
			System.out.println("3- Buscar uma Nota");
			System.out.println("4- Remover uma Nota");
			System.out.println("5- Atualizar uma Nota");
			System.out.println("6- Sair\n");
			System.out.println("Digite a opção desejada:");
			opcao = leia.nextInt();
			
			switch(opcao) {
				
			case 1:
				System.out.println("\nDigite uma nota entre 1 e 10");
				nota = leia.nextDouble();
//VETOR QUE ESTÁ SENDO ADICIONADO
				notas.add(nota); 
				break;
			case 2:
// FOR EACH
				System.out.println("\nListar todas as Notas");
				
				if(notas.isEmpty())
					System.out.println("\nBASE DE DADOS VAZIA!\n");
				else
					notas.forEach(System.out::println);
				break;
			case 3:
				System.out.println("\nProcurar uma Nota\n");
				System.out.println("\nDigite a nota");
				nota = leia.nextDouble();
				
//MOSTRA SE A NOTA EXISTE NO VETOR				
				System.out.println("\nA nota "+ nota +" existe? " + notas.contains(nota)); 
				if(notas.contains(nota))
// MOSTRA O INDICE DO VETOR NOTAS					
				System.out.println("\nO indice da minha nota é"+ notas.indexOf(nota)); 
				break;
			case 4:
				System.out.println("\nDigite a nota");
				nota = leia.nextDouble();
				notas.remove(nota); // Nota
				//notas.remove(notas.indexOf(nota)); // Indice da nota
				break;
			case 5:
				System.out.println("\nAtualizar uma Nota\n");
				System.out.println("\nDigite a nota atual");
				nota = leia.nextDouble();
				System.out.println("\nDigite a nova Nota");
				double notaNova = leia.nextDouble();
// INTERFACE SET (MUDAR A NOTA)
				notas.set(notas.indexOf(nota), notaNova);
				break;
			default:
				if (opcao > 6)
				System.out.println("\nOPÇÃO INVÁLIDA");
				
			}
			
		}while(opcao != 6);
		
		
		notas.add(9.0);
		notas.add(8.0);
		notas.add(7.0);
		
		
		
		leia.close();
	}

}
