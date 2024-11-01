package vetoresMatrizes;

import java.util.Scanner;

//EXERCICIO 2

//Elabore um algoritmo que leia 10 números inteiros e armazene em um vetor. Em seguida, mostre na tela:
//Todos os elementos dos índices ímpares do vetor 
//Todos os elementos do vetor que são números pares
//A Soma de todos os elementos do vetor
//A Média de todos os elementos do vetor, armazenada em uma variável do tipo real

public class Lista1Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vetorInt[] = new int[10];
		int somaValor = 0;
		float media;

		for (int i = 0; i < vetorInt.length; i++) {
			System.out.println("\nEntre com um valor para o " + (i + 1) + "° vetor: ");
			vetorInt[i] = sc.nextInt();
			somaValor += vetorInt[i];
		}
		System.out.println("\nElementos nos índices ímpares: \n");
		for (int i = 0; i < vetorInt.length; i++) {

			if (i % 2 != 0) {
				System.out.print(vetorInt[i] + " ");
			}

		}
		System.out.println("\nElementos pares: \n");
		for (int i = 0; i < vetorInt.length; i++) {
			if (vetorInt[i] % 2 == 0) {
				System.out.print(vetorInt[i] + " ");
			}
		}
		media = (float) somaValor / 10;

		System.out.println("\nSoma: \n" + somaValor);
		System.out.println("\nMédia: \n" + media);

		sc.close();

	}

}
