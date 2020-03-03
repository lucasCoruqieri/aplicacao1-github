//import java.util.Locale;
import java.util.Scanner;

public class main7 {

	public static void main(String[] args) {

		// Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura = sc.nextDouble();
		double altura = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();

		double area = largura * altura;
		double preco = area * metroQuadrado;

		System.out.printf("Area = %.2f\n", area);
		System.out.printf("Preço = %.2f\n", preco);

		sc.close();

	}

}
