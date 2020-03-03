package aulas;
import java.util.Scanner;

public class aula12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = 1;
		int fat = 1;
		int cont = 1;

		do {
			System.out
					.println("Digite um número inteiro para calculo total fatorial : ");
			n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				fat = fat * i;
			}
			System.out.println("O total do fatorial de " + n + " = " + fat);
			cont++;
			fat = 1;
		} while (cont <= 5);
		sc.close();
	}
}
