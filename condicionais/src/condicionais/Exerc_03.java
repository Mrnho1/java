package condicionais;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc_03 {

	static Scanner leia = new Scanner(System.in);
	public static void main(String[] args) {
		
		//Formatação
		DecimalFormat df = new DecimalFormat("####.##");
		
		int cd;
		double saldo=1000.00,saque,dep;
		
		
		System.out.println("CÓDIGO  DE OPERAÇÃO \tOPERAÇÃO");
		System.out.println("\t1              \tSaldo");
		System.out.println("\t2              \tSaque");
		System.out.println("\t3              \tDepósito");
		System.out.println("\n");
		// Iniciando o Scanner
		System.out.println("Digite o código da operação: ");
		cd = leia.nextInt();
		
		
		switch(cd)
		{
		case 1:
			System.out.println("Operação: Saldo");
			System.out.println("Saldo: "+df.format(saldo));
			break;
		case 2:
			System.out.println("Operação: Saque");
			System.out.println("Digite o valor: ");
			saque = leia.nextDouble();
			saldo -= saque;
			if(saque>saldo)System.out.println("OPERAÇÃO INVÁLIDA!!");//verificação de saldo
			System.out.println("Novo Saldo: "+saldo);
			break;
		case 3:
			System.out.println("Operação: Depósito");
			System.out.println("Digite o Valor: ");
			dep = leia.nextDouble();
			saldo += dep;
			System.out.println("Novo Saldo: "+saldo);
			break;
		default:
			System.out.println("OPERAÇÃO INVÁLIDA");
		}
		
		
		
		
	}

}
