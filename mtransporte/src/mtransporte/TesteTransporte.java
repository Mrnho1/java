package mtransporte;

public class TesteTransporte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transporte t1 = new Transporte(5);
		Transporte t2 = new Transporte();
		
		Terrestre tr1 = new  Terrestre(5,4,200.0f);
		
		Automovel a1 = new Automovel(5,4,200.0f,"Branco",4,"XPT-2131",5);
		
		
		t1.visualizar();
		
		System.out.println("\n");
		
		tr1.visualizar();
		
		System.out.println("\n");
		
		a1.visualizar();
		
		t2.visualizar();
		t2.setCapacidade(100);
		t2.visualizar();
		
		
		a1.mensagem();
		
		a1.mensagem("O Carnaval ainda viveeeee!");
		a1.mensagem("O Carnaval acabou!");
		
	}

}
