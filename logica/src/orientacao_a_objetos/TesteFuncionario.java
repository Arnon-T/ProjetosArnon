package orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		/*
		 *	Nesta Classe são testados Objetos da Classe Funcionário; e
		 *	Métodos da Classe Funcionário.
		 */
		
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		
		funcionario1.nome = "Funcionário 1";
		funcionario1.salario = 1000.0;
		funcionario2.nome = "Funcionário 2";
		funcionario2.salario = 2000.0;
		
		System.out.printf("Nome do funcionário: %s. Salário do funcionário: %f. \n", funcionario1.nome, funcionario1.salario); // Teste Classe Funcionário
		System.out.printf("Nome do funcionário: %s. Salário do funcionário: %f. \n", funcionario2.nome, funcionario2.salario); // Teste Classe Funcionário
		
		// Teste de métodos aumento e consultar.
		
		funcionario1.aumento(111.0);
		System.out.println(funcionario1.consultar());
		funcionario2.aumento(222.0);
		System.out.println(funcionario2.consultar());		
		
	}

}
