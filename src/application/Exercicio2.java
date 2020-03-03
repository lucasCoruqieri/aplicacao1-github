package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Empregado;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Empregado empregado = new Empregado();
		System.out.println("Digite o nome do Empregado: ");
		empregado.nome = sc.nextLine();
		System.out.println("Digite o salario bruto: ");
		empregado.salario = sc.nextDouble();
		System.out.println("Digite o valor do imposto: ");
		empregado.imposto = sc.nextDouble();

		System.out.println();
		System.out.println("Empregado: " + empregado);
		System.out.println();
		System.out.print("Informar porcentagem de aumento ao empregado? ");
		double porcentagem = sc.nextDouble();
		empregado.aumentoSalario(porcentagem);
		System.out.println();
		System.out.println("Salario alterado para: " + empregado);
		sc.close();

	}

}
