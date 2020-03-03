package entities;

public class Conta {

	private int numeroConta;
	private String titular;
	private double saldoInicial;

	public Conta(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}

	public Conta(int numeroConta, String titular, double saldoInicial) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		deposito(saldoInicial);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldoInicial() {
		return saldoInicial;
	}

	public void deposito(double amount) {
		saldoInicial += amount;
	}

	public void saque(double amount) {
		saldoInicial -= amount + 5.0;
	}

	public String toString() {
		return "Conta: " + numeroConta + ", Nome do Titular: " + titular
				+ ", Total: R$ " + String.format("%.2f", saldoInicial);
	}

}
