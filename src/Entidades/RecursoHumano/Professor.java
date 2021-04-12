package Entidades.RecursoHumano;

public class Professor extends Pessoa {
	private int idProfessor;

	public Professor(int idProfessor, String nome, String rg, int idade) {
		super(nome, rg, idade);
		this.idProfessor = idProfessor;
	}

	public int getIdProfessor() {
		return this.idProfessor;
	}

	@Override
	public String toString() {
		return "{" + " idProfessor='" + getIdProfessor() + "', " + super.toString() + "}";
	}

}
