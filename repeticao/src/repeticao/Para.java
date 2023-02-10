package repeticao;

import java.util.Scanner;

public class Para {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int num1,num2;
		
		System.out.println("Digite o 1° número: ");
		num1 = leia.nextInt();
		System.out.println("Digite o 2° número: ");
		num2 = leia.nextInt();
		
		
		if (num1>num2)
			System.out.println("INTERVALO INVÁLIDO!");
		for (num1 = num1;num1 <= num2;num1++) {
			if(num1%3==0 && num2%5==0)
				System.out.println(num1 + " é multiplo de 3 e 5");
			
		}
	
		
	}

}
