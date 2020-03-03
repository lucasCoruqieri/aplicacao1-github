import java.util.Scanner;

public class main12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int peca1, peca2, quantidadePeca1, quantidadePeca2;
		double valorTotalPeca1, valorTotalPeca2;

		peca1 = sc.nextInt();
		quantidadePeca1 = sc.nextInt();
		valorTotalPeca1 = sc.nextDouble();

		peca2 = sc.nextInt();
		quantidadePeca2 = sc.nextInt();
		valorTotalPeca2 = sc.nextDouble();

		double ValorTotalCompra = valorTotalPeca1 * quantidadePeca1
				+ valorTotalPeca2 * quantidadePeca2;

		System.out.printf("VALOR A PAGAR: R$ %.2f%n", ValorTotalCompra);

		sc.close();

	}

}
