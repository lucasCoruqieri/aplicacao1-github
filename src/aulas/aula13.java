package aulas;
import java.util.Scanner;

public class aula13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int contador = 1;
		int n;

		System.out.println("digite o valor da tabuada:");
		n = sc.nextInt();
		while (contador <= 10) {
			System.out.println(n + " X " + contador + " = " + contador * n);
			contador++;
		}
		sc.close();
	}
}
