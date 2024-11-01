package lacosCondicionais;

import java.util.Scanner;

public class Lista2Exercicio4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		float saldo=1000,deposito,saque;
		
		System.out.println("\n\t\tBANCO");
		System.out.println("\nCÓDIGO DA OPERAÇÃO      OPERAÇÃO");
		System.out.println("\n 1                      SALDO");
		System.out.println("\n 2                      SAQUE");
		System.out.println("\n 3                      DEPÓSITO");
		System.out.println("\n");
		
		opcao = sc.nextInt();
		
		if(opcao>=1 && opcao<=3) 
		{
			switch(opcao) {
			case 1:
				System.out.printf("\nR$%.2f",saldo);
				break;
			case 2: 
				System.out.println("\nInforme o valor do saque: ");
				saque = sc.nextFloat();
				
				if(saque>saldo) {
					System.out.println("\nSaldo insuficiente!!!");
					break;
				}
				else if(saque <0) {
					System.out.println("\nValor inválido!!!");
					break;
				}
				else {
					saldo=saldo-saque;
					System.out.println("\nSaque Realizado");
					System.out.printf("\nSaldo atual: R$%.2f",saldo);
					break;
					
				}
			case 3:
				System.out.println("\nInforme o valor do depósito: ");
				deposito = sc.nextFloat();
				
				if(deposito==0 || deposito<0) 
				{
					System.out.println("\nValor inválido!!!");
					break;
				}
				else
				{
					saldo+=deposito;
					System.out.printf("\nSaldo atual: R$%.2f",saldo);
					break;
				}
			}
		}
		else
		{
			System.out.println("\nOPÇÃO INVÁLIDA");
		}

	}

}
