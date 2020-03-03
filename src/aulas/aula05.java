package aulas;
import java.util.Arrays;
import java.util.Scanner;

public class aula05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informar 5 valores: ");
		int valor[] = new int[5];

		for (int i = 0; i < valor.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			valor[i] = sc.nextInt();
		}

		Arrays.sort(valor);

		System.out.println("Menor valor = " + valor[0]);
		System.out.println("Maior valor = " + valor[valor.length - 1]);
		sc.close();
	}
}