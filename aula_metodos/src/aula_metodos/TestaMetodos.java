package aula_metodos;


import static aula_metodos.pacote2.Classe2.*;


public class TestaMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		metodoPublic();
		
		metodoPadrao();
		
		metodoProtegido();
		
		metodoPrivado();
		
		
		Classe1.metodoPublico1();
		
		Classe1.metodoFriendly1();
		
		Classe1.metodoProtegido1();
		
		
		
		metodoPublicoPacote1();
		
		//metodoFriendlyPacote1();
		
		//metodoProtegidoPacote1();
		
		//metodoPrivadoPacote1();
		
		
		
		
		System.out.println(soma(10,5));
		
		
	}
	
	
	public static void metodoPublic() {
		System.out.println("Eu sou um Método Público!\n");
	}
	
	
	public static int soma(int a, int b) {
		return a + b;
	}

	
	 static void metodoPadrao() {
		System.out.println("Eu sou um Método Friendly!\n");
	 }
	 
	 protected static void metodoProtegido() {
			System.out.println("Eu sou um Método Protegido!\n");
		 }
	 
	 private static void metodoPrivado() {
			System.out.println("Eu sou um Método Privado!\n");
		 }
	 
	 
	 
	
}
