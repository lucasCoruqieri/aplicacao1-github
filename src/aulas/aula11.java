package aulas;
import java.util.Scanner;

public class aula11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor digitar um n�mero: ");
		int n = sc.nextInt();

		int fat = 1;

		for (int i = 1; i <= n; i++) {

			fat = fat * i;

		}
		System.out.printf("Fatorial do n�mero informado = " + fat);

		sc.close();
	}
}
