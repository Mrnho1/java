package repeticao;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int idade,maior=0,menor=0,contador=1;
		
		
		while(contador>0) {
			
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
			if(idade<0)
			break;
			else if(idade<21)
				menor ++;
			else if(idade>50)
				maior++;
				
			contador++;
			
		}
		System.out.println("Total de pessoas menores de 21 anos: "+menor);
		System.out.println("Total de pessoas maiores de 50 anos: "+maior);
	leia.close();
	}
}
