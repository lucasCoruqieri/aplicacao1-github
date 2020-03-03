public class main26 {

	public static void main(String[] args) {

		double preco = 19.9;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		// if (preco < 20.0) {
		// desconto = preco * 0.1;
		// } else {
		// desconto = preco * 0.05;
		// }
		System.out.println(desconto);
	}

}
