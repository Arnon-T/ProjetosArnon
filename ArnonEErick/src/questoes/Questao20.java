package questoes;

import br.com.util.Teclado;

public class Questao20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] notas = new double[4];
		double media = 0.0; 
		
		for (int i = 0; i < notas.length; i++) {
			notas[i] = Teclado.lerDouble("Digite a nota " + (i+1));
			media += (notas[i]/notas.length);
		}
		if (media >= 5) {
			System.out.println("APROVADO  " + media);			
		}
		else {
			System.out.println("REPROVADO M�dia: " + media);
		}
	}

}
