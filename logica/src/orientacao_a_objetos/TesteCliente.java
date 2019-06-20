package orientacao_a_objetos;

public class TesteCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome1 = "Arnon";
		int codigo1 = 02;
		String nome2 = "João";
		int codigo2 = 03;
		
		Cliente novo1 = new Cliente(nome1, codigo1);		
		Cliente novo2 = new Cliente (nome2, codigo2);
		
		System.out.println(novo1.cliente + "\n" + novo1.codigo);
		System.out.println(novo2.cliente + "\n" + novo2.codigo);
		
	}

}
