package LacosCondicionais;

import java.util.Scanner;

public class Lista1Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor;
		
		System.out.println("\nInforme um valor: ");
		valor = sc.nextInt();
		
		if(valor%2 == 0)
		{
			if(valor>0) 
			{
				System.out.println("\n O número "+valor+" é par e positivo.");
			}
			else if(valor==0) 
			{
				System.out.println("O valor é igual 0");
			}
			else
			{
				System.out.println("O número "+valor+" é par e negativo.");
			}
		}
		else {
			if(valor>0) 
			{
				System.out.println("\n O número "+valor+" é ímpar e positivo.");
			}
			else if(valor==0) 
			{
				System.out.println("O valor é igual 0");
			}
			else
			{
				System.out.println("O número "+valor+" é ímpar e negativo.");
			}
		}

	}

}
