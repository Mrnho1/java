package empresa;

public class Funcionario {
	
	private	String nome;
	private String funcao;
	private int meses;
	private float salario;
	private float aumento;
	
	
	public Funcionario(String nome, String funcao, int meses, float salario, float aumento) {
		super();
		this.nome = nome;
		this.funcao = funcao;
		this.meses = meses;
		this.salario = salario;
		this.aumento = aumento;
	}

	
	

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getFuncao() {
		return funcao;
	}


	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}


	public int getMeses() {
		return meses;
	}


	public void setMeses(int meses) {
		this.meses = meses;
	}


	public float getSalario() {
		return salario;
	}


	public void setSalario(float salario) {
		this.salario = salario;
	}


	public float getAumento() {
		return aumento;
	}


	public void setAumento(float aumento) {
		this.aumento = aumento;
	}
	
	
	
	
	
	
	
	public void visualizar() {
		
		System.out.println("=============================");
		System.out.println("DADOS DO PRODUTO");
		System.out.println("=============================");
		System.out.println("Nome do Funcionário: \t"+this.nome);
		System.out.println("Função: \t\t"+this.funcao);
		System.out.println("Meses de empresa:  \t"+this.meses);
		System.out.println("Salário:         \t"+this.salario);
//CONTA PARA EFETUAR O AUMENTO
		System.out.println("Novo Salário:    \t"+(this.aumento = this.salario + (this.getSalario()*this.getAumento())));
		
	}
	
	
	
}
