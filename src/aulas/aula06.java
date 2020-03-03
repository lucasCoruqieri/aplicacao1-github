package aulas;
import java.util.Scanner;

public class aula06 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digitar um valor númerico: ");
		int n = sc.nextInt();

		if (n >= 1 && n <= 9) {
			System.out.println("Dentro do valor permitido ");

		} else {
			System.out.println("Fora do valor permitido ");
		}

		sc.close();
	}
}