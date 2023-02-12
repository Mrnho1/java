package repeticao;

import java.util.Scanner;

public class Add_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		int idade,sexo,categoria,backend=0,frontf=0,mobilem=0,fullm=0;
		String continua ="S";
		
		System.out.println("\n=========================================");
		System.out.println("\tSexo \t\tCategoria");
		System.out.println("=========================================");
		System.out.println("\t1-Masculino \t1-Backend");
		System.out.println("\t2-Feminino  \t2-Frontend");
		System.out.println("\t3-Outros    \t3-Mobile");
		System.out.println("\t            \t4-FulStack");
		System.out.println("=========================================");
		
		 
		while(continua.equalsIgnoreCase("S")) {
		System.out.println("\n\nDigite a idade: ");
		idade = leia.nextInt();
		System.out.println("Digite o sexo: ");
		sexo = leia.nextInt();
		System.out.println("Digite a categoria: ");
		categoria = leia.nextInt();
		
		if(categoria == 1)
			backend++;
		if(categoria == 2 && sexo == 2)
			frontf++;
		if(categoria == 3 && sexo == 1 && idade > 40)
			mobilem++;
		if(categoria == 4 && sexo == 2 && idade < 30)
			fullm++;
		
		System.out.println("Deseja continuar(S/N): ");
		leia.skip("\\R?");
		continua = leia.nextLine();
		
		}
		
		System.out.println("Total de pessoas desenvolvedoras Backend: "+backend);
		System.out.println("Total de mulheres desenvolvedoras Frontend: "+frontf);
		System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: "+mobilem);
		System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: "+fullm);
		
	}

}
