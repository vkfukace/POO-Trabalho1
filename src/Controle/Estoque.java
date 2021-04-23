package Controle;

import java.util.Scanner;
import Entidades.RecursoHumano.*;

public class Estoque {

	private RecursosHumanos recursosHumanos;
	private RecursosMateriais recursosMateriais;

	public Estoque() {
		this.recursosHumanos = new RecursosHumanos();
		this.recursosMateriais = new RecursosMateriais();
	}

	public RecursosHumanos getRecursosHumanos() {
		return this.recursosHumanos;
	}

	public RecursosMateriais getRecursosMateriais() {
		return this.recursosMateriais;
	}

	// ########################################################################################################
	// Funções Cadastro

	public boolean cadastrarProfessor(Scanner input) {
		String rg;
		String nome;
		String graduacao;
		float salario;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Graduacao: ");
		graduacao = input.nextLine();
		System.out.print("Salario: ");
		salario = Float.parseFloat(input.nextLine());

		return this.getRecursosHumanos().addProfessor(rg, nome, graduacao, salario);
	}

	public boolean cadastrarAluno(Scanner input) {
		String rg;
		String nome;
		int ra;
		String curso;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("RA: ");
		ra = Integer.parseInt(input.nextLine());
		System.out.print("Curso: ");
		curso = input.nextLine();

		return this.getRecursosHumanos().addAluno(rg, nome, ra, curso);
	}

	public boolean cadastrarInstrutor(Scanner input) {
		String rg;
		String nome;
		String curso;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Curso: ");
		curso = input.nextLine();

		return this.getRecursosHumanos().addInstrutor(rg, nome, curso);
	}

	public boolean cadastrarMonitor(Scanner input) {
		String rg;
		String nome;
		float salario;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Salario: ");
		salario = Float.parseFloat(input.nextLine());

		return this.getRecursosHumanos().addMonitor(rg, nome, salario);
	}

	public boolean cadastrarCozinheiro(Scanner input) {
		String rg;
		String nome;
		float salario;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Salario: ");
		salario = Float.parseFloat(input.nextLine());

		return this.getRecursosHumanos().addCozinheiro(rg, nome, salario);
	}

	public boolean cadastrarServente(Scanner input) {
		String rg;
		String nome;
		float salario;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Salario: ");
		salario = Float.parseFloat(input.nextLine());

		return this.getRecursosHumanos().addServente(rg, nome, salario);
	}

	public boolean cadastrarMaterialDidatico(Scanner input) {

		String[] listaNomes = { "Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ",
				"Quantidade de Apagador: ", "Quantidade de Pincel: " };
		int[] listaQtd = new int[5];
		for (int i = 0; i < listaQtd.length; i++) {
			System.out.print(listaNomes[i]);
			listaQtd[i] = Integer.parseInt(input.nextLine());
		}

		return this.getRecursosMateriais().AdicionarRecusoMaterialDidatico(listaQtd[0], listaQtd[1], listaQtd[2],
				listaQtd[3], listaQtd[4]);
	}

	public boolean cadastrarMaterialEscolar(Scanner input) {

		String[] listaNomes = { "Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: " };
		int[] listaQtd = new int[3];
		for (int i = 0; i < listaQtd.length; i++) {
			System.out.print(listaNomes[i]);
			listaQtd[i] = Integer.parseInt(input.nextLine());
		}

		return this.getRecursosMateriais().AdicionarRecusoMaterialEscolar(listaQtd[0], listaQtd[1], listaQtd[2]);

	}

	public boolean cadastrarMaterialLimpeza(Scanner input) {

		String[] listaNomes = { "Quantidade de Alvejante: ", "Quantidade de Sabao em po: ",
				"Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: " };
		int[] listaQtd = new int[4];
		for (int i = 0; i < listaQtd.length; i++) {
			System.out.print(listaNomes[i]);
			listaQtd[i] = Integer.parseInt(input.nextLine());
		}

		return this.getRecursosMateriais().AdicionarRecusoMaterialLimpeza(listaQtd[0], listaQtd[1], listaQtd[2],
				listaQtd[3]);

	}

	// ########################################################################################################
	// Funções Atualizar

	public boolean atualizarProfessor(Scanner input) {
		String rg;
		String nome;
		String graduacao;
		float salario;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Graduacao: ");
		graduacao = input.nextLine();
		System.out.print("Salario: ");
		salario = Float.parseFloat(input.nextLine());

		return this.getRecursosHumanos().alteraProfessor(rg, nome, graduacao, salario);
	}

	public boolean atualizarAluno(Scanner input) {
		String rg;
		String nome;
		int ra;
		String curso;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("RA: ");
		ra = Integer.parseInt(input.nextLine());
		System.out.print("Curso: ");
		curso = input.nextLine();

		return this.getRecursosHumanos().alteraAluno(rg, nome, ra, curso);
	}

	public boolean atualizarInstrutor(Scanner input) {
		String rg;
		String nome;
		String curso;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Curso: ");
		curso = input.nextLine();

		return this.getRecursosHumanos().alteraInstrutor(rg, nome, curso);
	}

	public boolean atualizarMonitor(Scanner input) {
		String rg;
		String nome;
		float salario;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Salario: ");
		salario = Float.parseFloat(input.nextLine());

		return this.getRecursosHumanos().alteraMonitor(rg, nome, salario);
	}

	public boolean atualizarCozinheiro(Scanner input) {
		String rg;
		String nome;
		float salario;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Salario: ");
		salario = Float.parseFloat(input.nextLine());

		return this.getRecursosHumanos().alteraCozinheiro(rg, nome, salario);
	}

	public boolean atualizarServente(Scanner input) {
		String rg;
		String nome;
		float salario;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Salario: ");
		salario = Float.parseFloat(input.nextLine());

		return this.getRecursosHumanos().alteraServente(rg, nome, salario);
	}

	public boolean atualizarMaterialDidatico(Scanner input) {

		String[] listaNomes = { "Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ",
				"Quantidade de Apagador: ", "Quantidade de Pincel: " };
		int[] listaAux = new int[5];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.print(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		return this.getRecursosMateriais().AtualizarRecusoMaterialDidatico(listaAux[0], listaAux[1], listaAux[2],
				listaAux[3], listaAux[4]);
	}

	public boolean atualizarMaterialEscolar(Scanner input) {

		String[] listaNomes = { "Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: " };
		int[] listaAux = new int[3];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.println(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		return this.getRecursosMateriais().AtualizarRecusoMaterialEscolar(listaAux[0], listaAux[1], listaAux[2]);

	}

	public boolean atualizarMaterialLimpeza(Scanner input) {
		String[] listaNomes = { "Quantidade de Alvejante: ", "Quantidade de Sabao em po: ",
				"Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: " };
		int[] listaAux = new int[4];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.println(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		return this.getRecursosMateriais().AtualizarRecusoMaterialLimpeza(listaAux[0], listaAux[1], listaAux[2],
				listaAux[3]);

	}

	// ########################################################################################################
	// Funções Buscar

	public boolean buscarProfessor(Scanner input) {
		String rg;

		System.out.print("Insira o RG: ");
		rg = input.nextLine();

		if (this.getRecursosHumanos().buscaProfessor(rg)) {
			System.out.println(this.getRecursosHumanos().getProfessor(rg).toString());
			return true;
		} else {
			System.out.println("Professor nao encontrado");
			return false;
		}
	}

	public boolean buscarAluno(Scanner input) {
		String rg;

		System.out.print("Insira o RG: ");
		rg = input.nextLine();

		if (this.getRecursosHumanos().buscaAluno(rg)) {
			System.out.println(this.getRecursosHumanos().getAluno(rg).toString());
			return true;
		} else {
			System.out.println("Aluno nao encontrado");
			return false;
		}
	}

	public boolean buscarInstrutor(Scanner input) {
		String rg;

		System.out.print("Insira o RG: ");
		rg = input.nextLine();

		if (this.getRecursosHumanos().buscaInstrutor(rg)) {
			System.out.println(this.getRecursosHumanos().getInstrutor(rg).toString());
			return true;
		} else {
			System.out.println("Instrutor nao encontrado");
			return false;
		}
	}

	public boolean buscarMonitor(Scanner input) {
		String rg;

		System.out.print("Insira o RG: ");
		rg = input.nextLine();

		if (this.getRecursosHumanos().buscaMonitor(rg)) {
			System.out.println(this.getRecursosHumanos().getMonitor(rg).toString());
			return true;
		} else {
			System.out.println("Monitor nao encontrado");
			return false;
		}
	}

	public boolean buscarCozinheiro(Scanner input) {
		String rg;

		System.out.print("Insira o RG: ");
		rg = input.nextLine();

		if (this.getRecursosHumanos().buscaCozinheiro(rg)) {
			System.out.println(this.getRecursosHumanos().getCozinheiro(rg).toString());
			return true;
		} else {
			System.out.println("Cozinheiro nao encontrado");
			return false;
		}
	}

	public boolean buscarServente(Scanner input) {
		String rg;

		System.out.print("Insira o RG: ");
		rg = input.nextLine();

		if (this.getRecursosHumanos().buscaServente(rg)) {
			System.out.println(this.getRecursosHumanos().getServente(rg).toString());
			return true;
		} else {
			System.out.println("Servente nao encontrado");
			return false;
		}
	}

	public void buscarMaterialDidatico() {
		this.getRecursosMateriais().printMatDidatico();
	}

	public void buscarMaterialEscolar() {
		this.getRecursosMateriais().printMatEscolar();
	}

	public void buscarMaterialLimpeza() {
		this.getRecursosMateriais().printMatLimpeza();
	}

	// ########################################################################################################
	// Funções Remover

	public boolean removerProfessor(Scanner input) {
		String rg;

		System.out.print("Insira o RG:");
		rg = input.nextLine();

		return this.getRecursosHumanos().removeProfessor(rg);
	}

	public boolean removerAluno(Scanner input) {
		String rg;

		System.out.print("Insira o RG:");
		rg = input.nextLine();

		return this.getRecursosHumanos().removeAluno(rg);
	}

	public boolean removerInstrutor(Scanner input) {
		String rg;

		System.out.print("Insira o RG:");
		rg = input.nextLine();

		return this.getRecursosHumanos().removeInstrutor(rg);
	}

	public boolean removerMonitor(Scanner input) {
		String rg;

		System.out.print("Insira o RG:");
		rg = input.nextLine();

		return this.getRecursosHumanos().removeMonitor(rg);
	}

	public boolean removerCozinheiro(Scanner input) {
		String rg;

		System.out.print("Insira o RG:");
		rg = input.nextLine();

		return this.getRecursosHumanos().removeCozinheiro(rg);
	}

	public boolean removerServente(Scanner input) {
		String rg;

		System.out.print("Insira o RG:");
		rg = input.nextLine();

		return this.getRecursosHumanos().removeServente(rg);
	}

	public boolean removerMaterialDidatico(Scanner input) {
		String[] listaNomes = { "Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ",
				"Quantidade de Apagador: ", "Quantidade de Pincel: " };
		int[] listaAux = new int[5];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.println(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		return this.getRecursosMateriais().RemoverRecusoMaterialDidatico(listaAux[0], listaAux[1], listaAux[2],
				listaAux[3], listaAux[4]);
	}

	public boolean removerMaterialEscolar(Scanner input) {

		String[] listaNomes = { "Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: " };
		int[] listaAux = new int[3];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.println(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		return this.getRecursosMateriais().RemoverRecusoMaterialEscolar(listaAux[0], listaAux[1], listaAux[2]);

	}

	public boolean removerMaterialLimpeza(Scanner input) {

		String[] listaNomes = { "Quantidade de Alvejante: ", "Quantidade de Sabao em po: ",
				"Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: " };
		int[] listaAux = new int[4];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.println(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		return this.getRecursosMateriais().RemoverRecusoMaterialLimpeza(listaAux[0], listaAux[1], listaAux[2],
				listaAux[3]);

	}

	// ########################################################################################################
	// Funções Requisicao

	public void requisicaoMatDidatico(String rh, Scanner input) {
		System.out.println("Rg da pessoa a receber a requisicao: ");
		String Rg = input.nextLine();

		String[] listaNomes = { "Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ",
				"Quantidade de Apagador: ", "Quantidade de Pincel: " };
		int[] listaAux = new int[5];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.println(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		switch (rh) {
		case "professor":
			Professor profaux = this.getRecursosHumanos().getProfessores().get(Rg);
			if (profaux != null) {

				if (this.getRecursosMateriais().getMateriaisDidaticos().getLivro() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisDidaticos().remLivro(listaAux[0]);
					profaux.getMatDidatico().addLivro(listaAux[0]);
					System.out.println("Requisao concluida");
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisDidaticos().getQuadro() >= listaAux[1]) {
					this.getRecursosMateriais().getMateriaisDidaticos().remQuadro(listaAux[1]);
					profaux.getMatDidatico().addQuadro(listaAux[1]);
					System.out.println("Requisao concluida");
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisDidaticos().getGiz() >= listaAux[2]) {
					this.getRecursosMateriais().getMateriaisDidaticos().remGiz(listaAux[2]);
					profaux.getMatDidatico().addGiz(listaAux[2]);
					System.out.println("Requisao concluida");
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisDidaticos().getApagador() >= listaAux[3]) {
					this.getRecursosMateriais().getMateriaisDidaticos().remApagador(listaAux[3]);
					profaux.getMatDidatico().addApagador(listaAux[3]);
					System.out.println("Requisao concluida");
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisDidaticos().getPincel() >= listaAux[4]) {
					this.getRecursosMateriais().getMateriaisDidaticos().remPincel(listaAux[4]);
					profaux.getMatDidatico().addPincel(listaAux[4]);
					System.out.println("Requisao concluida");
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
			}
			break;

		case "instrutor":
			Instrutor instaux = this.getRecursosHumanos().getInstrutores().get(Rg);
			if (instaux != null) {
				if (this.getRecursosMateriais().getMateriaisDidaticos().getApagador() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisDidaticos().remApagador(listaAux[0]);
					instaux.getMatDidadico().addApagador(listaAux[0]);
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisDidaticos().getGiz() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisDidaticos().remGiz(listaAux[0]);
					instaux.getMatDidadico().addGiz(listaAux[0]);
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisDidaticos().getLivro() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisDidaticos().remLivro(listaAux[0]);
					instaux.getMatDidadico().addLivro(listaAux[0]);
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisDidaticos().getPincel() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisDidaticos().remPincel(listaAux[0]);
					instaux.getMatDidadico().addPincel(listaAux[0]);
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisDidaticos().getQuadro() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisDidaticos().remQuadro(listaAux[0]);
					instaux.getMatDidadico().addQuadro(listaAux[0]);
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}

			}
			break;

		case "monitor":
			Instrutor moniaux = this.getRecursosHumanos().getInstrutores().get(Rg);
			if (moniaux != null) {
				if (this.getRecursosMateriais().getMateriaisDidaticos().getApagador() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisDidaticos().remApagador(listaAux[0]);
					moniaux.getMatDidadico().addApagador(listaAux[0]);
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisDidaticos().getGiz() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisDidaticos().remGiz(listaAux[0]);
					moniaux.getMatDidadico().addGiz(listaAux[0]);
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisDidaticos().getLivro() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisDidaticos().remLivro(listaAux[0]);
					moniaux.getMatDidadico().addLivro(listaAux[0]);
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisDidaticos().getPincel() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisDidaticos().remPincel(listaAux[0]);
					moniaux.getMatDidadico().addPincel(listaAux[0]);
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisDidaticos().getQuadro() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisDidaticos().remQuadro(listaAux[0]);
					moniaux.getMatDidadico().addQuadro(listaAux[0]);
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}

			}
			break;
		}
	}

	public void requisicaoMatEscolar(String rh, Scanner input) {
		System.out.println("Rg da pessoa a receber a requisicao: ");
		String Rg = input.nextLine();

		String[] listaNomes = { "Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: " };
		int[] listaAux = new int[3];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.println(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		switch (rh) {
		case "aluno":
			Aluno aluaux = this.getRecursosHumanos().getAlunos().get(Rg);
			if (aluaux != null) {

				if (this.getRecursosMateriais().getMateriaisEscolares().getLapis() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisEscolares().remLapis(listaAux[0]);
					aluaux.getMatEscolar().addLapis(listaAux[0]);
					System.out.println("Requisao concluida");
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisEscolares().getCaderno() >= listaAux[1]) {
					this.getRecursosMateriais().getMateriaisEscolares().remCaderno(listaAux[1]);
					aluaux.getMatEscolar().addCaderno(listaAux[1]);
					System.out.println("Requisao concluida");
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisEscolares().getCaneta() >= listaAux[2]) {
					this.getRecursosMateriais().getMateriaisEscolares().remCaneta(listaAux[2]);
					aluaux.getMatEscolar().addCaneta(listaAux[2]);
					System.out.println("Requisao concluida");
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
			}
			break;

		}
	}

	public void requisicaoMatLimpeza(String rh, Scanner input) {
		System.out.println("Rg da pessoa a receber a requisicao: ");
		String Rg = input.nextLine();

		String[] listaNomes = { "Quantidade de Alvejante: ", "Quantidade de Sabao em po: ",
				"Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: " };
		int[] listaAux = new int[4];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.println(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		switch (rh) {
		case "servente":
			Servente servaux = this.getRecursosHumanos().getServentes().get(Rg);
			if (servaux != null) {

				if (this.getRecursosMateriais().getMateriaisLimpeza().getAlvejante() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisLimpeza().remAlvejante(listaAux[0]);
					servaux.getMatLimpeza().addAlvejante(listaAux[0]);
					System.out.println("Requisao concluida");
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisLimpeza().getSabaoPo() >= listaAux[1]) {
					this.getRecursosMateriais().getMateriaisLimpeza().remSabaoPo(listaAux[1]);
					servaux.getMatLimpeza().addSabaoPo(listaAux[1]);
					System.out.println("Requisao concluida");
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisLimpeza().getAguaSanitaria() >= listaAux[2]) {
					this.getRecursosMateriais().getMateriaisLimpeza().remAguaSanitaria(listaAux[2]);
					servaux.getMatLimpeza().addAguaSanitaria(listaAux[2]);
					System.out.println("Requisao concluida");
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisLimpeza().getSabaoBarra() >= listaAux[3]) {
					this.getRecursosMateriais().getMateriaisLimpeza().remSabaoBarra(listaAux[3]);
					servaux.getMatLimpeza().addSabaoBarra(listaAux[3]);
					System.out.println("Requisao concluida");
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
			}
			break;
		case "cozinheiro":
			Cozinheiro cozaux = this.getRecursosHumanos().getCozinheiros().get(Rg);
			if (cozaux != null) {

				if (this.getRecursosMateriais().getMateriaisLimpeza().getAlvejante() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisLimpeza().remAlvejante(listaAux[0]);
					cozaux.getMatLimpeza().addAlvejante(listaAux[0]);
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisLimpeza().getSabaoPo() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisLimpeza().remSabaoPo(listaAux[0]);
					cozaux.getMatLimpeza().addSabaoPo(listaAux[0]);
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisLimpeza().getAguaSanitaria() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisLimpeza().remAguaSanitaria(listaAux[0]);
					cozaux.getMatLimpeza().addAguaSanitaria(listaAux[0]);
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
				if (this.getRecursosMateriais().getMateriaisLimpeza().getSabaoBarra() >= listaAux[0]) {
					this.getRecursosMateriais().getMateriaisLimpeza().remSabaoBarra(listaAux[0]);
					cozaux.getMatLimpeza().addSabaoBarra(listaAux[0]);
				} else {
					System.out.println("Estoque insuficiente, espere reposicao mensal");
				}
			}
			break;

		}
	}

	// ########################################################################################################
	// Funções Relatorio

	public void relatorioRH() {
		this.recursosHumanos.printRH();
	}

	public void relatorioRM() {
		this.recursosMateriais.printRM();
	}

	public void relatorioGeral() {
		this.recursosMateriais.printRM();
		this.recursosHumanos.printRH();
	}
}
