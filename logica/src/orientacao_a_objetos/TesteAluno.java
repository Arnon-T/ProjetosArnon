package orientacao_a_objetos;

public class TesteAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome1 = "Arnon";
		int rg1 = 555555;
		String nascimento1 = "07/03/1994";
		String nome2 = "Aisha";
		int rg2 = 3333333;
		String nascimento2 = "28/03/2000";
		
		Aluno a1 = new Aluno(nome1, rg1, nascimento1);
		Aluno a2 = new Aluno(nome2, rg2, nascimento2);
		
		System.out.println(a1.nome + " " + a1.rg + " " + a1.nascimento);
		System.out.println(a2.nome + " " + a2.rg + " " + a2.nascimento);
		
	}

}
