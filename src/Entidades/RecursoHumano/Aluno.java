package Entidades.RecursoHumano;

public class Aluno extends Pessoa {

	private int idAluno;

	public Aluno(int idAluno, String nome, String rg, int idade) {
		super(nome, rg, idade);
		this.idAluno = idAluno;
	}

	public int getIdAluno() {
		return this.idAluno;
	}
}
