package Entidades.RecursoHumano;


import Entidades.RecursoMaterial.MateriaisLimpeza;

public class Cozinheiro extends Pessoa {
	private int idCozinheiro;
	private MateriaisLimpeza matLimpeza ;

	

	public MateriaisLimpeza getMatLimpeza() {
		return this.matLimpeza;
	}

	

	public Cozinheiro(int idCozinheiro, String nome, String rg, int idade) {
		super(nome, rg, idade);
		this.idCozinheiro = idCozinheiro;
		this.matLimpeza = new MateriaisLimpeza();
	}

	public int getIdCozinheiro() {
		return this.idCozinheiro;
	}

	@Override
	public String toString() {
		return "{" + " idCozinheiro='" + getIdCozinheiro() + "', " + super.toString() + "}";
	}

	public void requisicaoMatLimpeza(){}
	public void atualizarMatLimpeza(){}
	public void removerMatLimpeza(){}
}
