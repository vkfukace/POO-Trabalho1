package Entidades.RecursoHumano;

import Entidades.RecursoMaterial.MateriaisEscolares;

public class Aluno extends Pessoa {

	private int ra;
	private String curso;
	private MateriaisEscolares matEscolar;

	public Aluno(String rg, String nome, int ra, String curso) {
		super(rg, nome);
		this.ra = ra;
		this.curso = curso;
		this.matEscolar = new MateriaisEscolares();
	}

	public int getRa() {
		return this.ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getCurso() {
		return this.curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public MateriaisEscolares getMatEscolar() {
		return this.matEscolar;
	}

	@Override
	public String toString() {
		return "{" + super.toString() + ", ra='" + getRa() + "'" + ", curso='" + getCurso() + "'" + ", matEscolar='"
				+ getMatEscolar().toString() + "'" + "}";
	}

}
