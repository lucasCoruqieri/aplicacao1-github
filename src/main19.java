import java.util.Scanner;

public class main19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int itemCode = sc.nextInt();
		int itemQtd = sc.nextInt();

		double total;

		if (itemCode == 1) {
			total = itemQtd * 4.0;
		}

		else if (itemCode == 2) {
			total = itemQtd * 5.0;
		}

		else if (itemCode == 3) {
			total = itemQtd * 6.0;
		}

		else {
			total = itemQtd * 7.0;
		}

		System.out.printf("Total: R$ %.2f%n", total);

		sc.close();

	}

}
