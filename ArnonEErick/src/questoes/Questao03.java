package questoes;

import br.com.util.Teclado;

public class Questao03 {

	public static void main(String[] args) {
		int tabuada = Teclado.lerInt("Digite um n�mero: ");
		for (int i = 0; i <= 10; i++) {
			System.out.println(tabuada * i);
		}
		
	}

}
