package testes;

import java.util.Arrays;

public class Organizar {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomes[] = new String[] {"Bruno", "Yasmin", "Arnon", "Carlos"};
		for(String n : nomes) {
			System.out.println(n);
		}
		
		System.out.println("\n");
		Arrays.sort(nomes);
		
		for(String n : nomes) {
			System.out.println(n);
		}
	
	}

}
