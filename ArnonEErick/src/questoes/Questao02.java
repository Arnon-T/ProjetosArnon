package questoes;

import br.com.util.Teclado;

public class Questao02 {

	public static void main(String[] args) {
		int numero = Teclado.lerInt("Digite um n�mero: ");
		int soma = 0;
		for (int i = 0; i <= numero; i++) {
			soma += i;
		}
		System.out.println(soma);
	}

}
