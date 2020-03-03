import java.util.Scanner;

public class main17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a;
		int b;

		a = sc.nextInt();
		b = sc.nextInt();

		if (a % b == 0 || b % a == 0) {
			System.out.println("São Multiplos");

		} else {

			System.out.println("Não são Multiplos");
		}

		sc.close();
	}
}
