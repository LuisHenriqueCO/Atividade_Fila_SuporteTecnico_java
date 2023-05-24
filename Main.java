package fila_suporte_tecnico;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FilaClientes fila = new FilaClientes();
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("============================================");
			System.out.println("1 - Adicionar cliente a fila de espera");
			System.out.println("2 - Exibir clientes na fila de espera");
			System.out.println("3 - Mandar cliente para suporte tecnico");
			System.out.println("0 - Sair");
			System.out.print("-> ");
			
			int opcao = input.nextInt();
			
			if (opcao == 0) {
				System.out.println("Até mais");
				break;
			} else if (opcao == 1) {
				System.out.print("Insira o nome do cliente: ");
				
				Scanner nome = new Scanner(System.in);
				String nome_cliente = nome.nextLine();
				
				fila.enqueue(nome_cliente);
				
				System.out.println("--------------------------------------------");
				System.out.println("O cliente " + nome_cliente + " entrou na fila de espera");
			} else if (opcao == 2) {
				if (fila.isEmpty()) {
					System.out.println("---------------Fila de Espera---------------");
					System.out.println("A fila de espera está vazia");
				} else {
					System.out.println("---------------Fila de Espera---------------");
					for (int i = 0; i < fila.size(); i++) {
						System.out.println(i+1 + " - " + fila.get(i));
					}
				}
			} else if (opcao == 3) {
				if (fila.isEmpty()) {
					System.out.println("--------------------------------------------");
					System.out.println("A fila de espera está vazia");
				} else {
					System.out.println("--------------------------------------------");
					System.out.println("O cliente " + fila.get(0) + " foi enviado para o suporte");
					fila.dequeue();
				}
			} else {
				System.out.println("--------------------------------------------");
				System.out.println("Opção inválida, por favor, insira uma opção válida");
			}
		}

	}

}
