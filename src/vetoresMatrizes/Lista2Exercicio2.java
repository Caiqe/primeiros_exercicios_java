package vetoresMatrizes;

import java.util.Scanner;

//EXERCICIO 4

//Elabore um algoritmo que leia as notas de uma classe com 10 participantes
//durante 4 bimestres de um ano. As 4 notas de cada participante serão armazenadas
//em uma linha de uma matriz de números reais, logo cada linha da matriz serão
//as notas de um participante. Em um vetor de números reais, armazene as médias de
//cada participante e exiba as médias de cada um na tela.

public class Lista2Exercicio2 {

	public static void main(String[] args) {

		float notas[][] = new float[10][4];
		float mediaFinal[] = new float[10];
		float somaNotas=0;
		

		Scanner sc = new Scanner(System.in);

		for (int x = 0; x < 10; x++) {
			System.out.println("========================== "+(1+x)+"° Aluno =========================");
			somaNotas=0;
			for (int z = 0; z < 4; z++) {
				System.out.println("\nInforme a nota do " + (z + 1) + "° Bimestre: ");
				notas[x][z] = sc.nextFloat();
				somaNotas += notas[x][z];
				mediaFinal[x]=somaNotas/10;
			}

		}
		System.out.println("\nNotas: \n");
		for (int x = 0; x < 10; x++) {
			System.out.printf("\nNota: %.1f",mediaFinal[x]," \n");
			

		}

	}
}
