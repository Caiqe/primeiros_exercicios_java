package estruturasDeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//EXERCICIO 1

//Escreva um programa contendo uma Collection Queue (Fila) de Objetos do tipo string, para organizar uma fila por ordem de
//chegada dos Clientes de um Banco. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
//1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
//2: Listar todos os Clientes na fila
//3: Chamar (retirar) uma pessoa da fila 
//0: O programa deve ser finalizado. 
//Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila.

public class ExercicioFila {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Queue<String> clientes = new LinkedList<String>();
		String nomeCliente;
		int opcao;

		do {

			System.out.println("\n\t\tMenu");
			System.out.println("------------------------------------------");
			System.out.println("[1]  -  Adicionar novo cliente a fila");
			System.out.println("[2]  -  Listar todos os clientes na fila");
			System.out.println("[3]  -  Chamar (retirar) pessoa da fila");
			System.out.println("------------------------------------------");
			System.out.println("Digite a opção desejada: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("\n\nInforme o nome do cliente: ");
				nomeCliente = sc.next();

				clientes.add(nomeCliente);

				break;

			case 2:

				if (clientes.isEmpty()) {
					System.out.println("\n\nA fila de espera esta vazia.");
				} else {
					for (String cliente : clientes) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if (clientes.isEmpty()) {

					System.out.println("\n\nA fila de espera esta vazia.");
				} else {
					System.out.println("\n\nChamando: " + clientes.poll());
				}
				break;
			case 0:
				System.out.println("\n\nPrograma encerrado!");
				break;
			default:
				System.out.println("\n\nOpção inválida!");
				break;
			}

		} while (opcao != 0);
		
		sc.close();

	}

}
