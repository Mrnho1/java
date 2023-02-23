package aula_07;

public class TesteAtleta {

	public static void main(String[] args) {
		
		Triatleta at1 = new Triatleta("Lucas");
		Triatleta at2 = new Triatleta("Wallace");
		
		at1.aquecer();
		at1.correr();
		at2.aquecer();
		at2.pedalar();
		at2.nadar();

	}

}
