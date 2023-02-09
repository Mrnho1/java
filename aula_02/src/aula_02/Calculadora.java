package aula_02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("###.##");

		Scanner leia = new Scanner(System.in);
		double n1, n2;

		System.out.println("Digite o 1° número: ");
		n1 = leia.nextDouble();

		System.out.println("Digite o 2° número: ");
		n2 = leia.nextDouble();

		System.out.println("O número " + n1 + " elevado ao número " + n2 + " é igual a " + df.format(Math.pow(n1, n2)));

		System.out.println("A Raíz quadrada do número " + n1 + " é igual a " + df.format(Math.sqrt(n1)));

		System.out.println("Pré Incremento");
		System.out.println(n1);
		System.out.println(++n1);

		System.out.println("Pós Incremento");
		System.out.println(n2);
		System.out.println(n2++);
		System.out.println(n2);

		System.out.println("\n");
		System.out.println(n1 = n1 + n2);
		System.out.println(n1 += n2);
		System.out.println("\n");
		System.out.println(n1);
		System.out.println(n1 += n2);
		System.out.println(n1);

		leia.close();
	}

}
