package orientacao_a_objetos;

public class TesteAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numeroag1 = 101;
		int numeroag2 = 102;
		
		Agencia ag1 = new Agencia(numeroag1);
		Agencia ag2 = new Agencia(numeroag2);
		
		System.out.println(ag1.numeroag + "\n" + ag2.numeroag);
		
	}

}
