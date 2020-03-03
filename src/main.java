import java.util.Locale;

public class main {

	public static void main(String[] args) {

		String produto1 = "Notebook";
		String produto2 = "Celular";
		int idade = 32;
		int code = 57588;
		char tipo = 'F';
		double preco1 = 2000.0;
		double preco2 = 3000.50;
		double preco3 = 4000.013456;
		System.out.println("Produtos");
		System.out.printf("%s, seu preço unitario é %.2f\n", produto1, preco1);
		System.out.printf("%s, seu preço unitario é %.2f", produto2, preco2);
		System.out.println("\n");
		System.out.printf("Registro: %d mais velha, código %d do tipo: %s",
				idade, code, tipo);
		System.out.println("\n");
		System.out.printf("Tipo desse produto é: R$ %.2f\n", preco3);
		System.out.printf("Total com arredondamento: R$ %.6f\n", preco3);
		Locale.setDefault(Locale.US);
		System.out.printf("Valor em decimal: R$ %.6f", preco3);
		// System.out.printf("%.2f\n", x);
		// System.out.printf("%.4f\n", x);
		// System.out.println("RESULTADO = " + x + " METROS");
		// System.out.printf("RESULTADO =  %.2f metros\n", x);
		// System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome,
		// idade, renda);

	}
}
