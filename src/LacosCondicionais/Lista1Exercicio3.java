package lacosCondicionais;

import java.util.Scanner;

public class Lista1Exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int idade,opcao;
		String nome;
		boolean primeiraDoacao=true;
		
		
		System.out.println("\nInforme o seu nome: ");
		nome = sc.nextLine();
		System.out.println("\nInforme sua idade: ");
		idade = sc.nextInt();
		System.out.println("\nEsta é sua primeira doação? Responda: 1 - Sim \t2 - Não");
		opcao = sc.nextInt();
		
		switch(opcao) {
			case 1:
				primeiraDoacao = true;
				break;
			case 2:
				primeiraDoacao = false;
				break;
				default:
					System.out.println("Opção inválida!!!");
				
		}
		
		if(idade>=18 && idade<=69) {
			if(idade>=60 && idade<=69 && primeiraDoacao==false) 
			{
				System.out.println(nome+" está apto para doar sangue");
			}
			else if(idade>=60 && idade<=69 && primeiraDoacao==true){
				System.out.println(nome+" não está apto para dor sangue");
			}
			else {
				System.out.println(nome+" está apto para doar sangue");
			}
		}
		else {
			System.out.println(nome+" não está apto para doar sangue");
		}
		
		sc.close();

	}

}
