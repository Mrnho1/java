package games;

public class TesteGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Instanciando os objetos
		//Produto p1 = new Produto(123,1,"God of War",127.0f,"CC");
		//Produto p2 = new Produto(23,2,"The Last of Us",190.0f,"D");
		
		
		
		//Utilizando o método
		//p1.visualizar();
		//p2.visualizar();
		
		
		Jogo g1 = new Jogo(123,1,"God of War",127.0f,"CC","Ação");
		
		g1.visualizar();
		
		Console c1 = new Console(23,2,"The Last of Us",190.0f,"D","Suspense","X-Box");
		
		c1.visualizar();
	}

}
