package lacosRepeticao;

import java.util.Scanner;

//EXERCICIO 4

//Uma empresa desenvolveu uma pesquisa interna para conhecer os colaboradores da área de Desenvolvimento
//e precisam de um sistema para analisar os dados. Escreva um algoritmo em Java, que leia via teclado as
//seguintes informações de cada colaborador:
//
//Idade (Número inteiro)
//Identidade de Gênero (Número Inteiro): 
//1 – Mulher Cis
//2 – Homem Cis
//3 – Não Binário
//4 – Mulher Trans
//5 – Homem Trans
//6 – Outros
//Pessoa Desenvolvedora (Número Inteiro):
//1 – Backend
//2 – Frontend
//3 – Mobile
//4 – FullStack
//Após digitar a categoria, o sistema deverá perguntar ao usuário se ele deseja continuar a leitura dos dados
//de um novo colaborador ou não (S/N). Caso seja pressionada a tecla N, mostre na tela:
//
//O número de pessoas desenvolvedoras Backend
//O número de Mulheres Cis e Trans desenvolvedoras Frontend
//O número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos
//O número de Não Binários desenvolvedores FullStack menores de 30 anos
//O número total de pessoas que responderam à pesquisa
//A média de idade das pessoas que responderam à pesquisa

public class Lista2Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade, qtdMulherCiTrFront = 0, qtdHomemCTMobile = 0, qtdFsNB = 0, escolhaGenero, escolhaDev,
				devBackend = 0, totalPessoas = 0;
		float mediaIdade,somaIdade = 0;
		String condicao = "s";

		while (condicao.equalsIgnoreCase("s")) {
			System.out.println("\n\t\tPESQUISA");
			System.out.println("\nInforme sua idade: ");
			idade = sc.nextInt();

			somaIdade += idade;
			System.out.println("\n\t\tInforme seu gênero (*número inteiro*)");
			System.out.println("\n1 - Mulher cis");
			System.out.println("\n2 - Homem cis");
			System.out.println("\n3 - Não binário");
			System.out.println("\n4 - Mulher trans");
			System.out.println("\n5 - Homem trans");
			System.out.println("\n6 - Outros");

			escolhaGenero = sc.nextInt();

			System.out.println("\n\t\tPessoa Desenvolvedora (*número inteiro*)");
			System.out.println("\n1 - Backend");
			System.out.println("\n2 - Frontend");
			System.out.println("\n3 - Mobile");
			System.out.println("\n4 - FullStack");
			escolhaDev = sc.nextInt();

			totalPessoas++;

			if (escolhaDev == 1) 
			{
				devBackend++;
			}
			if ( escolhaDev == 2  )
			{
				if( escolhaGenero == 1 || escolhaGenero == 4)
				{
				qtdMulherCiTrFront++;
				}
			}
			if (escolhaDev == 3 && idade > 40 ) 
			{
				if( escolhaGenero == 2 || escolhaGenero == 4  )
				{
				qtdHomemCTMobile++;
				}
			}
			if (escolhaGenero == 3 && escolhaDev == 4 && idade < 30) 
			{
				qtdFsNB++;
			}

			System.out.println(
					"Existe mais alguma pessoa para responder a pesquisa? (*Responda 's' para SIM OU 'n' para NÂO*)");
			condicao = sc.next();
		}
		mediaIdade = somaIdade / totalPessoas;

		System.out.println("\n\t\tResultado: ");
		System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + devBackend);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + qtdMulherCiTrFront);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: "+qtdHomemCTMobile);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: "+qtdFsNB);
		System.out.println("O número total de pessoas que respondam à pesquisa: "+totalPessoas);
		System.out.println("A média de idade das pessoas que responderam à pesquisa: "+mediaIdade);

	}

}
