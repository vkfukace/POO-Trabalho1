package Controle;

import java.util.HashMap;

import Entidades.RecursoHumano.*;

public class RecursosHumanos {

	private HashMap<String, Professor> professores;

	private HashMap<String, Aluno> alunos;

	private HashMap<String, Instrutor> instrutores;

	private HashMap<String, Monitor> monitores;

	private HashMap<String, Cozinheiro> cozinheiros;

	private HashMap<String, Servente> serventes;

	public RecursosHumanos() {
		this.professores = new HashMap<String, Professor>();
		this.alunos = new HashMap<String, Aluno>();
		this.instrutores = new HashMap<String, Instrutor>();
		this.monitores = new HashMap<String, Monitor>();
		this.cozinheiros = new HashMap<String, Cozinheiro>();
		this.serventes = new HashMap<String, Servente>();
	}

	public boolean addProfessor(String rg, String nome, int idade) {
		if (this.professores.containsKey(rg)) {
			return false;
		}
		int idProfessor = this.professores.size() + 1;
		this.professores.put(rg, new Professor(idProfessor, nome, rg, idade));
		return true;
	}

	public boolean addAluno(String rg, String nome, int idade) {
		if (this.alunos.containsKey(rg)) {
			return false;
		}
		int idAluno = this.alunos.size() + 1;
		this.alunos.put(rg, new Aluno(idAluno, nome, rg, idade));
		return true;
	}

	public boolean addInstrutor(String rg, String nome, int idade) {
		if (this.instrutores.containsKey(rg)) {
			return false;
		}
		int idInstrutor = this.instrutores.size() + 1;
		this.instrutores.put(rg, new Instrutor(idInstrutor, nome, rg, idade));
		return true;
	}

	public boolean addMonitor(String rg, String nome, int idade) {
		if (this.monitores.containsKey(rg)) {
			return false;
		}
		int idMonitor = this.monitores.size() + 1;
		this.monitores.put(rg, new Monitor(idMonitor, nome, rg, idade));
		return true;
	}

	public boolean addCozinheiro(String rg, String nome, int idade) {
		if (this.cozinheiros.containsKey(rg)) {
			return false;
		}
		int idCozinheiro = this.cozinheiros.size() + 1;
		this.cozinheiros.put(rg, new Cozinheiro(idCozinheiro, nome, rg, idade));
		return true;
	}

	public boolean addServente(String rg, String nome, int idade) {
		if (this.serventes.containsKey(rg)) {
			return false;
		}
		int idServente = this.serventes.size() + 1;
		this.serventes.put(rg, new Servente(idServente, nome, rg, idade));
		return true;
	}
}
