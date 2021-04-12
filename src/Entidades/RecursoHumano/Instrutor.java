package Entidades.RecursoHumano;

public class Instrutor extends Pessoa {
    private int idInstrutor;

    public Instrutor(int idInstrutor, String nome, String rg, int idade) {
        super(nome, rg, idade);
        this.idInstrutor = idInstrutor;
    }

    public int getIdInstrutor() {
        return this.idInstrutor;
    }

    @Override
    public String toString() {
        return "{" + " idInstrutor='" + getIdInstrutor() + "', " + super.toString() + "}";
    }

}
