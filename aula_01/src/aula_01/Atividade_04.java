package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("##.#");
		
		Scanner leia = new Scanner(System.in);
		float n1,n2,n3,n4,calculo;
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextFloat();
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextFloat();
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextFloat();
		System.out.println("Digite o quarto número: ");
		n4 = leia.nextFloat();
		calculo = (n1*n2)-(n3*n4);
		System.out.println("A diferença dos números é igual a: "+df.format(calculo));
		
	}

}
