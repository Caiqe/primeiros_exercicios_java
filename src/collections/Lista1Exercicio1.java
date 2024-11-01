package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//EXERCICICO 1

//Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe String.
//O programa deverá solicitar ao usuário, que ele digite via teclado 5 cores e deverá adicioná-las
// individualmente no ArrayList. Em seguida, faça o que se pede:
//Mostre na tela todas as cores que foram adicionadas. 
//Mostre na tela todas as cores que foram adicionadas ordenadas em ordem crescente.


public class Lista1Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		List<String> cores = new ArrayList<String>();
		
		int tamanhoLista;
		String cor;
		
		System.out.println("\nQuantas cores deseja inserir na lista? ");
		tamanhoLista = sc.nextInt();
		
		for(int i=0; i< tamanhoLista; i++) {
			
			System.out.println("\nInforme uma cor para a lista: ");
			cor = sc.next();
			
			cores.add(cor);
		}
		System.out.println("\nCores da lista: "+cores.toString());
		
		Collections.sort(cores);
		
		System.out.println("\nCores ordenadas: "+cores.toString());
		
		sc.close();
		
		
		
		

	}

}
