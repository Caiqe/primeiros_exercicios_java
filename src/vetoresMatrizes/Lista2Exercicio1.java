package vetoresMatrizes;

import java.util.Scanner;

//EXERCICIO 3

//Elabore um algoritmo que leia uma Matriz 3x3 de números inteiros e em seguida, mostre na tela:
//Todos os elementos da Diagonal Principal
//Todos os elementos da Diagonal Secundária
//A Soma de todos os elementos da Diagonal Principal
//A Soma de todos os elementos da Diagonal Secundária

public class Lista2Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int matriz[][] = new int[3][3];
		int somaPrincipal = 0, somaSecundaria = 0;

		for (int i = 0; i < 3; i++) {
			for (int x = 0; x < 3; x++) {
				System.out.println("Informe um valor para: Linha " + (i + 1) + " Coluna " + (x + 1));
				matriz[i][x] = sc.nextInt();
			}
		}
		System.out.println("\nElementos na diagonal principal: \n");
		for (int i = 0; i < 3; i++) {
			for (int x = 0; x < 3; x++) {
				if (i == x) {
					System.out.print(matriz[i][x] + " ");
					somaPrincipal += matriz[i][x];
				}

			}
		}
		System.out.println("\nElementos na diagonal secundária: \n");
		for (int i = 0; i <3; i++) {
			for (int x = 0; x <3; x++) {
				if(i+x==2) {
					System.out.print(matriz[i][x] + " ");
					somaSecundaria += matriz[i][x];
				}
			}

		}
		System.out.println("\nSoma dos elementos da diagonal principal: "+somaPrincipal);
		System.out.println("\nSoma dos elementos da diagonal secundária: "+somaSecundaria);
	}

}
