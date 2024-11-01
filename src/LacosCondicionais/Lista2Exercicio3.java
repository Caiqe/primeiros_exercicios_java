package lacosCondicionais;

import java.util.Scanner;

public class Lista2Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigo;
		float valor1, valor2, resultado;

		do {
			System.out.println("\n\t==== | Informe o tipo da operação | ====\n");
			System.out.println("\t\tCódigo    Operação            ");
			System.out.println("\t\t [1]   |   Soma    ");
			System.out.println("\t\t [2]   |   Subtração           ");
			System.out.println("\t\t [3]   |   Multiplicação           ");
			System.out.println("\t\t [4]   |   Divisão             ");
			System.out.println("");

			codigo = sc.nextInt();

			System.out.println("\nInforme o primeiro valor: ");
			valor1 = sc.nextFloat();
			System.out.println("\nInforme o segundo valor: ");
			valor2 = sc.nextFloat();
			switch (codigo) {
			case 1:
				resultado = valor1 + valor2;

				System.out.println(valor1 + " + " + valor2 + " = " + resultado);
				break;
			case 2:
				resultado = valor1 - valor2;

				System.out.println(valor1 + " - " + valor2 + " = " + resultado);
				break;
			case 3:
				resultado = valor1 * valor2;

				System.out.println(valor1 + " x " + valor2 + " = " + resultado);
				break;
			case 4:
				if (valor2 == 0) {
					System.out.println("\nNão é possível fazer divisão por zero.");
					break;
				} else {
					resultado = valor1 / valor2;

					System.out.println(valor1 + " / " + valor2 + " = " + resultado);
					break;
				}
			case 0:
				System.out.println("\nPrograma encerrado!");
				break;
			default:
				System.out.println("\nOpção inválida!!!");

			}
		} while (codigo != 0);
		
		
		sc.close();

	}

}
