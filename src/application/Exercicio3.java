package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class Exercicio3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		System.out.println("Digite o Nome do Aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Digite a primeira nota: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		aluno.nota3 = sc.nextDouble();
		System.out.printf("Nota final: %.2f%n", aluno.totalNota());
		if (aluno.totalNota() < 60.0) {
			System.out.println("Reprovado!!!");
			System.out.printf("Quantidade %.2f faltante%n",
					aluno.totalAprovado());
		} else {
			System.out.println("Aprovado!!!");
		}
		sc.close();
	}
}