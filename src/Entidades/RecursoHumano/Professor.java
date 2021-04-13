package Entidades.RecursoHumano;
import Controle.RecursosMateriais;
import Entidades.RecursoMaterial.MateriaisDidaticos;

public class Professor extends Pessoa {
	private int idProfessor;
	private MateriaisDidaticos matDidatico ;

	public MateriaisDidaticos getMatDidatico() {
		return this.matDidatico;
	}

	public Professor(int idProfessor, String nome, String rg, int idade) {
		super(nome, rg, idade);
		this.idProfessor = idProfessor;
		this.matDidatico = new MateriaisDidaticos() ;
	}

	public int getIdProfessor() {
		return this.idProfessor;
	}

	@Override
	public String toString() {
		return "{" + " idProfessor='" + getIdProfessor() + "', " + super.toString() + "}";
	}

	public void requisicaoMatDidatico(){}
	public void atualizarMatDidatico(){}
	public void removerMatDidatico(){}
 
}
