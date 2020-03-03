package aulas;
import java.util.Scanner;

public class aula09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 15;
		int resultado;

		while (x <= 200) {

			resultado = x * x;

			System.out.printf("O quadrado de %d = %d\n", x, resultado);

			x += 1;
		}
		sc.close();

	}

}