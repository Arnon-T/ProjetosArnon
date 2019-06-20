package orientacao_a_objetos;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero1 = 21;
		int anovalidade1 = 2020;
		int numero2 = 22;
		int anovalidade2 = 2021;
		
		
		CartaoDeCredito cartao1 = new CartaoDeCredito(numero1, anovalidade1);
		CartaoDeCredito cartao2 = new CartaoDeCredito(numero2, anovalidade2);
		
		System.out.println(cartao1.numero + "\n" + cartao1.anovalidade);
		System.out.println(cartao2.numero + "\n" + cartao2.anovalidade);
		
	}

}
