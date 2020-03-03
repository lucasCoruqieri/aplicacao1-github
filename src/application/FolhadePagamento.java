package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Colaborador;

public class FolhadePagamento {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Colaborador> list = new ArrayList<>();

		// PART 1 - Informações do colaborador

		System.out.print("Digite a quantidade de colaboradores deseja consultar: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Colaborador #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			list.add(new Colaborador(id, nome, salario));
		}

		// PART 2 - Alteração de salário colaborador:

		System.out.println();
		System.out.print("Entre com novo id do colaborador para alteração de salário: ");
		int id = sc.nextInt();
		Colaborador colab = list.stream().filter(x -> x.getId() == id)
				.findFirst().orElse(null);
		if (colab == null) {
			System.out.println("Id de colaborador não existente!");
		} else {
			System.out.print("Informar porcentagem de aumento ao colaborador informado: ");
			double porcentagem = sc.nextDouble();
			colab.alteracaoSalario(porcentagem);
		}

		// PART 3 - LISTA DOS COLABORADORES:

		System.out.println();
		System.out.println("Lista dos Colaboradores:");
		for (Colaborador obj : list) {
			System.out.println(obj);
		}
		sc.close();
	}

}
