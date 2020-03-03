import java.util.Scanner;

public class main28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		int senha = 2002;
		while (x != 2002) {

			senha = x;
			System.out.println("Senha invalida");
			x = sc.nextInt();

		}

		System.out.printf("Acesso permitido!", senha);

		sc.close();

	}

}