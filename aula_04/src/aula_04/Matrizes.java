package aula_04;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int matrizI[][] = { { 10, 15, 35 }, { 70, 120, 140 }, { 50, 100, 150 } };

		float[][] mat = new float[2][2];

		// LER AS LINHAS
		for (int indiceI = 0; indiceI < matrizI.length; indiceI++) {

			// LER AS COLUNAS
			for (int indiceJ = 0; indiceJ < matrizI.length; indiceJ++) {
				System.out.print(matrizI[indiceI][indiceJ]);
			}
		}

		System.out.println("\n");
		// LER AS LINHAS
		for (int indiceI = 0; indiceI < mat.length; indiceI++) {

			// LER AS COLUNAS
			for (int indiceJ = 0; indiceJ < mat.length; indiceJ++) {
				System.out.print("Digite um valor Real: ");
				mat[indiceI][indiceJ] = leia.nextFloat();
			}
		}
		
		for(float[] vetor : mat) {
			for(var elemento : vetor) {
				System.out.println(elemento);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		leia.close();
	}

}
