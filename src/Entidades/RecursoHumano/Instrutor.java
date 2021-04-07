package Entidades.RecursoHumano;

public class Instrutor extends Pessoa {
    private String regInstrutor;

    public Instrutor(String regInstrutor, String nome, String rg, int idade) {
        super(nome, rg, idade);
        this.regInstrutor = regInstrutor;
    }

    public String getRegInstrutor() {
        return this.regInstrutor;
    }
}
