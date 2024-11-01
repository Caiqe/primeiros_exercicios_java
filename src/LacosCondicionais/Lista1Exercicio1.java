package lacosCondicionais;

import java.util.Scanner;

public class Lista1Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int valor1,valor2,valor3,somaValor;
		
		System.out.println("Informe o primeiro valor: ");
		valor1 = sc.nextInt();
		System.out.println("Informe o segundo valor: ");
		valor2 = sc.nextInt();
		System.out.println("Informe o terceiro valor: ");
		valor3 = sc.nextInt();
		
		somaValor = valor1 + valor2;
		
		
		if(somaValor>valor3) 
		{
			System.out.println("\nA soma de A + B é maior que C ");
		}
		else if(somaValor==valor3) 
		{
			System.out.println("\nA soma de A = B é igual a C");
		}
		else {
			System.out.println("\nA soma de A + B é menor que C");
		}

	}

}
