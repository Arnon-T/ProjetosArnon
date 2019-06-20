package orientacao_a_objetos;

public class TesteTurma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String periodo1 = "Matutino";
		int serie1 = 5;
		String sigla1 = "A";
		String tipoensino1 = "Fundamental";
		String periodo2 = "Vespertino";
		int serie2 = 7;
		String sigla2 = "B";
		String tipoensino2 = "Médio";
		
		Turma t1 = new Turma(periodo1, serie1, sigla1, tipoensino1);
		Turma t2 = new Turma(periodo2, serie2, sigla2, tipoensino2);
		
		System.out.println(t1.periodo + " " + t1.serie + " " + t1.sigla + " " + t1.tipoensino);
		System.out.println(t2.periodo + " " + t2.serie + " " + t2.sigla + " " + t2.tipoensino);
		
	}

}
