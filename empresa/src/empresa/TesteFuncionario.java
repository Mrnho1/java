package empresa;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//INSTANCIANDO OS OBJETOS
		Funcionario f1 = new Funcionario("Lucas Marinho","Desenvolvedor Java",14,4000.0f,0.2f);
		Funcionario f2 = new Funcionario("Clauber","Instrutor Generation",24,10000.0f,0.5f);
		
		
		
//UTILIZANDO O MÉTODO VISUALIZAR
		f1.visualizar();
		f2.visualizar();
		
		
	}

}
