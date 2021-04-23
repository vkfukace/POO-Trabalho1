package Entidades.RecursoHumano;

import Entidades.RecursoMaterial.MateriaisDidaticos;

public class Monitor extends Pessoa {
    private float salario;
    private MateriaisDidaticos matDidadico;

    public Monitor(String rg, String nome, float salario) {
        super(rg, nome);
        this.salario = salario;
        matDidadico = new MateriaisDidaticos();
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public MateriaisDidaticos getMatDidadico() {
        return this.matDidadico;
    }

    @Override
    public String toString() {
        return "{" + super.toString() + ", salario='" + getSalario() + "'" + ", matDidadico='"
                + getMatDidadico().toString() + "'" + "}";
    }

}
