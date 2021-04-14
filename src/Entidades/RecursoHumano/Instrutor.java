package Entidades.RecursoHumano;

import Entidades.RecursoMaterial.MateriaisDidaticos;

public class Instrutor extends Pessoa {
    private int idInstrutor;
    private MateriaisDidaticos matDidadico;

    public MateriaisDidaticos getMatDidadico() {
        return this.matDidadico;
    }

    public Instrutor(int idInstrutor, String nome, String rg, int idade) {
        super(nome, rg, idade);
        this.idInstrutor = idInstrutor;
        matDidadico = new MateriaisDidaticos();
    }

    public int getIdInstrutor() {
        return this.idInstrutor;
    }

    @Override
    public String toString() {
        return "{" + " idInstrutor='" + getIdInstrutor() + "', " + super.toString() + "recursos="
                + getMatDidadico().toString() + "}";
    }

    public void requisicaoMatDidatico() {
    }

    public void atualizarMatDidatico() {
    }

    public void removerMatDidatico() {
    }
}
