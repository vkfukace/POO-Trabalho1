package Entidades.RecursoHumano;

public class Servente extends Pessoa {
	private String regServente;

	public Servente(String regServente, String nome, String rg, int idade) {
		super(nome, rg, idade);
		this.regServente = regServente;
	}

	public String getRegServente() {
		return this.regServente;
	}
}
