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
		System.out.println(" \n 2. Subtra��o ");
		System.out.println(" \n 3. Multiplica��o ");
		System.out.println(" \n 4. Divis�o ");

		System.out.println(" \n Digite o primeiro valor: ");
		x = sc.nextInt();
		System.out.println(" \n Digite o segundo valor: ");
		y = sc.nextInt();

		System.out
				.println(" \n Digite o n�mero do operador apresentado para realizar o calculo ( 1. Soma, 2. Subtra��o, 3. Multiplica��o e 4. Divis�o)");
		operador = sc.nextInt();

		switch (operador) {
		case 1:
			System.out.println(" \n Op��o Selecionada: 1. Soma");
			System.out.println(" \n A soma dos dois valores �: " + (x + y));
			break;

		case 2:
			System.out.println(" \n Op��o Selecionada: 1. Subtra��o");
			System.out
					.println(" \n A subtra��o dos dois valores �: " + (x - y));
			break;

		case 3:
			System.out.println(" \n Op��o Selecionada: 1. Multiplica��o");
			System.out.println(" \n A multiplica��o dos dois valores �: "
					+ (x * y));
			break;

		case 4:
			System.out.println(" \n Op��o Selecionada: 1. Divis�o");
			if (y == 0) {
				System.out.println(" \n N�o existe divis�o por zero. ");
			} else {
				System.out.println(" \n A divis�o dos dois valores �: "
						+ (x / y));
			}
			break;
		}
		sc.close();
	}
}