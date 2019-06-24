package orientacao_a_objetos;

public class Gerente {
	String nome;
	double salario;
	private final double aumentopadrao = 1.1;
		
	// Método de aumento fixo.
	public void aumento() {
		this.salario *= aumentopadrao;
	}
	// Método de aumento variável.
	public void aumento(double valoraumento) {
		this.salario += valoraumento;
	}
	
}
