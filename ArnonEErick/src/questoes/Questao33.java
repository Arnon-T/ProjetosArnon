package questoes;

import br.com.util.Teclado;

public class Questao33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = Teclado.lerInt("Digite um número");
		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + "." + i + " = " + (numero * i) );
	
}
		
	}

}



