package questoes;

import br.com.util.Teclado;

public class Questao14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nome = new String[2];
		double[] nota1 = new double [2];
		double[] nota2 = new double [2];
		double[] mediaAluno = new double[2];
		
		for (int i = 0; i < nota2.length; i++) {
			nome[i] = Teclado.lerTexto("Digite um nome: ");
			nota1[i] = Teclado.lerInt("Digite a nota 1: ");
			nota2[i] = Teclado.lerInt("Digite a nota 2: ");
		}
		double media = 0;
		for (int i = 0; i < nota2.length; i++) {
		
			media = (nota1[i] + nota2[i])/2;
			mediaAluno[i] = media;
			System.out.printf("Nome: %s. Nota 1: %f. Nota 2: %f. Media %f.", nome[i], nota1[i], nota2[i], media);
			if (media >= 5) {
				System.out.println("    APROVADO");
			}
			else {
				System.out.println("    REPROVADO");
			}
		}
		double mediaTurma = 0.0;
		for (int i = 0; i < mediaAluno.length; i++) {
			mediaTurma += (mediaAluno[i]);
		}
		mediaTurma /= mediaAluno.length;	
		System.out.println("Media da turma: " + mediaTurma);
	}

}
