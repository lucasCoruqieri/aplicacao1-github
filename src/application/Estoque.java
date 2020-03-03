package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class Estoque {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto prod = new Produto();

		System.out.println("Informe item do estoque abaixo: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		// Iniciar a quantidade 0 por defaut, foi criado um construtor na classe
		// Produto//
		// System.out.print("Quantidade em estoque: ");
		// int quantidade = sc.nextInt();
		Produto produto = new Produto(nome, preco);

		produto.setNome("Computador");
		System.out.println("Nome atualizado para: " + produto.getNome());
		produto.setPreco(3.000);
		System.out.println("Preço atualizado para: " + produto.getPreco());

		System.out.println();
		System.out.println("Produto: " + produto);

		System.out.println();
		System.out.print("Informe um valor para adicionar em estoque: ");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);

		System.out.println();
		System.out.println("Atualizado quantidade do produto: " + produto);

		System.out.println();
		System.out
				.print("Informe quantidade para remover produto do estoque: ");
		quantidade = sc.nextInt();
		produto.removeProduto(quantidade);

		System.out.println();
		System.out.println("Atualizado quantidade do produto: " + produto);
		sc.close();
	}
}