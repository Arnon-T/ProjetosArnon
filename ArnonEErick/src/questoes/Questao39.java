package questoes;

import br.com.util.Teclado;

public class Questao39 {

	public static void main(String[] args) {
		// Elaborar um programa que apresente o valor de uma pot�ncia de
		//uma base qualquer (Vari�vel b) elevada 
		//a um expoente qualquer (Vari�vel e), ou seja, de be.(Sem usar Math.pow();)
		double base = Teclado.lerDouble("Digite um valor base");
		double expoente = Teclado.lerDouble("Digite um expoente");
		double resultado = 1.0;
		
		for (int i = 0; i < expoente; i++) {
			resultado = resultado * base;
		}
	
			System.out.println("A potencia de " + base + " pelo expoente " + expoente + " �: " + resultado);
		
	}

}


