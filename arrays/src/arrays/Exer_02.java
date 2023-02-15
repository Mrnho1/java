package arrays;

public class Exer_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int vetor[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, indiceI, indiceJ,somaP=0,somaD=0;

		// LER AS LINHAS
		for (indiceI = 0; indiceI < vetor.length; indiceI++) {
			// LER AS COLUNAS
			for (indiceJ = 0; indiceJ < vetor.length; indiceJ++) {
				System.out.print(vetor[indiceI][indiceJ] + " \t");

			}
			System.out.println("\t");
		}

		// LER A DIAGONAL PRINCIPAL
		System.out.println();
		System.out.print("Elementos da Diagonal Principal: ");
		for (indiceI = 0; indiceI < vetor.length; indiceI++) {
			System.out.print(vetor[indiceI][indiceI] + " ");
			somaP += vetor[indiceI][indiceI];
		}
		System.out.println();
		System.out.println();
		System.out.print("Soma dos Elementos da Diagonal Principal: "+somaP);
		
		
		
		// LER A DIAGONAL SECUNDÁRIA
		System.out.println();
		System.out.println();
		System.out.print("Elementos da Diagonal Principal: ");
		for (indiceI = 0; indiceI < vetor.length; indiceI++) {
			System.out.print(vetor[indiceI][vetor.length-1-indiceI] + " ");
			somaD += vetor[indiceI][vetor.length-1-indiceI];
		}
		System.out.println();
		System.out.println();
		System.out.print("Soma dos Elementos da Diagonal Secundária: "+somaD);
		
		
		
		
	}

}
