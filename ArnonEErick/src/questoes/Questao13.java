package questoes;

import br.com.util.Teclado;

public class Questao13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double polegada = 2.54;
		int numeropolegada = Teclado.lerInt("digite um n�mero: ");
		double centimetro = 0;
		
		for (int i = 1; i <= numeropolegada; i++) {
			centimetro = polegada*i;
			System.out.printf("Cent�metros %f ---- Polegadas %d \n", centimetro, i);		}
		
		
	}

}
