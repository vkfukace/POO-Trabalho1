package Entidades.RecursoHumano;

public class Cozinheiro extends Pessoa {
	private int idCozinheiro;

	public Cozinheiro(int idCozinheiro, String nome, String rg, int idade) {
		super(nome, rg, idade);
		this.idCozinheiro = idCozinheiro;
	}

	public int getIdCozinheiro() {
		return this.idCozinheiro;
	}

	@Override
	public String toString() {
		return "{" + " idCozinheiro='" + getIdCozinheiro() + "', " + super.toString() + "}";
	}

}
