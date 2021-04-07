package Entidades.RecursoHumano;

public class Aluno extends Pessoa {

	private String regAluno;

	public Aluno(String regAluno, String nome, String rg, int idade) {
		super(nome, rg, idade);
		this.regAluno = regAluno;
	}

	public String getRegAluno() {
		return this.regAluno;
	}
}
