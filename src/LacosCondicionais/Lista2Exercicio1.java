package lacosCondicionais;

import java.util.Scanner;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int codigoProduto,qtdProduto;
		float valorCompra;
		
		System.out.println("\n\t\tMenu");
		System.out.println("\nCódigo   Produto            Preço");
		System.out.println("\n 1       Cachorro Quente    R$10,00");
		System.out.println("\n 2       X-Salada           R$15,00");
		System.out.println("\n 3       X-Bacon            R$18,00");
		System.out.println("\n 4       Bauru              R$12,00");
		System.out.println("\n 5       Refrigerante       R$ 8,00");
		System.out.println("\n 6       Suco de Laranja    R$13,00");
		System.out.println("\n");
		
		codigoProduto = sc.nextInt();
		
		if(codigoProduto>=1 && codigoProduto<=6) {
		
			System.out.println("\nInforme qual a quantidade: ");
			qtdProduto = sc.nextInt();
			
			switch(codigoProduto) {
			case 1: 
				valorCompra = 10*qtdProduto;
				
				System.out.println("\nProduto selecionado: Cachorro Quente");
				System.out.printf("\nValor total: R$%.2f",valorCompra);
				break;
			case 2: 
				valorCompra = 15*qtdProduto;
				
				System.out.println("\nProduto selecionado: X-Salada");
				System.out.printf("\nValor total: R$%.2f",valorCompra);
				break;
			case 3: 
				valorCompra = 18*qtdProduto;
				
				System.out.println("\nProduto selecionado: X-Bacon");
				System.out.printf("\nValor total: R$%.2f",valorCompra);
				break;
			case 4: 
				valorCompra = 12*qtdProduto;
				
				System.out.println("\nProduto selecionado: Bauru");
				System.out.printf("\nValor total: R$%.2f",valorCompra);
				break;
			case 5: 
				valorCompra = 8*qtdProduto;
				
				System.out.println("\nProduto selecionado: Refrigerante");
				System.out.printf("\nValor total: R$%.2f",valorCompra);
				break;
			case 6:
				valorCompra = 13*qtdProduto;
				
				System.out.println("\nProduto selecionado: Suco de Laranja");
				System.out.printf("\nValor total: R$%.2f",valorCompra);
				break;
				
			}
		}
		else {
			System.out.println("\nOpção escolhida inválida!!!");
		}

	}

}
