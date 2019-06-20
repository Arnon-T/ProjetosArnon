package orientacao_a_objetos;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numerocc1 = 10000001;
		double saldo1 = 999.50;
		//double limite1 = 333.33;  	Comentado para adequar à questão seguinte.

		int numerocc2 = 10000002;
		double saldo2 = 888.30;
		//double limite2 = 777.70; 		Comentado para adequar à questão seguinte.
		
		
		Conta cc1 = new Conta(numerocc1, saldo1);
		Conta cc2 = new Conta(numerocc2, saldo2);	
		
		System.out.println(cc1.limite + " " + cc1.saldo + " " + cc1.numerocc);
		System.out.println(cc2.limite + " " + cc2.saldo + " " + cc2.numerocc);
		
		
	}

}
