package application;

public class ExemploForEach {

	public static void main(String[] args) {
		String[] vetor = new String[] { "Lucas", "Luan", "Pedro" };

		System.out.println("--- Exemplo 1 ---");

		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}

		System.out.println("--- Exemplo 2 ---");

		for (String obj : vetor) {
			System.out.println(obj);
		}

	}

}
