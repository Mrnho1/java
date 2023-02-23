package games;

public abstract class Produto  {

	private int codigo;
	private int tipo;
	private String jogo;
	private double preco;
	private String forma;
	
//Construtores
	public Produto(int codigo, int tipo, String jogo, double preco, String forma) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.jogo = jogo;
		this.preco = preco;
		this.forma = forma;
	}
	
	
//Métodos Get e Set
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getJogo() {
		return jogo;
	}
	public void setJogo(String jogo) {
		this.jogo = jogo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	
	
//Método para visualizar
	public void visualizar() {
		
		
//ESCOLHA A FORMA DE PAGAMENTO
		String forma = "";
		switch(this.forma) {
		case "CC" ->  forma = "Cartão de Crédito";
		case "CD" ->  forma = "Cartão de Dédito";
		case "D" ->  forma = "Dinheiro";
		}
//ESCOLHA O TIPO DE MÍDIA
		String tipo = "";
		switch(this.tipo) {
		case 1 ->  tipo = "Mídia Física";
		case 2 ->  tipo = "Mídia Digital";
		}

//MOSTRAR NA TELA O VIZUALIZAR
		System.out.println("=============================");
		System.out.println("DADOS DO PRODUTO");
		System.out.println("=============================");
		System.out.println("Código do Produto: \t"+this.codigo);
		System.out.println("Tipo de Mídia: \t\t"+tipo);
		System.out.println("Nome do Jogo:  \t\t"+this.jogo);
		System.out.println("Preço:         \t\t"+this.preco);
		System.out.println("Forma de Pagamento: \t"+forma);
		
	}
	
	
	
	
	
	
	
	
	

}
