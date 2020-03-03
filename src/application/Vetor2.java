package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Produto2;

public class Vetor2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Produto2[] vetor = new Produto2[n];
		for (int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new Produto2(nome, preco);
		}
		double soma = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			soma += vetor[i].getPreco();
		}
		double total = soma / vetor.length;
		System.out.printf("total da média dos produtos = %.2f%n", total);
		sc.close();
	}
}