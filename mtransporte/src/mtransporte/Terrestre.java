package mtransporte;

public class Terrestre extends Transporte {

	
	private int nRodas;
	private float velocidade;
	
	
	public Terrestre(int capacidade, int nRodas, float velocidade) {
		super(capacidade);
		// TODO Auto-generated constructor stub
		this.nRodas = nRodas;
		this.velocidade = velocidade;
	}


	public int getnRodas() {
		return nRodas;
	}


	public void setnRodas(int nRodas) {
		this.nRodas = nRodas;
	}


	public float getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(float velocidade) {
		this.velocidade = velocidade;
	}
	
	public void visualizar(){
		super.visualizar();
		System.out.println("Número de Rodas: "+this.nRodas);
		System.out.println("Velocidade: "+this.velocidade);
	}
	
	
	
	
}
