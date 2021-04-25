package Controle;

import java.util.Collection;
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

	protected HashMap<String, Professor> getProfessores() {
		return this.professores;
	}

	protected HashMap<String, Aluno> getAlunos() {
		return this.alunos;
	}

	protected HashMap<String, Instrutor> getInstrutores() {
		return this.instrutores;
	}

	protected HashMap<String, Monitor> getMonitores() {
		return this.monitores;
	}

	protected HashMap<String, Cozinheiro> getCozinheiros() {
		return this.cozinheiros;
	}

	protected HashMap<String, Servente> getServentes() {
		return this.serventes;
	}

	protected int getNumProfessores() {
		return this.professores.size();
	}

	protected int getNumAlunos() {
		return this.alunos.size();
	}

	protected int getNumInstrutores() {
		return this.instrutores.size();
	}

	protected int getNumMonitores() {
		return this.monitores.size();
	}

	protected int getNumCozinheiros() {
		return this.cozinheiros.size();
	}

	protected int getNumServentes() {
		return this.serventes.size();
	}

	// Getters
	// Assume que existe pessoa com o rg dado

	protected Professor getProfessor(String rg) {
		return this.professores.get(rg);
	}

	protected Aluno getAluno(String rg) {
		return this.alunos.get(rg);
	}

	protected Instrutor getInstrutor(String rg) {
		return this.instrutores.get(rg);
	}

	protected Monitor getMonitor(String rg) {
		return this.monitores.get(rg);
	}

	protected Cozinheiro getCozinheiro(String rg) {
		return this.cozinheiros.get(rg);
	}

	protected Servente getServente(String rg) {
		return this.serventes.get(rg);
	}

	// Busca
	// As funções retornam true se existe pessoa com o RG dado,
	// false caso contrário.

	protected boolean buscaProfessor(String rg) {
		return this.professores.containsKey(rg);
	}

	protected boolean buscaAluno(String rg) {
		return this.alunos.containsKey(rg);
	}

	protected boolean buscaInstrutor(String rg) {
		return this.instrutores.containsKey(rg);
	}

	protected boolean buscaMonitor(String rg) {
		return this.monitores.containsKey(rg);
	}

	protected boolean buscaCozinheiro(String rg) {
		return this.cozinheiros.containsKey(rg);
	}

	protected boolean buscaServente(String rg) {
		return this.serventes.containsKey(rg);
	}

	// Adicionar
	// As funções retornam true se foi possível adicionar,
	// false se já existe pessoa com o RG dado.

	protected boolean addProfessor(String rg, String nome, String graduacao, float salario) {
		if (this.buscaProfessor(rg)) {
			return false;
		}
		this.professores.put(rg, new Professor(rg, nome, graduacao, salario));
		return true;
	}

	protected boolean addAluno(String rg, String nome, int ra, String curso) {
		if (this.buscaAluno(rg)) {
			return false;
		}
		this.alunos.put(rg, new Aluno(rg, nome, ra, curso));
		return true;
	}

	protected boolean addInstrutor(String rg, String nome, String curso) {
		if (this.buscaInstrutor(rg)) {
			return false;
		}
		this.instrutores.put(rg, new Instrutor(rg, nome, curso));
		return true;
	}

	protected boolean addMonitor(String rg, String nome, float salario) {
		if (this.buscaMonitor(rg)) {
			return false;
		}
		this.monitores.put(rg, new Monitor(rg, nome, salario));
		return true;
	}

	protected boolean addCozinheiro(String rg, String nome, float salario) {
		if (this.buscaCozinheiro(rg)) {
			return false;
		}
		this.cozinheiros.put(rg, new Cozinheiro(rg, nome, salario));
		return true;
	}

	protected boolean addServente(String rg, String nome, float salario) {
		if (this.buscaServente(rg)) {
			return false;
		}
		this.serventes.put(rg, new Servente(rg, nome, salario));
		return true;
	}

	// Alterar
	// As funções retornam true se foi possível alterar,
	// false se não existe pessoa com o RG dado.

	protected boolean alteraProfessor(String rg, String nome, String graduacao, float salario) {
		if (this.buscaProfessor(rg)) {
			this.professores.get(rg).setNome(nome);
			this.professores.get(rg).setGraduacao(graduacao);
			this.professores.get(rg).setSalario(salario);
			return true;
		}
		return false;
	}

	protected boolean alteraAluno(String rg, String nome, int ra, String curso) {
		if (this.buscaAluno(rg)) {
			this.alunos.get(rg).setNome(nome);
			this.alunos.get(rg).setRa(ra);
			this.alunos.get(rg).setCurso(curso);
			return true;
		}
		return false;
	}

	protected boolean alteraInstrutor(String rg, String nome, String curso) {
		if (this.buscaInstrutor(rg)) {
			this.instrutores.get(rg).setNome(nome);
			this.instrutores.get(rg).setCurso(curso);
			return true;
		}
		return false;
	}

	protected boolean alteraMonitor(String rg, String nome, float salario) {
		if (this.buscaMonitor(rg)) {
			this.monitores.get(rg).setNome(nome);
			this.monitores.get(rg).setSalario(salario);
			return true;
		}
		return false;
	}

	protected boolean alteraCozinheiro(String rg, String nome, float salario) {
		if (this.buscaCozinheiro(rg)) {
			this.cozinheiros.get(rg).setNome(nome);
			this.cozinheiros.get(rg).setSalario(salario);
			return true;
		}
		return false;
	}

	protected boolean alteraServente(String rg, String nome, float salario) {
		if (this.buscaServente(rg)) {
			this.serventes.get(rg).setNome(nome);
			this.serventes.get(rg).setSalario(salario);
			return true;
		}
		return false;
	}

	// Remover
	// As funções retornam true se foi possível remover,
	// false se não existe pessoa com o RG dado.

	protected boolean removeProfessor(String rg) {
		if (this.buscaProfessor(rg)) {
			this.professores.remove(rg);
			return true;
		}
		return false;
	}

	protected boolean removeAluno(String rg) {
		if (this.buscaAluno(rg)) {
			this.alunos.remove(rg);
			return true;
		}
		return false;
	}

	protected boolean removeInstrutor(String rg) {
		if (this.buscaInstrutor(rg)) {
			this.instrutores.remove(rg);
			return true;
		}
		return false;
	}

	protected boolean removeMonitor(String rg) {
		if (this.buscaMonitor(rg)) {
			this.monitores.remove(rg);
			return true;
		}
		return false;
	}

	protected boolean removeCozinheiro(String rg) {
		if (this.buscaCozinheiro(rg)) {
			this.cozinheiros.remove(rg);
			return true;
		}
		return false;
	}

	protected boolean removeServente(String rg) {
		if (this.buscaServente(rg)) {
			this.serventes.remove(rg);
			return true;
		}
		return false;
	}

	// Funções print
	protected void printProfessores() {
		Collection<Professor> listaProfessores = this.professores.values();
		System.out.println("Lista de Professores:");
		for (Professor p : listaProfessores) {
			System.out.println("\t" + p.toString());
		}
	}

	protected void printAlunos() {
		Collection<Aluno> listaAlunos = this.alunos.values();
		System.out.println("Lista de Alunos:");
		for (Aluno a : listaAlunos) {
			System.out.println("\t" + a.toString());
		}
	}

	protected void printInstrutores() {
		Collection<Instrutor> listaInstrutores = this.instrutores.values();
		System.out.println("Lista de Instrutores:");
		for (Instrutor i : listaInstrutores) {
			System.out.println("\t" + i.toString());
		}
	}

	protected void printMonitores() {
		Collection<Monitor> listaMonitores = this.monitores.values();
		System.out.println("Lista de Monitores:");
		for (Monitor m : listaMonitores) {
			System.out.println("\t" + m.toString());
		}
	}

	protected void printCozinheiros() {
		Collection<Cozinheiro> listaCozinheiros = this.cozinheiros.values();
		System.out.println("Lista de Cozinheiros:");
		for (Cozinheiro c : listaCozinheiros) {
			System.out.println("\t" + c.toString());
		}
	}

	protected void printServentes() {
		Collection<Servente> listaServentes = this.serventes.values();
		System.out.println("Lista de Serventes:");
		for (Servente s : listaServentes) {
			System.out.println("\t" + s.toString());
		}
	}

	protected void printRH() {
		System.out.println("Recursos Humanos\n");
		this.printProfessores();
		this.printAlunos();
		this.printInstrutores();
		this.printMonitores();
		this.printCozinheiros();
		this.printServentes();
	}
}
