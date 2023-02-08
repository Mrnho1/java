package aula_01;

import java.util.Scanner;

public class Atividade_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int salarioBruto,adicionalNoturno,horasExtras,descontos,salarioLiquido;
		
		System.out.println("Digite o salário bruto: ");
		salarioBruto = leia.nextInt();
		System.out.println("Digite o adicional do periodo noturno: ");
		adicionalNoturno = leia.nextInt();
		System.out.println("Quantia por hora extra: ");
		horasExtras = leia.nextInt();
		System.out.println("Descontos: ");
		descontos = leia.nextInt();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		
		System.out.println("O seu salário líquido será: "+salarioLiquido);

	}

}
