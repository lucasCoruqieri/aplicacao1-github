import java.util.Scanner;

public class main35 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;
		int y;
		int i;

		x = sc.nextInt();
		y = sc.nextInt();

		for (i = 0; i < x; i++) {
			System.out.print(i + ",");
			y = y + 5;
			System.out.println(y);
		}

		sc.close();

	}

}
