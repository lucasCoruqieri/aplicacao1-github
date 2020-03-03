import java.util.Scanner;

public class main11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		int horas = sc.nextInt();
		double valorHoras = sc.nextDouble();

		double salario = horas * valorHoras;

		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();

	}

}
