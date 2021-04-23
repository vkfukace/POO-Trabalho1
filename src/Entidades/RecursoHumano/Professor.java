package Entidades.RecursoHumano;

import Entidades.RecursoMaterial.MateriaisDidaticos;

public class Professor extends Pessoa {
	private String graduacao;
	private float salario;
	private MateriaisDidaticos matDidatico;

	public Professor(String rg, String nome, String graduacao, float salario) {
		super(rg, nome);
		this.graduacao = graduacao;
		this.salario = salario;
		this.matDidatico = new MateriaisDidaticos();
	}

	public String getGraduacao() {
		return this.graduacao;
	}

	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}

	public float getSalario() {
		return this.salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public MateriaisDidaticos getMatDidatico() {
		return this.matDidatico;
	}

	@Override
	public String toString() {
		return "{" + super.toString() + ", graduacao='" + getGraduacao() + "'" + ", salario='" + getSalario() + "'"
				+ ", matDidatico='" + getMatDidatico().toString() + "'" + "}";
	}

}
