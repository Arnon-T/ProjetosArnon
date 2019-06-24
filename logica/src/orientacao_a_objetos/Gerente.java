package orientacao_a_objetos;

public class Gerente {
	String nome;
	double salario;
	private final double aumentopadrao = 1.1;
		
	// M�todo de aumento fixo.
	public void aumento() {
		this.salario *= aumentopadrao;
	}
	// M�todo de aumento vari�vel.
	public void aumento(double valoraumento) {
		this.salario += valoraumento;
	}
	
}
