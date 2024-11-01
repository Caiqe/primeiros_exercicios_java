package exerciciosSegundaSemana;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float nota1,nota2,nota3,nota4,media;
		
		System.out.println("\nInforme a 1° nota: ");
		nota1 = sc.nextFloat();
		System.out.println("\nInforme a 2° nota: ");
		nota2 = sc.nextFloat();
		System.out.println("\nInforme a 3° nota: ");
		nota3 = sc.nextFloat();
		System.out.println("\nInforme a 4° nota: ");
		nota4 = sc.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("\nMédia final: %.1f",media);
		

	}

}
