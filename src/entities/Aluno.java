package entities;

public class Aluno {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;

	public double totalNota() {
		return nota1 + nota2 + nota3;
	}

	public double totalAprovado() {
		if (totalNota() < 60.0) {
			return 60.0 - totalNota();
		} else {
			return 0.0;
		}
	}

}
