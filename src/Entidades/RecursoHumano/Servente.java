package Entidades.RecursoHumano;

import Entidades.RecursoMaterial.MateriaisLimpeza;

public class Servente extends Pessoa {
	private float salario;
	private MateriaisLimpeza matLimpeza;

	public Servente(String rg, String nome, float salario) {
		super(rg, nome);
		this.salario = salario;
		this.matLimpeza = new MateriaisLimpeza();
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
