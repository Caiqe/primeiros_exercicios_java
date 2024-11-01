package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//EXERCICIO 4


//Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer,
//inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que ele digite
//via teclado 1 número inteiro e caso ele seja encontrado no Set, exiba na tela a mensagem: 
//Número 00 Encontrado! Caso o número não seja encontrado, ele deverá exibir na tela a 
//mensagem: O número NN não foi encontrado!


public class Lista2Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> numeros = new HashSet<Integer>();
		int pesquisaNum;
		
		
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);
		
		System.out.println("\nPesquisa um número na lista: ");
		pesquisaNum = sc.nextInt();
		
		if(numeros.contains(pesquisaNum)) {
			System.out.println("\nNúmero "+pesquisaNum+" encontrado!");
		}
		else {
			System.out.println("\nO número "+pesquisaNum+" não foi encontrado!");
		}

	}

}
