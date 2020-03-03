import java.util.Locale;
import java.util.Scanner;

public class main4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String z;
		int y;
		double x;
		// char x;
		z = sc.next();
		y = sc.nextInt();
		x = sc.nextDouble();
		// x = sc.next().charAt(0);
		System.out.printf("dados digitado:");
		System.out.println("\n");
		System.out.println(z);
		System.out.println(y);
		System.out.println(x);
		sc.close();
	}

}
