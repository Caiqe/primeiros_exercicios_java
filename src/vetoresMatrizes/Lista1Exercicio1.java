package vetoresMatrizes;

import java.util.Scanner;

//EXERCICIO 1
//
//Dado um vetor contendo 10 números inteiros não ordenados e não repetidos, construa um
//algoritmo que consiga pesquisar dados no vetor, onde o usuário irá digitar um número 
//e o programa deve exibir na tela a posição deste número no vetor. Caso o número não 
//seja encontrado, a mensagem: “Não foi encontrado!” deve ser exibida na tela

public class Lista1Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroDesejado, casoNumEncontrado = 0;
		int vetor[] = { 8, 4, 10, 6, 1, 2, 7, 3, 5, 9 };

		System.out.println("\nInforme qual valor deseja encontrar no vetor: ");
		numeroDesejado = sc.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			if (numeroDesejado == vetor[i]) {
				System.out.println("O número " + numeroDesejado + " está localizado na posição: " + i);
				casoNumEncontrado++;
			}
		}
		if (casoNumEncontrado == 0) {
			System.out.println("\nO número " + numeroDesejado + " não foi encontrado!");
		}
		
		sc.close();

	}

}
