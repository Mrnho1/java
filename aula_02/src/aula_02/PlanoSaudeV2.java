package aula_02;

import java.util.Scanner;

public class PlanoSaudeV2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int faixa;
		
		System.out.println("::::PLANO DE SAÚDE::::");
		System.out.println("\n");
		
		System.out.print("Digite a sua faixa etária: ");
		faixa = leia.nextInt();
		System.out.println();
		
		switch(faixa) {
		
		case 1:
			System.out.println("O valor do seu Plano de Sáude será de R$ 100,00");
			break;
		case 2:
			System.out.println("O valor do seu Plano de Sáude será de R$ 200,00");
			break;
		case 3:	
			System.out.println("O valor do seu Plano de Sáude será de R$ 300,00");
			break;
		case 4:	
			System.out.println("O valor do seu Plano de Sáude será de R$ 500,00");
			break;
		case 5:	
			System.out.println("O valor do seu Plano de Sáude será de R$ 600,00");
			break;
		case 6:	
			System.out.println("O valor do seu Plano de Sáude será de R$ 1000,00");
			break;
		default:
			System.out.println("FAIXA ETÁRIA INVÁLIDA");
		}
		
		
		leia.close();
	}

}
