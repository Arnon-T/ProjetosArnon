package orientacao_a_objetos;

public class TesteCartaoDeCredito {

	public static void main(String[] args) {
		/*
		 	Utilizei esta Classe para:
		 	Testar os atributos da Classe CartaoDeCredito; e
		 	Testar a conexão entre a Classe CartaoDeCredito e a Classe Cliente.
		 */
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
		
		CartaoDeCredito cartao1 = new CartaoDeCredito(); //Teste Classe CartaoDeCredito
		CartaoDeCredito cartao2 = new CartaoDeCredito(); //Teste Classe CartaoDeCredito
		
		cartao1.cliente = cliente1; // Teste conexão Classe CartaoDeCredito e Classe Cliente.
		cartao2.cliente = cliente2; // Teste conexão Classe CartaoDeCredito e Classe Cliente.
		
		cartao1.numero = 11111111;
		cartao2.numero = 22222222;
		cartao1.anovalidade = 2021;
		cartao2.anovalidade = 2022;
		cartao1.cliente.codigocliente = 11;
		cartao2.cliente.codigocliente = 22;
		
		System.out.printf("Cartão %d, validade %d, código cliente %d." + "\n", cartao1.numero, cartao1.anovalidade, cartao1.cliente.codigocliente); //Teste output conexão entre Classe Cliente e Classe Cartao de Crédito
		System.out.printf("Cartão %d, validade %d, código cliente %d." + "\n", cartao2.numero, cartao2.anovalidade, cartao2.cliente.codigocliente); //Teste output conexão entre Classe Cliente e Classe Cartao de Crédito
				
	}

}
