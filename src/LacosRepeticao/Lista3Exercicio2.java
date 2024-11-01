package lacosRepeticao;

import java.util.Scanner;

//EXERCICIO 6
//Escreva um algoritmo em Java, que leia números inteiros via teclado,
//até que o número zero seja digitado. Ao final, mostre na tela a média
//de todos os números digitados, que sejam múltiplos de 3.

public class Lista3Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num,contNum=0;
		float somaNum=0,media;
		
		do 
		{
			System.out.println("\nInforme um número inteiro: ");
			num = sc.nextInt();
			
			if(num%3==0 && num!=0) 
			{
				contNum++;
				somaNum= somaNum+num;
				
			}
		}while(num!=0);
		media = somaNum/contNum;
		System.out.println("\nA média de todos o números múltiplo de 3 é: "+media);

	}

}
