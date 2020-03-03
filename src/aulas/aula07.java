package aulas;
import java.util.Scanner;

public class aula07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digitar um valor númerico qualquer: ");
		int n = sc.nextInt();
		n = n * 2;

		if (n >= 30) {
			System.out.printf("O resultado é maior ou igual a 30 = " + n);
		} else {
			System.out
					.println("O resultado é menor ou igual a 30, favor rodar aplicação novamente! ");
		}
		sc.close();
	}
}
