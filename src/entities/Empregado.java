package entities;

public class Empregado {

	public String nome;
	public double salario;
	public double imposto;

	public double salarioBruto() {
		return salario - imposto;
	}

	public void aumentoSalario(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}

	public String toString() {
		return nome + ", R$ " + String.format("%.2f", salarioBruto());
	}
}
