package Entidades.RecursoHumano;

public class Pessoa {
	private String rg;
	private String nome;

	public Pessoa(String rg, String nome) {
		this.rg = rg;
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "rg='" + getRg() + "'" + ", nome='" + getNome() + "'";
	}

}
