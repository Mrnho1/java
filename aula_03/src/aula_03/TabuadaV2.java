package aula_03;

import java.util.Scanner;

public class TabuadaV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int numero;
		boolean ok = false;
		String continua;

		do {
			do {

				System.out.println("Digite a Tabuada que você deseja calcular: ");
				numero = leia.nextInt();

				if (numero < 1 || numero > 10)
					System.out.println("\nDigite um número entre 1 e 10\n");
				else
					ok = true;

			} while (ok == false);
			int contador = 1;
			while( contador <= 10) {

				System.out.println("\n" + numero + " X " + contador + " = " + (numero * contador));
				contador ++;
			}
			ok = false;
			System.out.println("\nDeseja continuar?(S/N)");
			leia.skip("\\R?");
			continua = leia.nextLine();

		} while (continua.equalsIgnoreCase("S"));

		leia.close();
	}

}
