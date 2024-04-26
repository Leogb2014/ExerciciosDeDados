package exerciciosestruturas;

import java.util.LinkedList;

import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {

		Queue<String> clientes = new LinkedList<String>();

		Scanner leia = new Scanner(System.in);
		int opcao;

		do {
			System.out.println();
			System.out.println("*********************************************");
			System.out.println("      1 - Adcionar Clientes na Fila          ");
			System.out.println("      2 - Listar todos os Clientes           ");
			System.out.println("      3 - Retirar Cliente da Fila            ");
			System.out.println("      0 - Sair                               ");
			System.out.println("*********************************************");
			System.out.print("Entre com a opção desejada: ");
			opcao = leia.nextInt();
			System.out.println();
			
			switch (opcao) {
			case 0:
				System.out.println("Programa finalizado!");
				break;
			case 1:
				System.out.print("Digite o Nome: ");
				leia.nextLine();
				String nome = leia.nextLine();
				clientes.add(nome);
				System.out.println("Fila: ");
				System.out.println(clientes);
				System.out.println("Cliente Adicionado!");
				break;
			case 2:
				System.out.println("Lista de Clientes da Fila:");
				System.out.println(clientes);
				break;
			case 3:
				System.out.println("Fila:");
				if (clientes.isEmpty() == true) {
					System.out.println("A Fila está vazia!");
				} else {
					clientes.poll();
					System.out.println(clientes);
					System.out.println("O Cliente foi Chamado!");
				}
				break;

			}
		}while (opcao != 0);
		
		leia.close();
	}

	

}
