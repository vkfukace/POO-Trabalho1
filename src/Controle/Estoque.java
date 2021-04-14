package Controle;

public class Estoque {

	private RecursosHumanos rh;

	private RecursosMateriais rm;

	public RecursosHumanos getRecursosHumanos() {
		return this.rh;
	}

	public RecursosMateriais getRecursosMateriais() {
		return this.rm;
	}

	public Estoque() {
		this.rh = new RecursosHumanos();
		this.rm = new RecursosMateriais();
	}

	public String estoqueRecursosMateriais() {
		return getRecursosMateriais().getMateriaisDidaticos().toString() + "\n"
				+ getRecursosMateriais().getMateriaisEscolares().toString() + "\n"
				+ getRecursosMateriais().getMateriaisLimpeza().toString();

	}

}
