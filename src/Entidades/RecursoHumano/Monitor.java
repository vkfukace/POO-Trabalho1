package Entidades.RecursoHumano;

import Entidades.RecursoMaterial.MateriaisDidaticos;

public class Monitor extends Pessoa {
    private int idMonitor;
    private MateriaisDidaticos matDidadico ;

    
    public MateriaisDidaticos getMatDidadico() {
        return this.matDidadico;
    }

    


    public Monitor(int idMonitor, String nome, String rg, int idade) {
        super(nome, rg, idade);
        this.idMonitor = idMonitor;
        matDidadico = new MateriaisDidaticos();
    }

    public int getIdMonitor() {
        return this.idMonitor;
    }

    @Override
    public String toString() {
        return "{" + " idMonitor='" + getIdMonitor() + "', " + super.toString() + "}";
    }
    
    public void requisicaoMatDidatico(){}
	public void atualizarMatDidatico(){}
	public void removerMatDidatico(){}

}
