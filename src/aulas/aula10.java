package aulas;
import java.util.Scanner;

public class aula10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int total = 0;
		int x = 1;
		int y = 1;

		for (int i = 1; i <= 15; i++) {
			y = total;
			total = total + x;
			x = y;
			System.out.println("Fibonacci de " + (i) + " = " + total);
		}
		sc.close();
	}
}
