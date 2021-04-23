package Entidades.RecursoHumano;

import Entidades.RecursoMaterial.MateriaisLimpeza;

public class Cozinheiro extends Pessoa {
	private float salario;
	private MateriaisLimpeza matLimpeza;

	public Cozinheiro(String rg, String nome, float salario) {
		super(rg, nome);
		this.matLimpeza = new MateriaisLimpeza();
		this.salario = salario;
	}

	public float getSalario() {
		return this.salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public MateriaisLimpeza getMatLimpeza() {
		return this.matLimpeza;
	}

	@Override
	public String toString() {
		return "{" + super.toString() + ", salario='" + getSalario() + "'" + ", matLimpeza='"
				+ getMatLimpeza().toString() + "'" + "}";
	}

}
