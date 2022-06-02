package br.com.entra21.java.avancado.principal.aula2.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class AprenderCollection {
	static Scanner input = new Scanner(System.in);

	public static void aprender() {
		byte option;

		do {
			System.out.println("Learning Collections");
			System.out.println("\nChoose an option:");
			System.out.println("0 - Quit");
			System.out.println("1 - Aprender ArrayList");
			System.out.println("2 - Aprender LinkedList");
			option = input.nextByte();

			switch (option) {
			case 0:
				System.out.println("Leaving...");
				break;

			case 1:
				learningArrayList();
				break;

			case 2:
				learningLinkedList();
				break;

			default:
				System.out.println("Come back honey...");
				break;
			}

		} while (option != 0);
	}

	private static void learningArrayList() {
		// fazendo um crud
		// C R E A T E
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Ariana");
		nomes.add("Fulano");
		nomes.add("Ciclano");
		nomes.add(0, "primeiro");
		nomes.add("Rubem");
		System.out.println("Quantos nomes? " + nomes.size());

		for (String item : nomes) { // item é uma variavel temporario que percorre o ArrayList
			System.out.println("O nome no momento e: " + item);
		}

		System.out.println("-------------------------------------------------");
		for (int nome = 0; nome < nomes.size(); nome++) {
			System.out.println("No indice " + nome + " tem o valor " + nomes.get(nome));
		}
		// R E A D
		System.out.println("O primeiro nome e " + nomes.get(0));
		System.out.println("-------------------------------------------------");
		System.out.println("O terceiro e:  " + nomes.get(3));
		System.out.println("Onde sera que esta a Ariana? " + nomes.indexOf("Ariana"));
		System.out.println("-------------------------------------------------");

		// set para atualizar a posição e preciso passar a posicao e o indice
		// U P D A T E
		System.out.println("O terceiro atualizado e:  " + nomes.get(2));
		nomes.set(0, nomes.get(3).toUpperCase());
		System.out.println("-------------------------------------------------");
		System.out.println("O primeiro nome e " + nomes.get(0));
		System.out.println("-------------------------------------------------");

		// D E L E T E
		System.out.println("Vou deletar quem estiver no indice 2 : " + nomes.get(2));
		nomes.remove(2);
		nomes.remove(nomes.indexOf("Rubem"));

		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		// criar uma lista de interesses, inclua 5 interesses e  liste-os
		ArrayList<String> interesses = new ArrayList<>();
		interesses.add("Programação");
		interesses.add("Musica");
		interesses.add("Assistir");
		interesses.add("Ler");
		interesses.add("Estudar");
		System.out.println("Nessa lista temos " + interesses.size() + " interesses.");

		// listar
		for (String interessesListados : interesses) { // item é uma variavel temporario que percorre o ArrayList
			System.out.println("Interesse: " + interessesListados);
		}
		// escolha 2 que são favoritos para mostrar
		System.out.println("Desta lista, o meu favorito é : " + interesses.get(0) + "e o segundo favorito é : "
				+ interesses.get(1));
		
		// exclua 1 item por posicao e outro por valor
		System.out.println("No momento estou com pouco tempo para  : " + interesses.get(3) + " por isso estou tirando da lista por hora.");
		interesses.remove(3);
		
		System.out.println("Como não encontrei nenhuma serie que me chamou atencao, " + interesses.get(2) + " também está fora da lista");
		interesses.remove(interesses.indexOf("Assistir"));
		
		System.out.println("Agora meus interesses são " + interesses);
	}

	private static void learningLinkedList() {

	}
}
