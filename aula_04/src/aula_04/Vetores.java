package aula_04;

import java.util.Arrays;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int vetorInteiros[] = { 1, 2, 3, 4, 5 };

		float[] vetorFloat = new float[5];

		for (int contador = 0; contador < vetorInteiros.length; contador++)
			System.out.println("Posição " + contador + " = " + vetorInteiros[contador]);

		for (int indice = 0; indice < vetorFloat.length; indice++) {
			System.out.println("Digite um valor para a posição [" + indice + "]");
			vetorFloat[indice] = leia.nextFloat();
		}

		Arrays.sort(vetorFloat);

		for (var numero : vetorFloat)
			System.out.println(numero);

		/* Arrays.sort(vetorFloat, Collections.reverseOrder()); */

		leia.close();
	}

}
