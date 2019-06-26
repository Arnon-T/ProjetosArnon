package orientacao_a_objetos;

public class Funcionario {
	
	String nome;
<<<<<<< HEAD
	double salario;	
=======
	double salario = 1000.00;	
>>>>>>> ContinuaProjeto
	
	public void aumento(double aumento) {
		this.salario += aumento;
	}
	
	public String consultar(){
		String dados =  "Nome do funcionário: " + this.nome + " . Salário: R$" + this.salario;
		return dados;
	}
	
}
