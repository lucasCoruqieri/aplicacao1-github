package aulas;
import java.util.Scanner;

public class aula07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digitar um valor n�merico qualquer: ");
		int n = sc.nextInt();
		n = n * 2;

		if (n >= 30) {
			System.out.printf("O resultado � maior ou igual a 30 = " + n);
		} else {
			System.out
					.println("O resultado � menor ou igual a 30, favor rodar aplica��o novamente! ");
		}
		sc.close();
	}
}
