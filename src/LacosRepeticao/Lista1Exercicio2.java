package lacosRepeticao;

import java.util.Scanner;

//EXERCICIO 2

//Escreva um algoritmo em Java, que leia 10 números inteiros via teclado e mostre na tela 
//quantos números são pares e quantos número são ímpares.

public class Lista1Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, contadorPar=0,contadorImpar=0;
		
		
		for(int i=0; i<10;i++) 
		{
			System.out.println("\nInforme o "+(i+1)+"° número inteiro: ");
			num = sc.nextInt();
			
			if(num%2==0) 
			{
				contadorPar++;
			}
			else 
			{
				contadorImpar++;
			}
		}
		System.out.println("\nt\tQuantidade: ");
		System.out.println("Números pares: "+contadorPar);
		System.out.println("Números ímpares: "+contadorImpar);

	}

}
