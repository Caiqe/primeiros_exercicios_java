package ExerciciosSegundaSemana;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float salario, abono, novo, novoSalario;
		
		System.out.println("Informe o salário: ");
		salario = sc.nextFloat();
		
		System.out.println("\nInforme o valor do abono: ");
		abono = sc.nextFloat();
		
		novoSalario = salario+abono;
		
		System.out.println("\nO novo valor do salário é: R$"+novoSalario);

	}

}