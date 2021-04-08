package Controle;

public class Estoque  {

	private RecursosHumanos recursosHumanos;

	private RecursosMateriais recursosMateriais;

	public Estoque() {
		this.recursosHumanos = new RecursosHumanos();
		this.recursosMateriais = new RecursosMateriais();
	}

	public void estoqueRecursosMateriais(){
		this.recursosMateriais.getMateriaisDidaticos().toString() ;
		this.recursosMateriais.getMateriaisEscolares().toString() ;
		this.recursosMateriais.getMateriaisLimpeza().toString() ;
		
	}
	

}
