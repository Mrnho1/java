package repeticao;

import java.util.Scanner;

public class Add_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		int num;
		float soma=0,cont=0;
		
		
		do {
			System.out.println("Digite um número: ");
			num = leia.nextInt();
			if (num%3==0 && num != 0) {
				soma += num;
				cont++;
			}
		}while(num!=0);
		
		System.out.println("A média de todos os números múltiplos de 3 é: "+(soma/cont));
		
	}

}
