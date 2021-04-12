package Entidades.RecursoHumano;

public class Servente extends Pessoa {
	private int idServente;

	public Servente(int idServente, String nome, String rg, int idade) {
		super(nome, rg, idade);
		this.idServente = idServente;
	}

	public int getIdServente() {
		return this.idServente;
	}

	@Override
	public String toString() {
		return "{" + " idServente='" + getIdServente() + "', " + super.toString() + "}";
	}
}
