package lacosRepeticao;

import java.util.Scanner;

//EXERCICIO 3

//Escreva um algoritmo em Java, que leia a idade de várias pessoas (números inteiros),
//via teclado e mostre na tela o total de pessoas cuja idade seja menor que 21 anos e 
//o total de pessoas cuja idade seja maior que 50 anos. A leitura dos dados deve ser 
//finalizada ao digitar uma idade negativa.

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int idade,contadorMenor21=0,contadorMaior50=0;
		boolean condicao=true;
		
		while(condicao==true) 
		{
			System.out.println("\n Informe a idade: *OU DIGITE UM NÚMERO NEGATIVO PARA ENCERRAR*");
			idade = sc.nextInt();
			
			if(idade<21 && idade>0) 
			{
				contadorMenor21++;
			}
			else if(idade>50) 
			{
				contadorMaior50++;
			}
			else if(idade<0) 
			{
				condicao=false;
			}
		}
		System.out.println("\nTotal de pessoas menores de 21 anos: "+contadorMenor21);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+contadorMaior50);
		
		
		

	}

}
