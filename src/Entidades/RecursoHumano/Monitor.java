package Entidades.RecursoHumano;

public class Monitor extends Pessoa {
    private String regMonitor;

    public Monitor(String regMonitor, String nome, String rg, int idade) {
        super(nome, rg, idade);
        this.regMonitor = regMonitor;
    }

    public String getRegMonitor() {
        return this.regMonitor;
    }
}
