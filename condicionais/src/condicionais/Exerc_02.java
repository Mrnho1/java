package condicionais;

import java.util.Scanner;

public class Exerc_02 {
	
	static Scanner leia = new Scanner (System.in); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		
		System.out.print("Digite um número: ");
		num = leia.nextInt();
		
		if(num%2==0 && num>0) {
			System.out.println("O Número "+num+" é par e positivo");
		}else if(num%2==0 && num<0) {
			System.out.println("O Número "+num+" é par e negativo");
		}else if(num%2==1 && num>0) {
			System.out.println("O Número "+num+" é ímpar e positivo");
		}else {
			System.out.println("O Número "+num+" é ímpar e negativo");
		}
		
		
		
	}

}
