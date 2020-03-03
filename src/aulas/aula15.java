package aulas;
import java.util.Scanner;

public class aula15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seu login: ");
		int login = sc.nextInt();
		System.out.print("Digite sua senha: ");
		int senha = sc.nextInt();

		while (login != 1010 || senha != 2020) {
			System.out.println("login ou senha invalidos, tente novamente!");
			System.out.print("Digite seu login: ");
			login = sc.nextInt();
			System.out.print("Digite sua senha: ");
			senha = sc.nextInt();
		}

		System.out.println("Acesso Permitido!");

		sc.close();
	}
}