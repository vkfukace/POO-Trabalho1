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

	public boolean adicionar(int opcao, String rg, String nome, int idade) {
		switch (opcao) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		default:
		}
		return true;
	}

}
