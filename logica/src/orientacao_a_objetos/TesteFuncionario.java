package orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		/*
		 *	Nesta Classe s�o testados Objetos da Classe Funcion�rio; e
		 *	M�todos da Classe Funcion�rio.
		 */
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		
		funcionario1.nome = "Funcion�rio 1";
		funcionario1.salario = 1000.0;
		funcionario2.nome = "Funcion�rio 2";
		funcionario2.salario = 2000.0;
		
		System.out.printf("Nome do funcion�rio: %s. Sal�rio do funcion�rio: %f. \n", funcionario1.nome, funcionario1.salario); // Teste Classe Funcion�rio
		System.out.printf("Nome do funcion�rio: %s. Sal�rio do funcion�rio: %f. \n", funcionario2.nome, funcionario2.salario); // Teste Classe Funcion�rio
		
		// Teste de m�todos aumento e consultar.
		
		funcionario1.aumento(111.0);
		System.out.println(funcionario1.consultar());
		funcionario2.aumento(222.0);
		System.out.println(funcionario2.consultar());		
		
	}

}
