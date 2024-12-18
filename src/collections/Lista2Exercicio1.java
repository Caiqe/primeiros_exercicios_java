package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

//EXERCICIO 3

//Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper
//Integer. O programa deverá solicitar ao usuário, que ele digite via teclado 10 valores
//inteiros não repetidos e adicione-os individualmente na Collection Set. Em seguida, faça o que se pede:
//Mostre na tela todos os elementos da Collection Set, utilizando a Classe Iterator. 


public class Lista2Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		int entradaNum;
		
		for(int i=0; i<10;i++) {
			System.out.println("\nInforme um número para a lista: ");
			entradaNum = sc.nextInt();
			
			numeros.add(entradaNum);
		}
		
		Iterator<Integer> Numeros = numeros.iterator();
		

		while(Numeros.hasNext()) {
			System.out.println(Numeros.next());
		}
		
		sc.close();
		

	}

}
