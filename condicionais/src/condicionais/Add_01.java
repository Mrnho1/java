package condicionais;

import java.util.Scanner;

public class Add_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner leia = new Scanner(System.in);
		String animal01,animal02,animal03;
		
		System.out.println("Digite o 1° animal: ");
		leia.skip("\\R?");
		animal01 = leia.nextLine();
		System.out.println("Digite o 2° animal: ");
		leia.skip("\\R?");
		animal02 = leia.nextLine();
		System.out.println("Digite o 3° animal: ");
		leia.skip("\\R?");
		animal03 = leia.nextLine();
		
		if(animal01.equals("Vertebrado")) {
			if(animal02.equals("Ave")) {
				if(animal03.equals("Carnivoro"))
					System.out.println("Águia");
				else
					System.out.println("Pomba");
			}else {
				if(animal03.equals("Onivoro"))
					System.out.println("Homem");
				else
					System.out.println("Vaca");
			}
		}else {
			if(animal02.equals("Inseto")) {
				if(animal03.equals("Hematofago"))
					System.out.println("Pulga");
				else
					System.out.println("Lagarta");
			}else {
				if(animal03.equals("Hematofago"))
					System.out.println("Sanguessuga");
				else
					System.out.println("Minhoca");
		}
		
		
		
	}

	}
}
