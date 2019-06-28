package orientacao_a_objetos;

import br.com.util.Teclado;

public class TesteFuncionario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Crie uma classe chamada TesteFuncionario2. Dentro dessa classe, crie um objeto do tipo Funcionario.
		 * Receba do teclado o valor para o atributo nome. Depois crie um laço que permita que o usuário possa alterar o 
		 * nome e o salário dos funcionários e
		 *  também visualizar os dados atuais.
		 */
		String finaliza = "s";
		Funcionario func1 = new Funcionario();
		
		func1.nome = Teclado.lerTexto("Digite o nome do funcionário: ");
		func1.salario = Teclado.lerDouble("Digite o salário do funcionário: ");
		System.out.println("Nome: " + func1.nome);
		System.out.println("Salário: " + func1.salario);
		finaliza = Teclado.lerTexto("Alterar? (s/n)");
		
		while (finaliza == "s") {
			func1.nome = Teclado.lerTexto("Digite o nome do funcionário: ");
			func1.salario = Teclado.lerDouble("Digite o salário do funcionário: ");
			finaliza = Teclado.lerTexto("Alterar novamente? (s/n)");	
			System.out.println("Nome: " + func1.nome);
			System.out.println("Salário: " + func1.salario);
		}
	}

}
