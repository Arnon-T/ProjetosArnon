package questoes;

import br.com.util.Teclado;

public class Questao09 {

	public static void main(String[] args) {

		int numero = Teclado.lerInt("Digite um n�mero: ");
		for (int i = 0; i <= numero; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
		
	}

}