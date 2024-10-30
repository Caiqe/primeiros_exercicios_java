package LacosRepeticao;

import java.util.Scanner;

//EXERCICIO 5
//Escreva um algoritmo em Java, que leia números inteiros via teclado, até que o número zero
//seja digitado. Ao final, mostre na tela a soma de todos os números digitados, que sejam positivos.
public class Lista3Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num,somaNumero=0;

		do 
		{

			System.out.println("\nInforme um número inteiro: ");
			num = sc.nextInt();
			
			if(num>0) 
			{
				somaNumero+=num;
			}

		} while (num != 0);
		System.out.println("\nA soma dos números positivos é: "+somaNumero);

	}

}
