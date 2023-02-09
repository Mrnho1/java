package condicionais;

import java.util.Scanner;

public class Exerc_04 {
	
	
	static Scanner leia = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cd;
		float qnt;
		
		System.out.println("CÓDIGO \t\tPRODUTO \t\tPREÇO UNITÁRIO");
		System.out.println("1 \t\tCachorro Quente \tR$ 10.00");
		System.out.println("2 \t\tX-Salada \t\tR$ 15.00");
		System.out.println("3 \t\tX-Bacon \t\tR$ 18.00");
		System.out.println("4 \t\tBauru   \t\tR$ 12.00");
		System.out.println("5 \t\tRefrigerante \t\tR$ 8.00");
		System.out.println("6 \t\tSuco de laranja  \tR$ 13.00");
		System.out.println("\n");
		System.out.println("::::DIGITE O CÓDIGO DO PRODUTO::::");
		cd = leia.nextInt();
		System.out.println("::::DIGITE A QUANTIDADE::::");
		qnt = leia.nextInt();
		
		
		//Inicio do Condicional.
		switch(cd){
		
		case 1:
			System.out.println("Produto: Cachorro Quente");
			System.out.println("Valor total: "+(qnt*10.00));
			break;
		case 2:
			System.out.println("Produto: X-Salada");
			System.out.println("Valor total: "+(qnt*15.00));
			break;	
		case 3:
			System.out.println("Produto: X-Bacon");
			System.out.println("Valor total: "+(qnt*18.00));
			break;
		case 4:
			System.out.println("Produto: Bauru");
			System.out.println("Valor total: "+(qnt*12.00));
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			System.out.println("Valor total: "+(qnt*8.00));
			break;
		case 6:
			System.out.println("Produto: Suco de laranja");
			System.out.println("Valor total: "+(qnt*13.00));
			break;
		}
		// Fim do Condicional
		
		
		
	}

}
