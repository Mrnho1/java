package arrays;

import java.util.Scanner;

public class Exer_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num,numero=0,indice=0,local=0,vetor[] = {2,5,1,3,4,9,7,8,10,6};
		
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o número que você deseja encontrar");
		num = leia.nextInt(); 
		
		
		for ( int contador = 0 ; contador < vetor.length ; contador ++) {
			if (num == vetor[contador]) {
				numero = vetor[contador];
				indice = contador;
				local = 1;
				System.out.println("O número "+numero+" está localizado na posição "+indice);
				
			}
			
			
			
			
			
		}
		if (local == 0) {
			System.out.println("Número não encontrado!!");
		}
		
		
		
		
		
		
	}

}
