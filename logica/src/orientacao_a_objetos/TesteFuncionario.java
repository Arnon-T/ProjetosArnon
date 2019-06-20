package orientacao_a_objetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome1 = "Pedro";
		double salario1 = 557.00;
		String nome2 = "Alfredo";
		double salario2 = 777.00;
		
		Funcionario func1 = new Funcionario(nome1, salario1);
		Funcionario func2 = new Funcionario(nome2, salario2);
		
		System.out.println(func1.nome + " " + func1.salario);
		System.out.println(func2.nome + " " + func2.salario);
		
	}

}
