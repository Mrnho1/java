package condicionais;

import java.util.Scanner;

public class Exer_01 {

	static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A,B,C;
		
		System.out.println("Digite o número de A: ");
		A = leia.nextInt();
		System.out.println("Digite o número de B: ");
		B = leia.nextInt();
		System.out.println("Digite o número de C: ");
		C = leia.nextInt();
		
		
		//Condição 1.
		if (A+B > C)
		{
			System.out.println("\t"+A +" + "+B+" = "+(A+B)+">"+C);
			System.out.println("A Soma de "+A+" + "+B+" é Maior que "+C);
		}
		//Condição 2.
		else if(A+B < C)
		{
			System.out.println("\t"+A +" + "+B+" = "+(A+B)+"<"+C);
			System.out.println("A Soma de "+A+" + "+B+" é Menor que "+C);
		}
		//Condição 3.
		else if(A+B == C)
		{
			System.out.println("\t"+A +" + "+B+" = "+(A+B)+"="+C);
			System.out.println("A Soma de "+A+" + "+B+" é Igual a "+C);
		}
		//Fim das Coondições.
		
		
	}

}
