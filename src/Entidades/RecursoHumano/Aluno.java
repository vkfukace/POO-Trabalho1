package Entidades.RecursoHumano;

import Entidades.RecursoMaterial.MateriaisEscolares;

public class Aluno extends Pessoa {

	private int idAluno;
	private MateriaisEscolares matEscolar;

	public MateriaisEscolares getMatEscolar() {
		return this.matEscolar;
	}

	public Aluno(int idAluno, String nome, String rg, int idade) {
		super(nome, rg, idade);
		this.idAluno = idAluno;
		this.matEscolar = new MateriaisEscolares();
	}

	public int getIdAluno() {
		return this.idAluno;
	}

	@Override
	public String toString() {
		return "{" + " idAluno='" + getIdAluno() + "', " + super.toString() + "}";
	}

	public void requisicaoMatEscolar() {
	}

	public void atualizarMatEscolar() {
	}

	public void removerMatEscolar() {
	}

}
