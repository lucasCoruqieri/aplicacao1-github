package aulas;
import java.util.Scanner;

public class aula14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		char resp;

		do {
			int contador = 1;
			int n;

			System.out.println("digite o valor da tabuada:");
			n = sc.nextInt();
			while (contador <= 10) {
				System.out.println(n + " X " + contador + " = " + contador * n);
				contador++;
			}

			System.out.print("Deseja realizar novamente (s/n)? ");
			resp = sc.next().charAt(0);

		} while (resp != 'n');
		System.out.println("Calculadora Encerrada!");
		sc.close();
	}
}
