package ExerciciosSegundaSemana;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salarioBruto, adNoturno,hrExtra,desconto,salarioLiquido;
		
		System.out.println("\nInforme o sálario bruto do colaborador: ");
		salarioBruto = sc.nextFloat();
		
		System.out.println("\nInforme o valor do adicional noturno: ");
		adNoturno = sc.nextFloat();
		
		System.out.println("\nInforme o valor das horas extras: ");
		hrExtra = sc.nextFloat();
		
		System.out.println("\nInforme o valor dos descontos: ");
		desconto = sc.nextFloat();
		
		salarioLiquido = (salarioBruto+adNoturno+(hrExtra*5))-desconto;
		System.out.printf("\nValor do salário liquído: %.2f",salarioLiquido);
	}

}
