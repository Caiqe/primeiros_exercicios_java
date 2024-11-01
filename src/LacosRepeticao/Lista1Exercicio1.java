package lacosRepeticao;

import java.util.Scanner;

//EXERCICIO 1:

//Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número deve ser menor do que o 
//segundo número. Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e sair do 
//programa. No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5.

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1,num2;
		
		
		System.out.println("\nInforme o primeiro valor: ");
		num1 = sc.nextInt();
		System.out.println("\nInforme o segundo valor: ");
		num2 = sc.nextInt();
		
		if(num1>num2) 
		{
			System.out.println("\nIntervalo inválido!!!");
		}
		else 
		{
			for(int i = num1;i<=num2; i++) {
				if(i%3==0 && i%5==0) 
				{
					System.out.println("\nO número "+i+" é múltiplo de 3 e 5.");
				}
			}
		}
		
		
		

	}

}
