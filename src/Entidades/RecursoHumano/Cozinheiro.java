package Entidades.RecursoHumano;

public class Cozinheiro extends Pessoa {
	private String regCozinheiro;

	public Cozinheiro(String regCozinheiro, String nome, String rg, int idade) {
		super(nome, rg, idade);
		this.regCozinheiro = regCozinheiro;
	}

	public String getRegCozinheiro() {
		return this.regCozinheiro;
	}
}
