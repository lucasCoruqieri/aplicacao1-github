package aulas;
import java.util.Scanner;

public class aula01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira Nota ");
		int n1 = sc.nextInt();
		System.out.println("Digite a segunda Nota ");
		int n2 = sc.nextInt();
		System.out.println("Digite a terceira Nota ");
		int n3 = sc.nextInt();
		System.out.println("Digite a quarta Nota ");
		int n4 = sc.nextInt();
		int media = 0;
		media = (n1 + n2 + n3 + n4) / 4;

		if (media < 50) {
			System.out.println("Reprovado");
		} else if (media == 50) {
			System.out.println("Recuperação");
		} else if (media > 50) {
			System.out.println("Aprovado");

		}
		sc.close();
	}

}
