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

}
