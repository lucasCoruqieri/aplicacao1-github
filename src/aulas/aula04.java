package aulas;
import java.util.Scanner;

public class aula04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas vezes deseja executar?");
		int qtd = sc.nextInt();

		for (int i = 0; i < qtd; i++) {

			System.out.println("O programa esta rodando pela: " + i + 1
					+ "� Favor informar o n�mero?");
			int n = sc.nextInt();

			if (n % 2 == 0 || n % 3 == 0) {

				System.out.printf("Esse n�mero � divisivel por 2 ou 3 \n", n);
			} else {
				System.out.println("Esse n�mero n�o � divisivel por 2 ou 3 "
						+ n);

			}

		}
		sc.close();
	}
}
