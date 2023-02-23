package games;

public class Console extends Produto {
	
	String console;

	public Console(int codigo, int tipo, String jogo, double preco, String forma, String console) {
		super(codigo, tipo, jogo, preco, forma);
		this.console = console;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo de Console:   \t"+this.console);
	}
	
	
}
