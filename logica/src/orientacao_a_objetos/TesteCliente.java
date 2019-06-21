package orientacao_a_objetos;

public class TesteCliente {

	public static void main(String[] args) {
					
		Cliente clienteteste1 = new Cliente();		
		Cliente clienteteste2 = new Cliente();
		
		clienteteste1.nomecliente = "Cliente 1";
		clienteteste2.nomecliente = "Cliente 2";
		clienteteste1.codigocliente = 11;
		clienteteste2.codigocliente = 22;
		
		System.out.printf("Nome do cliente %s. Código do cliente %s. \n",   clienteteste1.nomecliente, clienteteste1.codigocliente); //Teste Classe Cliente
		System.out.printf("Nome do cliente %s. Código do cliente %s. \n",   clienteteste2.nomecliente, clienteteste2.codigocliente); //Teste Classe Cliente
		
	}

}
