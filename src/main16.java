import java.util.Scanner;

public class main16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N1 = sc.nextInt();
		System.out.println("Primeiro Bimestre");
		int N2 = sc.nextInt();
		int N3 = sc.nextInt();
		int N4 = sc.nextInt();
		int resultado = (N1 + N2 + N3 + N4 / 4);

		if (resultado < 50) {
			System.out.println("Reprovado");
		} else if (resultado == 50)
			System.out.println("Recuperação");
		else
			System.out.println("Aprovado");

		sc.close();

	}

}
