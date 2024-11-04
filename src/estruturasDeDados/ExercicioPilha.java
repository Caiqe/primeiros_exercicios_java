package estruturasDeDados;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//EXERICICIO 2

//Escreva um programa contendo uma Collection Stack (Pilha) de Objetos string, para organizar a retirada de livros 
//de uma pilha. O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
//1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
//2: Listar todos os livros da Pilha
//3: Retirar um livro da pilha 
//0: O programa deve ser finalizado. 
//Caso a pilha esteja vazia, ao tentar retirar um livro da pilha, o programa deverá informar que a pilha está vazia.

public class ExercicioPilha {

	public static void main(String[] args) {
		
		
		Stack<String> livros = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		int opcao;
		String novoLivro;
		
		do {

			
			System.out.println("------------------------------------------");
			System.out.println("[1]  -  Adicionar novo livro a pilha");
			System.out.println("[2]  -  Listar todos os livros na pilha");
			System.out.println("[3]  -  Retirar livro da pilha");
			System.out.println("------------------------------------------");
			System.out.println("Digite a opção desejada: ");
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch(opcao) {
			
			case 1: 
				System.out.println("\n\nInforme o nome do livro: ");
				novoLivro = sc.nextLine();
				
				livros.add(novoLivro);
				break;
			case 2:
				if(livros.isEmpty()) {
					System.out.println("\n\nA pilha esta vazia.");
				}
				else {
					for(String livro : livros) {
						System.out.println(livro);
					}
				}
				break;
			case 3: 
				if(livros.isEmpty()) {
					System.out.println("\n\nA pilha esta vazia.");
				}
				else {
					System.out.println("Livro removido: "+livros.pop());
				}
				break;
			case 0:
				System.out.println("\nPrograma encerrado!");
				break;
				default:
					System.out.println("Opção inválida!");
					break;
			}
			
		}while(opcao!=0);


	}

}
