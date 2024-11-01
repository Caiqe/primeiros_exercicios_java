package lacosCondicionais;

import java.util.Scanner;

public class Lista2Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		float valor1,valor2,resultado;
		
		System.out.println("\n\t\tInforme o tipo da operação");
		System.out.println("\nCódigo   Operação            ");
		System.out.println("\n 1       Soma    ");
		System.out.println("\n 2       Subtração           ");
		System.out.println("\n 3       Multiplicação           ");
		System.out.println("\n 4       Divisão             ");
		System.out.println("\n");
		
		codigo = sc.nextInt();
		
		if(codigo>=1 &&codigo<=4) 
		{
			System.out.println("\nInforme o primeiro valor: ");
			valor1 = sc.nextFloat();
			System.out.println("\nInforme o segundo valor: ");
			valor2 = sc.nextFloat();
			switch(codigo) {
			case 1:
				resultado = valor1 +valor2;
				
				System.out.println(valor1+" + "+valor2+" = "+resultado);
				break;
			case 2:
				resultado = valor1 - valor2;
				
				System.out.println(valor1+" - "+valor2+" = "+resultado);
				break;
			case 3:
				resultado = valor1 * valor2;
				
				System.out.println(valor1+" x "+valor2+" = "+resultado);
				break;
			case 4:
				if(valor2==0) 
				{
					System.out.println("\nNão é possível fazer divisão por zero.");
					break;
				}else 
				{
					resultado = valor1 / valor2;
					
					System.out.println(valor1+" / "+valor2+" = "+resultado);
					break;
				}
				
				
				
				
			}
		}

	}

}
