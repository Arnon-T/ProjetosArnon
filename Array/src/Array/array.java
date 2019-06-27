package Array;

import java.util.Arrays;

public class array {

	public static void main(String[] args) {
		
		int numeros[] = {4,2,1,5,3};
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		Arrays.sort(numeros);
		System.out.println("\n");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		
		int soma = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			 soma += numeros[i];
		}
		System.out.println("\n");
		System.out.println(soma);
		
		int media = soma/numeros.length;
		System.out.println("\n");
		System.out.println(media);
	}

}
