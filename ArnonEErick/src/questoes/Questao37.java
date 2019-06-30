package questoes;

public class Questao37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0;
		
		for (int i = 0; i <= 500; i+=2) {
			if (i %2 ==  0) {
				numero += i;
			}

		}
		System.out.println("Soma dos números: " + numero);
	}

}
