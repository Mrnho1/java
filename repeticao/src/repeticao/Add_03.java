package repeticao;

import java.util.Scanner;

public class Add_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner (System.in);
		int num,par=0,impar=0;
		
		for(int i=1;i<=10;i++) {
			System.out.print("Digite o "+i+"° número: ");
			num = leia.nextInt();
			if (num % 2 == 0)
				par++;
			if (num % 2 == 1)
				impar++;
		}
		System.out.println("\nTotal de números pares: "+par);
		System.out.println("\nTotal de números ímpares: "+impar);
		
	}

}
