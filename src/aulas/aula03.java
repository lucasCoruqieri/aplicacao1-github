package aulas;
import java.util.Scanner;

public class aula03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 > num2) {
			if (num2 > num3) {
				System.out.println(num1 + "\n" + num2 + "\n" + num3);

			}

			else if (num1 > num3) {
				System.out.println(num1 + "\n" + num3 + "\n" + num2);

			} else {
				System.out.println(num3 + "\n" + num1 + "\n" + num2);
			}

		}

		else if (num2 > num3) {
			if (num1 > num3) {
				System.out.println(num2 + "\n" + num1 + "\n" + num3);
			} else {
				System.out.println(num2 + "\n" + num3 + "\n" + num1);
			}

		} else {
			System.out.println(num3 + "\n" + num2 + "\n" + num1);

		}

		sc.close();

	}
}
