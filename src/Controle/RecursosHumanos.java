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

	// Adicionar
	// As funções retornam true se foi possível adicionar,
	// false se já existe pessoa com o RG dado.

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

	// Alterar
	// As funções retornam true se foi possível alterar,
	// false se não existe pessoa com o RG dado.

	public boolean alteraProfessor(String rg, String nome, int idade) {
		if (this.professores.containsKey(rg)) {
			Professor novoProfessor = new Professor(this.professores.get(rg).getIdProfessor(), nome, rg, idade);
			this.professores.replace(rg, novoProfessor);
			return true;
		}
		return false;
	}

	public boolean alteraAluno(String rg, String nome, int idade) {
		if (this.alunos.containsKey(rg)) {
			Aluno novoAluno = new Aluno(this.alunos.get(rg).getIdAluno(), nome, rg, idade);
			this.alunos.replace(rg, novoAluno);
			return true;
		}
		return false;
	}

	public boolean alteraInstrutor(String rg, String nome, int idade) {
		if (this.instrutores.containsKey(rg)) {
			Instrutor novoInstrutor = new Instrutor(this.instrutores.get(rg).getIdInstrutor(), nome, rg, idade);
			this.instrutores.replace(rg, novoInstrutor);
			return true;
		}
		return false;
	}

	public boolean alteraMonitor(String rg, String nome, int idade) {
		if (this.monitores.containsKey(rg)) {
			Monitor novoMonitor = new Monitor(this.monitores.get(rg).getIdMonitor(), nome, rg, idade);
			this.monitores.replace(rg, novoMonitor);
			return true;
		}
		return false;
	}

	public boolean alteraCozinheiro(String rg, String nome, int idade) {
		if (this.cozinheiros.containsKey(rg)) {
			Cozinheiro novoCozinheiro = new Cozinheiro(this.cozinheiros.get(rg).getIdCozinheiro(), nome, rg, idade);
			this.cozinheiros.replace(rg, novoCozinheiro);
			return true;
		}
		return false;
	}

	public boolean alteraServente(String rg, String nome, int idade) {
		if (this.serventes.containsKey(rg)) {
			Servente novoServente = new Servente(this.serventes.get(rg).getIdServente(), nome, rg, idade);
			this.serventes.replace(rg, novoServente);
			return true;
		}
		return false;
	}

	// Remover
	// As funções retornam true se foi possível remover,
	// false se não existe pessoa com o RG dado.

	public boolean removeProfessor(String rg, String nome, int idade) {
		if (this.professores.containsKey(rg)) {
			this.professores.remove(rg);
			return true;
		}
		return false;
	}

	public boolean removeAluno(String rg, String nome, int idade) {
		if (this.alunos.containsKey(rg)) {
			this.alunos.remove(rg);
			return true;
		}
		return false;
	}

	public boolean removeInstrutor(String rg, String nome, int idade) {
		if (this.instrutores.containsKey(rg)) {
			this.instrutores.remove(rg);
			return true;
		}
		return false;
	}

	public boolean removeMonitor(String rg, String nome, int idade) {
		if (this.monitores.containsKey(rg)) {
			this.monitores.remove(rg);
			return true;
		}
		return false;
	}

	public boolean removeCozinheiro(String rg, String nome, int idade) {
		if (this.cozinheiros.containsKey(rg)) {
			this.cozinheiros.remove(rg);
			return true;
		}
		return false;
	}

	public boolean removeServente(String rg, String nome, int idade) {
		if (this.serventes.containsKey(rg)) {
			this.serventes.remove(rg);
			return true;
		}
		return false;
	}
}
