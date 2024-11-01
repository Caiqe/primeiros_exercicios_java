package lacosCondicionais;

import java.util.Scanner;

public class Lista1Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String escolhaEspecie;

		System.out.println("\nA espécie que esta pensando é um : Vertebrado ou Invertebrado ?");
		escolhaEspecie = sc.nextLine();

		// Arvore vertebrado
		if (escolhaEspecie.equalsIgnoreCase("vertebrado")) {
			System.out.println("\nA espécie que esta pensando é uma: Ave ou Mamifero ?");
			escolhaEspecie = sc.nextLine();

			if (escolhaEspecie.equalsIgnoreCase("ave")) {
				System.out.println("\nA espécie que esta pensando é um: Carnívoro ou Onívoro ?");
				escolhaEspecie = sc.nextLine();

				if (escolhaEspecie.equalsIgnoreCase("carnívoro")) {
					System.out.println("\nA espécie que esta pensando é: Águia");

				}

				else if (escolhaEspecie.equalsIgnoreCase("onívoro")) {
					System.out.println("\nA espécie que esta pensando é: Pombo");
				} else {
					System.out.println("Não consegui entender oque tentou digitar!");
				}
			}

			if (escolhaEspecie.equalsIgnoreCase("Mamífero")) {
				System.out.println("\nA espécie que esta pensando é um: Onívoro ou Herbívoro ?");
				escolhaEspecie = sc.nextLine();

				// escolha onivoro
				if (escolhaEspecie.equalsIgnoreCase("onívoro")) {
					System.out.println("\nA espécie que esta pensando é: Humano");
				} else if (escolhaEspecie.equalsIgnoreCase("Herbívoro")) {
					System.out.println("\nA espécie que esta pensando é: Vaca");
				} else {
					System.out.println("Não consegui entender oque tentou digitar!");
				}

			}
		}
		// arvore invertebrado
		else if (escolhaEspecie.equalsIgnoreCase("Invertebrado")) {
			System.out.println("\nA espécie que esta pensando é um: Inseto ou Anelídeo ?");
			escolhaEspecie = sc.nextLine();

			if (escolhaEspecie.equalsIgnoreCase("Inseto")) {
				System.out.println("\nA espécie que esta pensando é um: Hematófago ou Herbívoro ?");
				escolhaEspecie = sc.nextLine();

				if (escolhaEspecie.equalsIgnoreCase("Hematófago")) {
					System.out.println("\nA espécie que você esta pensando é: Pulga");
				} else if (escolhaEspecie.equalsIgnoreCase("Herbívoro")) {
					System.out.println("\nA espécie que você esta pensando é: Lagarta");
				} else {
					System.out.println("Não consegui entender oque tentou digitar!");
				}
			}
			// escolha anelidio
			else if (escolhaEspecie.equalsIgnoreCase("Anelídio")) {
				System.out.println("\nA espécie que esta pensando é um: Hematófago ou Onívoro ?");
				escolhaEspecie = sc.nextLine();

				if (escolhaEspecie.equalsIgnoreCase("Hematófago")) {
					System.out.println("\nA espécie que esta pensando é: Sanguessuga");
				} else if (escolhaEspecie.equalsIgnoreCase("Onívoro")) {
					System.out.println("\nA espécie que esta pensando é: Minhoca");
				} else {
					System.out.println("Não consegui entender oque tentou digitar!");
				}
			}
		} else {
			System.out.println("Não consegui entender oque tentou digitar!");
		}
		
		sc.close();

	}

}
