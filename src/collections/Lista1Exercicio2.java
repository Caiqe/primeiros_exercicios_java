package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//EXERCICIO 2

//Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer,
//inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, que ele digite via 
//teclado 1 número inteiro e caso ele seja encontrado no ArrayList, exiba na tela a posição deste número
//na Collection. Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN 
//não foi encontrado!


public class Lista1Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		List<Integer> numerosInt = new ArrayList<Integer>();
		
		int pesquisaNum;
		
		
		numerosInt.add(1);
		numerosInt.add(2);
		numerosInt.add(3);
		numerosInt.add(4);
		numerosInt.add(5);
		numerosInt.add(6);
		numerosInt.add(7);
		numerosInt.add(8);
		numerosInt.add(9);
		numerosInt.add(10);
		
		System.out.println("\nPesquise um número dentro da lista: ");
		pesquisaNum = sc.nextInt();
		
		if(numerosInt.contains(pesquisaNum)) {
			System.out.println("\nO número "+pesquisaNum+" esta na lista! Esta no índice "+ numerosInt.indexOf(pesquisaNum));
		}
		else {
			System.out.println("\nO número "+pesquisaNum+" não foi encontrado!");
		}
		
		

	}

}
