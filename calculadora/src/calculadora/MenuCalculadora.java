package calculadora;

import java.util.Scanner;



public class MenuCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner (System.in);
		Calculos calc = new Calculos();
		
		
		int opcao;
		double num1,num2;
		
		
		
		while(true) {
			
		System.out.println("1-Soma");	
		System.out.println("2-Subtração");	
		System.out.println("3-Multiplicação");	
		System.out.println("4-Divisão\n");	
		
		System.out.println("Digite o número da Operação:");
		opcao = leia.nextInt();
		
		if(opcao==0) {
			leia.close();
			System.exit(0);
		}
		
		System.out.println("Digite o primeiro número:");
		num1 = leia.nextDouble();
		System.out.println("Digite o primeiro número:");
		num2 = leia.nextDouble();
		
		
		
		switch(opcao) {
			case 1 -> System.out.println("Soma: "+calc.soma(num1,num2));
			case 2 -> System.out.println("Subtração: "+calc.subtracao(num1,num2));
			case 3 -> System.out.println("Multiplicação: "+calc.multiplicacao(num1,num2));
			case 4 -> System.out.println("Divisão: "+calc.divisao(num1,num2));
			default -> System.out.println("Opção Inválida!");
		
		}
		
		}
		
		
		
	}

}
