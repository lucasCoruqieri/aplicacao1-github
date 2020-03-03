package entities;

public class Produto {

	private String nome;
	private double preco;
	private int quantidade;

	public Produto() {

	}

	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	// criando construtor seperado para trarar a quantidade do produto por
	// defaut iniciar com 0 - isso se chama Sobrecarga
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double totalValorEstoque() {
		return preco * quantidade;

	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removeProduto(int quantidade) {
		this.quantidade -= quantidade;

	}

	public String toString() {
		return nome + ", R$ " + String.format("%.2f", preco) + ", "
				+ quantidade + " un, Total: R$ "
				+ String.format("%.2f", totalValorEstoque());
	}

}
