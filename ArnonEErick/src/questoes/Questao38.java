package questoes;

public class Questao38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double potencia1 = 0.0;
		for (int i = 0; i <= 15; i++) {
			potencia1 = Math.pow(3, i);
			System.out.println(potencia1);
		}
		
		System.out.println("\nSem Math.Pow:\n");
		
		double resultado = 1.0;
		
		for (int i = 0; i <= 15; i++) {
			if (i == 0) {
				System.out.println(resultado);
			}
			else {
				resultado = resultado * 3;
				System.out.println(resultado);	
			}
		}
	}
}
