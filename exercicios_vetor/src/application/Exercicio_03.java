package application;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, qtdpares;
				
		System.out.print("Quantos numeros você vai digitar? ");
		n = sc.nextInt();
		int[] vetor = new int [n];
		
		for (int i=0; i<vetor.length; i++) {
			System.out.print("Digite um numero: ");
			vetor[i] = sc.nextInt();
		}
		
		System.out.println("\nNUMEROS PARES:");
		
		qtdpares = 0;
		for (int i=0; i<vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
					System.out.printf("%d ", vetor[i]);
				qtdpares++;
			}
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);		
		
		sc.close();
	}

}
