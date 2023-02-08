package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade_02 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("##.#");
		
		Scanner nota = new Scanner(System.in);
		float nota1,nota2,nota3,nota4,media;
		
		System.out.println("Digite a primeira nota: ");
		nota1 = nota.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = nota.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = nota.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = nota.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.println("A média final é igual a "+df.format(media));

	}

}
