package Controle;

public class Estoque  {

	private RecursosHumanos recursosHumanos;

	private RecursosMateriais recursosMateriais;


	public RecursosHumanos getRecursosHumanos() {
		return this.recursosHumanos;
	}

	public RecursosMateriais getRecursosMateriais() {
		return this.recursosMateriais;
	}

	public Estoque() {
		this.recursosHumanos = new RecursosHumanos();
		this.recursosMateriais = new RecursosMateriais();
	}

	public String estoqueRecursosMateriais(){
		return getRecursosMateriais().getMateriaisDidaticos().toString() + "\n" + getRecursosMateriais().getMateriaisEscolares().toString() + "\n" +getRecursosMateriais().getMateriaisLimpeza().toString() ;

	}
	

}
