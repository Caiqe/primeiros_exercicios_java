package lacosCondicionais;

import java.util.Scanner;

public class Lista2Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int codigoProduto, qtdProduto;
		float valorCompra;

		do {
			System.out.println("\n\t\t| Menu |");
			System.out.println("|_______________________________________ |");
			System.out.println("|Código |       Produto       |  Preço   |");
			System.out.println("|========================================|");
			System.out.println("| [1]   |    Cachorro Quente  |  R$10,00 |");
			System.out.println("| [2]   |    X-Salada         |  R$15,00 |");
			System.out.println("| [3]   |    X-Bacon          |  R$18,00 |");
			System.out.println("| [4]   |    Bauru            |  R$12,00 |");
			System.out.println("| [5]   |    Refrigerante     |  R$ 8,00 |");
			System.out.println("| [6]   |    Suco de Laranja  |  R$13,00 |");
			System.out.println("|_______|_____________________|_________ |");
			System.out.println("     *Digite 0 para fechar o menu* ");

			codigoProduto = sc.nextInt();

			switch (codigoProduto) {
			case 1:
				System.out.println("\nInforme qual a quantidade: ");
				qtdProduto = sc.nextInt();

				valorCompra = 10 * qtdProduto;

				System.out.println("\nProduto selecionado: Cachorro Quente");
				System.out.printf("\nValor total: R$%.2f", valorCompra);
				break;
			case 2:
				System.out.println("\nInforme qual a quantidade: ");
				qtdProduto = sc.nextInt();

				valorCompra = 15 * qtdProduto;

				System.out.println("\nProduto selecionado: X-Salada");
				System.out.printf("\nValor total: R$%.2f", valorCompra);
				break;
			case 3:
				System.out.println("\nInforme qual a quantidade: ");
				qtdProduto = sc.nextInt();

				valorCompra = 18 * qtdProduto;

				System.out.println("\nProduto selecionado: X-Bacon");
				System.out.printf("\nValor total: R$%.2f", valorCompra);
				break;
			case 4:
				System.out.println("\nInforme qual a quantidade: ");
				qtdProduto = sc.nextInt();

				valorCompra = 12 * qtdProduto;

				System.out.println("\nProduto selecionado: Bauru");
				System.out.printf("\nValor total: R$%.2f", valorCompra);
				break;
			case 5:
				System.out.println("\nInforme qual a quantidade: ");
				qtdProduto = sc.nextInt();

				valorCompra = 8 * qtdProduto;

				System.out.println("\nProduto selecionado: Refrigerante");
				System.out.printf("\nValor total: R$%.2f", valorCompra);
				break;
			case 6:
				System.out.println("\nInforme qual a quantidade: ");
				qtdProduto = sc.nextInt();

				valorCompra = 13 * qtdProduto;

				System.out.println("\nProduto selecionado: Suco de Laranja");
				System.out.printf("\nValor total: R$%.2f", valorCompra);
				break;
			case 0: 
				System.out.println("Volte sempre! Programa encerrado.");
				break;
			default:
				System.out.println("\nOpção escolhida inválida!!!");
				break;

			}
		} while (codigoProduto != 0);

		sc.close();

	}

}
