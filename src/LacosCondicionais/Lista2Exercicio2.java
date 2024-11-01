package lacosCondicionais;

import java.util.Scanner;

public class Lista2Exercicio2 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		int opcaoTabela;
		double salario,salarioReajuste;
		
		System.out.println("\nInforme seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("\nInforme seu salário: ");
		salario = sc.nextFloat();
		
		System.out.println("\nCódigo   Cargo            ");
		System.out.println("\n 1       Gerente    ");
		System.out.println("\n 2       Vendedor           ");
		System.out.println("\n 3       Supervisor           ");
		System.out.println("\n 4       Motorista             ");
		System.out.println("\n 5       Estoquista       ");
		System.out.println("\n 6       Técnico de TI    ");
		System.out.println("\n");
		
		System.out.println("\nInforme seu cargo: ");
		opcaoTabela = sc.nextInt();
		
		if(opcaoTabela>=1 && opcaoTabela<=6) 
		{
			switch(opcaoTabela) {
			case 1: 
				System.out.println("\nNome do colaborador: "+nome);
				System.out.println("\nCargo: Gerente");
				salarioReajuste = salario*1.1;
				System.out.printf("\nSalário: R$%.2f",salarioReajuste);
				break;
			case 2:
				System.out.println("\nNome do colaborador: "+nome);
				System.out.println("\nCargo: Vendedor");
				salarioReajuste = salario*1.07;
				System.out.printf("\nSalário: R$%.2f",salarioReajuste);
				break;
			case 3:
				System.out.println("\nNome do colaborador: "+nome);
				System.out.println("\nCargo: Supervisor");
				salarioReajuste = salario*1.09;
				System.out.printf("\nSalário: R$%.2f",salarioReajuste);
				break;
			case 4:
				System.out.println("\nNome do colaborador: "+nome);
				System.out.println("\nCargo: Motorista");
				salarioReajuste = salario*1.06;
				System.out.printf("\nSalário: R$%.2f",salarioReajuste);
				break;
			case 5:
				System.out.println("\nNome do colaborador: "+nome);
				System.out.println("\nCargo: Estoquista");
				salarioReajuste = salario*1.05;
				System.out.printf("\nSalário: R$%.2f",salarioReajuste);
				break;
			case 6:
				System.out.println("\nNome do colaborador: "+nome);
				System.out.println("\nCargo: Técnico de TI");
				salarioReajuste = salario*1.08;
				System.out.printf("\nSalário: R$%.2f",salarioReajuste);
				break;
			}
		}

	}

}
