package exerciciosSegundaSemana;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		float num1,num2,num3,num4,calculo;
		
		System.out.println("\nInforme o primeiro número: ");
		num1 = sc.nextFloat();
		System.out.println("\nInforme o segundo número: ");
		num2 = sc.nextFloat();
		System.out.println("\nInforme o terceiro número: ");
		num3 = sc.nextFloat();
		System.out.println("\nInforme o quarto número: ");
		num4 = sc.nextFloat();
		
		calculo = (num1*num2)-(num3*num4);
		
		System.out.println("\nA diferença é: "+calculo);
		
		sc.close();

	}

}
