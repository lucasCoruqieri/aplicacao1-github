package aulas;
import java.util.Scanner;

public class aula02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = { 1, 44, 33 };

		int n = 0;

		for (int i = 0; i < 3; i++) {

			if (num[i] > num[i]) {

				n = num[0];
				num[0] = num[1];
				num[1] = num[2];
				num[2] = n;
			}

			System.out.println(num[i]);

		}

		sc.close();

	}
}