package Entidades.RecursoHumano;

public class Pessoa {

	private String nome;

	private String rg;

	private int idade;

	public Pessoa(String nome, String rg, int idade) {
		this.nome = nome;
		this.rg = rg;
		this.idade = idade;
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

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
