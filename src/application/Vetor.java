package application;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite 3 números para realizar o calculo e seguida os 3 números em sequencia para o calculo: ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		for (int i = 0; i < n; i++) {
			vetor[i] = sc.nextDouble();
		}
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		double total = soma / n;
		System.out.printf("Total: %.2f%n", total);
		sc.close();
	}
}