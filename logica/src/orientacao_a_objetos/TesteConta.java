package orientacao_a_objetos;

public class TesteConta {

	public static void main(String[] args) {
		/*
		  	Utilizei esta classe para:
		  	Testar os atributos da Classe Conta; e 
		  	Testar a conex�o entre a Classe Conta e a Classe Agencia
		*/
		
		Agencia ag1 = new Agencia(101);
		Agencia ag2 = new Agencia(202);
		
		Conta cc1 = new Conta(ag1);
		Conta cc2 = new Conta(ag2);
		
		cc1.agencia = ag1; // Teste conex�o Classe Conta e Classe Agencia
		cc2.agencia = ag2; // Teste conex�o Classe Conta e Classe Agencia
		
		cc1.numerocc = 1001;
		//cc1.agencia.numeroag = 101;
		//cc1.limite = 200     Comentado para adequar limite ao valor fixado pelo exerc�cio (100).
		cc1.saldo = 10000.0;		
		cc2.numerocc = 2002;
		//cc2.agencia.numeroag = 202;
		//cc2.limite = 200     Comentado para adequar limite ao valor fixado pelo exerc�cio (100).
		cc2.saldo = 20000.0;
		
		System.out.printf("Conta n�mero: %d. Ag�ncia: %d Limite: R$%f. Saldo: R$%f. \n", cc1.numerocc, cc1.agencia.numeroag, cc1.limite, cc1.saldo);
		System.out.printf("Conta n�mero: %d. Ag�ncia: %d Limite: R$%f. Saldo: R$%f. \n", cc2.numerocc, cc2.agencia.numeroag, cc2.limite, cc2.saldo);
		
		// Teste de m�todos.
		
		cc1.deposito(1000.0); 	// M�todo de dep�sito.
		cc1.saque(1.0); 		// M�todo de saque.
		cc1.imprimeExtrato(); 	// M�todo de impress�o Extrato (Saldo).
		cc1.getSaldo(); 		// M�todo de Saldo Dispon�vel (Saldo + Limite).
		
		cc2.deposito(1000.0); 	// M�todo de dep�sito.
		cc2.saque(1.0); 		// M�todo de saque.
		cc2.imprimeExtrato(); 	// M�todo de impress�o Extrato (Saldo).
		cc2.getSaldo(); 		// M�todo de Saldo Dispon�vel (Saldo + Limite).
		
		// Demonstra fun��es realizadas pelos m�todos.
		
		System.out.printf("Conta n�mero: %d. Ag�ncia: %d Limite: R$%f. Saldo: R$%f. \n", cc1.numerocc, cc1.agencia.numeroag, cc1.limite, cc1.saldo);
		System.out.printf("Conta n�mero: %d. Ag�ncia: %d Limite: R$%f. Saldo: R$%f. \n", cc2.numerocc, cc2.agencia.numeroag, cc2.limite, cc2.saldo);
		
		// Testa o m�todo transfere
		
		cc1.transfere(cc1, cc2, 1000.00);
		
		System.out.printf("Conta n�mero: %d. Ag�ncia: %d Limite: R$%f. Saldo: R$%f. \n", cc1.numerocc, cc1.agencia.numeroag, cc1.limite, cc1.saldo);
		System.out.printf("Conta n�mero: %d. Ag�ncia: %d Limite: R$%f. Saldo: R$%f. \n", cc2.numerocc, cc2.agencia.numeroag, cc2.limite, cc2.saldo);
		
	}

}
