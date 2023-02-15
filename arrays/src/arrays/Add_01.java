package arrays;

import java.util.Scanner;

public class Add_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		float matriz[][] = new float[3][4];
		float media[] = new float[3];
		float soma = 0.0f;

		// LER AS LINHAS E COLUNAS
		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			for (int indiceJ = 0; indiceJ < matriz[indiceI].length; indiceJ++) {

				System.out.println("Digite a nota: ");
				matriz[indiceI][indiceJ] = leia.nextFloat();

			}

		}

		for (int indiceI = 0; indiceI < matriz.length; indiceI++) {

			for (int indiceJ = 0; indiceJ < matriz[indiceI].length; indiceJ++) {

				soma += matriz[indiceI][indiceJ];

			}
			media[indiceI] = soma / matriz[indiceI].length;
			soma = 0.0f;
		}
		
		
		
		for(var medias : media)
			System.out.println(medias);
		
		
		
		
		
		

	}

}
