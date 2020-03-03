package entities;

public class Colaborador {

	private Integer id;
	private String nome;
	private Double salario;

	public Colaborador() {
	}

	public Colaborador(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setName(String name) {
		this.nome = name;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void alteracaoSalario(double porcentagem) {
		salario += salario * porcentagem / 100.0;
	}

	public String toString() {
		return id + ", " + nome + ", " + String.format("%.2f", salario);
	}

}
