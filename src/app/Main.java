package app;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<String> frutas = new HashSet<>();
		
		while (true) {
			try {
				System.out.println("\nEscolha uma opção:");
				System.out.println("1. Adicionar uma fruta");
				System.out.println("2. Listar todas as frutas");
				System.out.println("3. Remover uma fruta");
				System.out.println("4. Verificar se uma fruta esta presente");
				System.out.println("5. Sair");
				System.out.print("Opção: ");
				
				int opcao = scanner.nextInt();
				scanner.nextLine();
				
				switch (opcao) {
					case 1:
						System.out.print("Digite o nome da fruta para adicionar: ");
						String novaFruta = scanner.nextLine();
						if (frutas.add(novaFruta)) {
							System.out.println(novaFruta + " foi adicionada.");
						} else {
							System.out.println(novaFruta + " já está presente no conjunto.");
						}
						break;
					case 2:
						System.out.println("Frutas: " + frutas);
						break;
					case 3:
						System.out.println("Digite o nome da fruta para remover: ");
						String removerFruta = scanner.nextLine();
						if (frutas.remove(removerFruta)) {
							System.out.println(removerFruta + " foi removida.");
						} else {
							System.out.println(removerFruta + " não foi encontrada.");
						}
						break;
					case 4:
						System.out.println("Digite o nome da fruta para verificar: ");
						String varificarFruta = scanner.nextLine();
						if (frutas.remove(varificarFruta)) {
							System.out.println(varificarFruta + " está presente no conjunto.");
						} else {
							System.out.println(varificarFruta + " não foi encontrada no conjunto.");
						}
						break;
					case 5:
						System.out.println("Saindo...");
						scanner.close();
						return;
					default:
						System.out.println("Opção invalida. Tente novamente.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Entrada inválida. Por favor, digite um número");
				scanner.nextLine();
			}
		}
	}
}
