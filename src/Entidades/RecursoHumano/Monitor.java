package Entidades.RecursoHumano;

public class Monitor extends Pessoa {
    private int idMonitor;

    public Monitor(int idMonitor, String nome, String rg, int idade) {
        super(nome, rg, idade);
        this.idMonitor = idMonitor;
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    @Override
    public String toString() {
        return "{" + " idMonitor='" + getIdMonitor() + "', " + super.toString() + "}";
    }

}
