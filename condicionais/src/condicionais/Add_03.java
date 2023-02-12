package condicionais;

import java.util.Scanner;

public class Add_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		int cargo,sal;
		double novo=0;
		String nome,cargoN="";
		
		
		System.out.println("=========================================================");
		System.out.println("CÓDIGO \t\tCARGO \t\tPORCENTUAL DO REAJUSTE");
		System.out.println("=========================================================");
		System.out.println("1      \t\tGerente   \t\t10%");
		System.out.println("2      \t\tVendedor  \t\t10%");
		System.out.println("3      \t\tSupervisor\t\t10%");
		System.out.println("4      \t\tMotoristta\t\t10%");
		System.out.println("5      \t\tEstoquista\t\t10%");
		System.out.println("6      \t\tTécnico de TI\t\t10%");
		System.out.println("=========================================================");
		
		
		System.out.print("Nome do colaborador: ");
		nome = leia.next();
		System.out.print("Cargo: ");
		cargo = leia.nextInt();
		System.out.println("Salário: ");
		sal = leia.nextInt();
		if (cargo==1)
		{
			novo = sal + (0.1*sal);
			cargoN = "Gerente";
		}
		if (cargo==2) {
			novo = sal + (0.07*sal);
			cargoN = "Vendedor";
		}
		if (cargo==3) {
			novo = sal + (0.09*sal);	
			cargoN = "Supervisor";
		}
		if (cargo==4) {
			novo = sal + (0.06*sal);	
			cargoN = "Motorista";
		}
		if (cargo==5) {
			novo = sal + (0.05*sal);
			cargoN = "Estoquista";
		}
		if (cargo==6) {
			novo = sal + (0.08*sal);
			cargoN = "Técnico de TI";
		}
		
			
			
			
			
		
			
		System.out.println("Nome do colaborador: "+nome);	
		System.out.println("Cargo: "+cargoN);	
		System.out.println("Salário: "+novo);	
			
			
			
			
		leia.close();	
	}

}
