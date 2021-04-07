package Entidades.RecursoHumano;

public class Professor extends Pessoa {
	private String regProfessor;

	public Professor(String regProfessor, String nome, String rg, int idade) {
		super(nome, rg, idade);
		this.regProfessor = regProfessor;
	}

	public String getRegProfessor() {
		return this.regProfessor;
	}

}
