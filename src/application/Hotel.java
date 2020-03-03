package application;

import java.util.Scanner;

import entities.Hospede;

public class Hotel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Hospede[] vetor = new Hospede[10];

		System.out.println("Por favor informar quantidade de quartos para reserva: ");
		int n = sc.nextInt();

		for (int i = 1; i <=n; i++) {
			System.out.println();
			System.out.println("Reserva: " + i);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vetor[quarto] = new Hospede(nome, email);
		}
		
		System.out.println();
		System.out.println("Voucher impresso:");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}
		sc.close();
	}

}
