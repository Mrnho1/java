package aula_01;

import java.util.Scanner;

public class Atividade_01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int salario,abono,novoSalario;
		
		System.out.println("Digite o salário: ");
		salario = leia.nextInt();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextInt();
		
		novoSalario = salario + abono;
		
		System.out.println("O novo salário é: "+novoSalario);
		
		
	}

}
