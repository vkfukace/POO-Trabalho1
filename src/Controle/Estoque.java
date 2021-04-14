package Controle;

import java.util.Scanner;
import Entidades.RecursoHumano.*;

public class Estoque {

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

	public String estoqueRecursosMateriais() {
		return getRecursosMateriais().getMateriaisDidaticos().toString() + "\n"
				+ getRecursosMateriais().getMateriaisEscolares().toString() + "\n"
				+ getRecursosMateriais().getMateriaisLimpeza().toString();

	}

	// ########################################################################################################
	// Funções Cadastro

	public boolean cadastrarProfessor(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.print("Rg: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Idade: ");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().addProfessor(rg, nome, idade);
	}

	public boolean cadastrarAluno(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.print("Rg: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Idade: ");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().addAluno(rg, nome, idade);
	}

	public boolean cadastrarInstrutor(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.print("Rg: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Idade: ");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().addInstrutor(rg, nome, idade);
	}

	public boolean cadastrarMonitor(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.print("Rg: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Idade: ");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().addMonitor(rg, nome, idade);
	}

	public boolean cadastrarCozinheiro(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.print("Rg: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Idade: ");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().addCozinheiro(rg, nome, idade);
	}

	public boolean cadastrarServente(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.print("Rg: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Idade: ");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().addServente(rg, nome, idade);
	}

	public boolean cadastrarMaterialDidatico(Scanner input) {

		String[] listaNomes = { "Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ",
				"Quantidade de Apagador: ", "Quantidade de Pincel: " };
		int[] listaAux = new int[5];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.print(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		return this.getRecursosMateriais().AdicionarRecusoMaterialDidatico(listaAux[0], listaAux[1], listaAux[2],
				listaAux[3], listaAux[4]);
	}

	public boolean cadastrarMaterialEscolar(Scanner input) {

		String[] listaNomes = { "Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: " };
		int[] listaAux = new int[3];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.print(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		return this.getRecursosMateriais().AdicionarRecusoMaterialEscolar(listaAux[0], listaAux[1], listaAux[2]);

	}

	public boolean cadastrarMaterialLimpeza(Scanner input) {

		String[] listaNomes = { "Quantidade de Alvejante: ", "Quantidade de Sabao em po: ",
				"Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: " };
		int[] listaAux = new int[4];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.print(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		return this.getRecursosMateriais().AdicionarRecusoMaterialLimpeza(listaAux[0], listaAux[1], listaAux[2],
				listaAux[3]);

	}

	// ########################################################################################################
	// Funções Atualizar

	public boolean atualizarProfessor(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.print("Rg: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Idade: ");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().alteraProfessor(rg, nome, idade);
	}

	public boolean atualizarAluno(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.print("Rg: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Idade: ");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().alteraAluno(rg, nome, idade);
	}

	public boolean atualizarInstrutor(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.print("Rg: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Idade: ");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().alteraInstrutor(rg, nome, idade);
	}

	public boolean atualizarMonitor(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.print("Rg: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Idade: ");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().alteraMonitor(rg, nome, idade);
	}

	public boolean atualizarCozinheiro(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.print("Rg: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Idade: ");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().alteraCozinheiro(rg, nome, idade);
	}

	public boolean atualizarServente(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.print("Rg: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Idade: ");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().alteraServente(rg, nome, idade);
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
	// Funções Remover

	public boolean removerProfessor(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.println("Rg:");
		rg = input.nextLine();
		System.out.println("Nome:");
		nome = input.nextLine();
		System.out.println("Idade:");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().removeProfessor(rg, nome, idade);
	}

	public boolean removerAluno(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.println("Rg:");
		rg = input.nextLine();
		System.out.println("Nome:");
		nome = input.nextLine();
		System.out.println("Idade:");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().removeAluno(rg, nome, idade);
	}

	public boolean removerInstrutor(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.println("Rg:");
		rg = input.nextLine();
		System.out.println("Nome:");
		nome = input.nextLine();
		System.out.println("Idade:");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().removeInstrutor(rg, nome, idade);
	}

	public boolean removerMonitor(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.println("Rg:");
		rg = input.nextLine();
		System.out.println("Nome:");
		nome = input.nextLine();
		System.out.println("Idade:");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().removeMonitor(rg, nome, idade);
	}

	public boolean removerCozinheiro(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.println("Rg:");
		rg = input.nextLine();
		System.out.println("Nome:");
		nome = input.nextLine();
		System.out.println("Idade:");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().removeCozinheiro(rg, nome, idade);
	}

	public boolean removerServente(Scanner input) {
		String rg;
		String nome;
		int idade;

		System.out.println("Rg:");
		rg = input.nextLine();
		System.out.println("Nome:");
		nome = input.nextLine();
		System.out.println("Idade:");
		idade = Integer.parseInt(input.nextLine());

		return this.getRecursosHumanos().removeServente(rg, nome, idade);
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
}
