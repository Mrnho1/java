package games;

public class Jogo extends Produto {
	

	String genero;

	public Jogo(int codigo, int tipo, String jogo, double preco, String forma, String genero) {
		super(codigo, tipo, jogo, preco, forma);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Gênero do Jogo:   \t"+this.genero);
	}
	
	
}
