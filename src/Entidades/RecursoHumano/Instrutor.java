package Entidades.RecursoHumano;

import Entidades.RecursoMaterial.MateriaisDidaticos;

public class Instrutor extends Pessoa {
    private String curso;
    private MateriaisDidaticos matDidadico;

    public Instrutor(String rg, String nome, String curso) {
        super(rg, nome);
        this.curso = curso;
        matDidadico = new MateriaisDidaticos();
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public MateriaisDidaticos getMatDidadico() {
        return this.matDidadico;
    }

    @Override
    public String toString() {
        return "{" + super.toString() + ", curso='" + getCurso() + "'" + ", matDidadico='" + getMatDidadico().toString()
                + "'" + "}";
    }

}
