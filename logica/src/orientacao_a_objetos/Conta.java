package orientacao_a_objetos;

public class Conta {	
	
	int numerocc;
	double saldo;
	double limite = 100.0;
	public Agencia agencia;
	
	public void deposito(double valordeposito) {
		this.saldo += valordeposito;
	}
	
	public void saque(double valorsaque) {
		this.saldo -= valorsaque;
	}
	
	public void imprimeExtrato() {
		System.out.printf("Seu saldo � de R$%f.\n", this.saldo); // M�todo void utilizado apenas para impress�o formatada de extrato de conta (saldo atual sem limite de cr�dito).
	}
	
	public double getSaldo() {
		return this.saldo + this.limite; // O Saldo dispon�vel inclui o valor do limite de cr�dito do cliente.
	}
	
}
