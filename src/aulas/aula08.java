package aulas;
import java.util.Scanner;

public class aula08 {

	public static void main(String[] args) {
		int x;
		int y;
		int operador;

		Scanner sc = new Scanner(System.in);

		System.out.println(" \n Escolha uma operador abaixo: ");

		System.out.println(" \n 1. Soma ");
		System.out.println(" \n 2. Subtração ");
		System.out.println(" \n 3. Multiplicação ");
		System.out.println(" \n 4. Divisão ");

		System.out.println(" \n Digite o primeiro valor: ");
		x = sc.nextInt();
		System.out.println(" \n Digite o segundo valor: ");
		y = sc.nextInt();

		System.out
				.println(" \n Digite o número do operador apresentado para realizar o calculo ( 1. Soma, 2. Subtração, 3. Multiplicação e 4. Divisão)");
		operador = sc.nextInt();

		switch (operador) {
		case 1:
			System.out.println(" \n Opção Selecionada: 1. Soma");
			System.out.println(" \n A soma dos dois valores é: " + (x + y));
			break;

		case 2:
			System.out.println(" \n Opção Selecionada: 1. Subtração");
			System.out
					.println(" \n A subtração dos dois valores é: " + (x - y));
			break;

		case 3:
			System.out.println(" \n Opção Selecionada: 1. Multiplicação");
			System.out.println(" \n A multiplicação dos dois valores é: "
					+ (x * y));
			break;

		case 4:
			System.out.println(" \n Opção Selecionada: 1. Divisão");
			if (y == 0) {
				System.out.println(" \n Não existe divisão por zero. ");
			} else {
				System.out.println(" \n A divisão dos dois valores é: "
						+ (x / y));
			}
			break;
		}
		sc.close();
	}
}