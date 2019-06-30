package questoes;

public class Questao43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		int total = 1;
		
		for (int i = 1; i <= 15; i++) {
			System.out.println(total);
			n3 = n1 + n2;
			total = n3;
			n1 = n2;
			n2 = n3;				
		}
	}
}