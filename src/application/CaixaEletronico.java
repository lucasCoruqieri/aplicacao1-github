package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class CaixaEletronico {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;

		System.out.print("Entre com número da conta: ");
		int numeroConta = sc.nextInt();
		System.out.print("Informe o titular da conta: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Possui depósito inicial: (Y/N)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.println("Informe o saldo inicial: ");
			double saldoInicial = sc.nextDouble();
			conta = new Conta(numeroConta, titular, saldoInicial);
		} else {
			conta = new Conta(numeroConta, titular);
		}

		System.out.println();
		System.out.println("Informações da conta: ");
		System.out.println(conta);

		System.out.println();
		System.out.println("Informe o valor do depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Valor total da conta atualizado é de: ");
		System.out.println(conta);

		System.out.println();
		System.out.println("Informe o valor para saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Valor total da conta atualizado é de: ");
		System.out.println(conta);

		sc.close();
	}
}
