package questoes;

import br.com.util.Teclado;

public class Questao26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero = Teclado.lerDouble("Digite um n�mero de tr�s casa: ");
		int conta = 0;
		while (numero >= 100) {
			numero -= 100;
			conta++;
		}
		System.out.println(conta);
	}

}
