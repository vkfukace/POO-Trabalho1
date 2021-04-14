package Entidades.RecursoHumano;

import Entidades.RecursoMaterial.MateriaisLimpeza;

public class Servente extends Pessoa {
	private int idServente;
	private MateriaisLimpeza matLimpeza;

	public MateriaisLimpeza getMatLimpeza() {
		return this.matLimpeza;
	}

	public Servente(int idServente, String nome, String rg, int idade) {
		super(nome, rg, idade);
		this.idServente = idServente;
		this.matLimpeza = new MateriaisLimpeza();
	}

	public int getIdServente() {
		return this.idServente;
	}

	@Override
	public String toString() {
		return "{" + " idServente='" + getIdServente() + "', " + "recursos=" + getMatLimpeza().toString()
				+ super.toString() + "}";
	}

	public void requisicaoMatLimpeza() {
	}

	public void atualizarMatLimpeza() {
	}

	public void removerMatLimpeza() {
	}
}
