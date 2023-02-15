package aula_05;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> pilha = new Stack<String>();

		pilha.push("Rony");
		pilha.push("Lucas");
		pilha.push("Isaac");
		pilha.push("Fernando");
		pilha.push("Laise");
		pilha.push("Elizangela");
		
		
		for(var elemento: pilha) {
			System.out.println(elemento);
		}
		
		System.out.println("Remover 1 elemento da pilha");
		pilha.pop();
		
		
		System.out.println("Lista atualizada");
		for(var elemento: pilha) {
			System.out.println(elemento);
		}
		
		System.out.println("Topo de pilha: "+pilha.peek());
	}

}
