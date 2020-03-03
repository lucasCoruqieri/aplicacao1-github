package entities;

public class Dolar {

	public static final double IOF = 6.00;

	public static double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);

	}

}
