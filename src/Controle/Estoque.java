package Controle;

import java.util.Scanner;

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

	public void cadastrarProfessor(Scanner input) {
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

		if (this.getRecursosHumanos().addProfessor(rg, nome, graduacao, salario)) {
			System.out.println("Professor adicionado com sucesso");
		} else {
			System.out.println("ERRO: Professor com RG dado ja existe");
		}
	}

	public void cadastrarAluno(Scanner input) {
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

		if (this.getRecursosHumanos().addAluno(rg, nome, ra, curso)) {
			System.out.println("Aluno adicionado com sucesso");
		} else {
			System.out.println("ERRO: Aluno com RG dado ja existe");
		}
	}

	public void cadastrarInstrutor(Scanner input) {
		String rg;
		String nome;
		String curso;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Curso: ");
		curso = input.nextLine();

		if (this.getRecursosHumanos().addInstrutor(rg, nome, curso)) {
			System.out.println("Instrutor adicionado com sucesso");
		} else {
			System.out.println("ERRO: Instrutor com RG dado ja existe");
		}
	}

	public void cadastrarMonitor(Scanner input) {
		String rg;
		String nome;
		float salario;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Salario: ");
		salario = Float.parseFloat(input.nextLine());

		if (this.getRecursosHumanos().addMonitor(rg, nome, salario)) {
			System.out.println("Monitor adicionado com sucesso");
		} else {
			System.out.println("ERRO: Monitor com RG dado ja existe");
		}
	}

	public void cadastrarCozinheiro(Scanner input) {
		String rg;
		String nome;
		float salario;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Salario: ");
		salario = Float.parseFloat(input.nextLine());

		if (this.getRecursosHumanos().addCozinheiro(rg, nome, salario)) {
			System.out.println("Cozinheiro adicionado com sucesso");
		} else {
			System.out.println("ERRO: Cozinheiro com RG dado ja existe");
		}
	}

	public void cadastrarServente(Scanner input) {
		String rg;
		String nome;
		float salario;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Salario: ");
		salario = Float.parseFloat(input.nextLine());

		if (this.getRecursosHumanos().addServente(rg, nome, salario)) {
			System.out.println("Servente adicionado com sucesso");
		} else {
			System.out.println("ERRO: Servente com RG dado ja existe");
		}
	}

	public void cadastrarMaterialDidatico(Scanner input) {

		String[] listaNomes = { "Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ",
				"Quantidade de Apagador: ", "Quantidade de Pincel: " };
		int[] listaQtd = new int[5];
		for (int i = 0; i < listaQtd.length; i++) {
			System.out.print(listaNomes[i]);
			listaQtd[i] = Integer.parseInt(input.nextLine());
		}

		if (this.getRecursosMateriais().AdicionarRecusoMaterialDidatico(listaQtd)) {
			System.out.println("Recursos adicionados com sucesso");
		} else {
			System.out.println("ERRO: Entrada invalida");
		}
	}

	public void cadastrarMaterialEscolar(Scanner input) {
		String[] listaNomes = { "Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: " };
		int[] listaQtd = new int[3];
		for (int i = 0; i < listaQtd.length; i++) {
			System.out.print(listaNomes[i]);
			listaQtd[i] = Integer.parseInt(input.nextLine());
		}

		if (this.getRecursosMateriais().AdicionarRecusoMaterialEscolar(listaQtd)) {
			System.out.println("Recursos adicionados com sucesso");
		} else {
			System.out.println("ERRO: Entrada invalida");
		}

	}

	public void cadastrarMaterialLimpeza(Scanner input) {

		String[] listaNomes = { "Quantidade de Alvejante: ", "Quantidade de Sabao em po: ",
				"Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: " };
		int[] listaQtd = new int[4];
		for (int i = 0; i < listaQtd.length; i++) {
			System.out.print(listaNomes[i]);
			listaQtd[i] = Integer.parseInt(input.nextLine());
		}

		if (this.getRecursosMateriais().AdicionarRecusoMaterialLimpeza(listaQtd)) {
			System.out.println("Recursos adicionados com sucesso");
		} else {
			System.out.println("ERRO: Entrada invalida");
		}

	}

	// ########################################################################################################
	// Funções Atualizar

	public void atualizarProfessor(Scanner input) {
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

		if (this.getRecursosHumanos().alteraProfessor(rg, nome, graduacao, salario)) {
			System.out.println("Professor alterado com sucesso");
		} else {
			System.out.println("ERRO: Professor com RG dado nao existe");
		}
	}

	public void atualizarAluno(Scanner input) {
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

		if (this.getRecursosHumanos().alteraAluno(rg, nome, ra, curso)) {
			System.out.println("Aluno alterado com sucesso");
		} else {
			System.out.println("ERRO: Aluno com RG dado nao existe");
		}
	}

	public void atualizarInstrutor(Scanner input) {
		String rg;
		String nome;
		String curso;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Curso: ");
		curso = input.nextLine();

		if (this.getRecursosHumanos().alteraInstrutor(rg, nome, curso)) {
			System.out.println("Instrutor alterado com sucesso");
		} else {
			System.out.println("ERRO: Instrutor com RG dado nao existe");
		}
	}

	public void atualizarMonitor(Scanner input) {
		String rg;
		String nome;
		float salario;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Salario: ");
		salario = Float.parseFloat(input.nextLine());

		if (this.getRecursosHumanos().alteraMonitor(rg, nome, salario)) {
			System.out.println("Monitor alterado com sucesso");
		} else {
			System.out.println("ERRO: Monitor com RG dado nao existe");
		}
	}

	public void atualizarCozinheiro(Scanner input) {
		String rg;
		String nome;
		float salario;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Salario: ");
		salario = Float.parseFloat(input.nextLine());

		if (this.getRecursosHumanos().alteraCozinheiro(rg, nome, salario)) {
			System.out.println("Cozinheiro alterado com sucesso");
		} else {
			System.out.println("ERRO: Cozinheiro com RG dado nao existe");
		}
	}

	public void atualizarServente(Scanner input) {
		String rg;
		String nome;
		float salario;

		System.out.print("RG: ");
		rg = input.nextLine();
		System.out.print("Nome: ");
		nome = input.nextLine();
		System.out.print("Salario: ");
		salario = Float.parseFloat(input.nextLine());

		if (this.getRecursosHumanos().alteraServente(rg, nome, salario)) {
			System.out.println("Servente alterado com sucesso");
		} else {
			System.out.println("ERRO: Servente com RG dado nao existe");
		}
	}

	public void atualizarMaterialDidatico(Scanner input) {

		String[] listaNomes = { "Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ",
				"Quantidade de Apagador: ", "Quantidade de Pincel: " };
		int[] listaAux = new int[5];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.print(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		if (this.getRecursosMateriais().AtualizarRecusoMaterialDidatico(listaAux)) {
			System.out.println("Recursos alterados com sucesso");
		} else {
			System.out.println("ERRO: Entrada invalida");
		}
	}

	public void atualizarMaterialEscolar(Scanner input) {

		String[] listaNomes = { "Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: " };
		int[] listaAux = new int[3];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.println(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		if (this.getRecursosMateriais().AtualizarRecusoMaterialEscolar(listaAux)) {
			System.out.println("Recursos alterados com sucesso");
		} else {
			System.out.println("ERRO: Entrada invalida");
		}

	}

	public void atualizarMaterialLimpeza(Scanner input) {
		String[] listaNomes = { "Quantidade de Alvejante: ", "Quantidade de Sabao em po: ",
				"Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: " };
		int[] listaAux = new int[4];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.println(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		if (this.getRecursosMateriais().AtualizarRecusoMaterialLimpeza(listaAux)) {
			System.out.println("Recursos alterados com sucesso");
		} else {
			System.out.println("ERRO: Entrada invalida");
		}

	}

	// ########################################################################################################
	// Funções Buscar

	public void buscarProfessor(Scanner input) {
		String rg;

		System.out.print("Insira o RG: ");
		rg = input.nextLine();

		if (this.getRecursosHumanos().buscaProfessor(rg)) {
			System.out.println(this.getRecursosHumanos().getProfessor(rg).toString());
		} else {
			System.out.println("Professor nao encontrado");
		}
	}

	public void buscarAluno(Scanner input) {
		String rg;

		System.out.print("Insira o RG: ");
		rg = input.nextLine();

		if (this.getRecursosHumanos().buscaAluno(rg)) {
			System.out.println(this.getRecursosHumanos().getAluno(rg).toString());
		} else {
			System.out.println("Aluno nao encontrado");
		}
	}

	public void buscarInstrutor(Scanner input) {
		String rg;

		System.out.print("Insira o RG: ");
		rg = input.nextLine();

		if (this.getRecursosHumanos().buscaInstrutor(rg)) {
			System.out.println(this.getRecursosHumanos().getInstrutor(rg).toString());
		} else {
			System.out.println("Instrutor nao encontrado");
		}
	}

	public void buscarMonitor(Scanner input) {
		String rg;

		System.out.print("Insira o RG: ");
		rg = input.nextLine();

		if (this.getRecursosHumanos().buscaMonitor(rg)) {
			System.out.println(this.getRecursosHumanos().getMonitor(rg).toString());
		} else {
			System.out.println("Monitor nao encontrado");
		}
	}

	public void buscarCozinheiro(Scanner input) {
		String rg;

		System.out.print("Insira o RG: ");
		rg = input.nextLine();

		if (this.getRecursosHumanos().buscaCozinheiro(rg)) {
			System.out.println(this.getRecursosHumanos().getCozinheiro(rg).toString());
		} else {
			System.out.println("Cozinheiro nao encontrado");
		}
	}

	public void buscarServente(Scanner input) {
		String rg;

		System.out.print("Insira o RG: ");
		rg = input.nextLine();

		if (this.getRecursosHumanos().buscaServente(rg)) {
			System.out.println(this.getRecursosHumanos().getServente(rg).toString());
		} else {
			System.out.println("Servente nao encontrado");
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

	public void removerProfessor(Scanner input) {
		String rg;

		System.out.print("Insira o RG:");
		rg = input.nextLine();

		if (this.getRecursosHumanos().removeProfessor(rg)) {
			System.out.println("Professor removido com sucesso");
		} else {
			System.out.println("ERRO: Professor com RG dado nao existe");
		}
	}

	public void removerAluno(Scanner input) {
		String rg;

		System.out.print("Insira o RG:");
		rg = input.nextLine();

		if (this.getRecursosHumanos().removeAluno(rg)) {
			System.out.println("Aluno removido com sucesso");
		} else {
			System.out.println("ERRO: Aluno com RG dado nao existe");
		}
	}

	public void removerInstrutor(Scanner input) {
		String rg;

		System.out.print("Insira o RG:");
		rg = input.nextLine();

		if (this.getRecursosHumanos().removeInstrutor(rg)) {
			System.out.println("Instrutor removido com sucesso");
		} else {
			System.out.println("ERRO: Instrutor com RG dado nao existe");
		}
	}

	public void removerMonitor(Scanner input) {
		String rg;

		System.out.print("Insira o RG:");
		rg = input.nextLine();

		if (this.getRecursosHumanos().removeMonitor(rg)) {
			System.out.println("Monitor removido com sucesso");
		} else {
			System.out.println("ERRO: Monitor com RG dado nao existe");
		}
	}

	public void removerCozinheiro(Scanner input) {
		String rg;

		System.out.print("Insira o RG:");
		rg = input.nextLine();

		if (this.getRecursosHumanos().removeCozinheiro(rg)) {
			System.out.println("Cozinheiro removido com sucesso");
		} else {
			System.out.println("ERRO: Cozinheiro com RG dado nao existe");
		}
	}

	public void removerServente(Scanner input) {
		String rg;

		System.out.print("Insira o RG:");
		rg = input.nextLine();

		if (this.getRecursosHumanos().removeServente(rg)) {
			System.out.println("Servente removido com sucesso");
		} else {
			System.out.println("ERRO: Servente com RG dado nao existe");
		}
	}

	public void removerMaterialDidatico(Scanner input) {
		String[] listaNomes = { "Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ",
				"Quantidade de Apagador: ", "Quantidade de Pincel: " };
		int[] listaAux = new int[5];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.print(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		if (this.getRecursosMateriais().RemoverRecusoMaterialDidatico(listaAux)) {
			System.out.println("Recursos removidos com sucesso");
		} else {
			System.out.println("ERRO: Recursos insuficientes ou entrada invalida");
		}
	}

	public void removerMaterialEscolar(Scanner input) {

		String[] listaNomes = { "Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: " };
		int[] listaAux = new int[3];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.print(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		if (this.getRecursosMateriais().RemoverRecusoMaterialEscolar(listaAux)) {
			System.out.println("Recursos removidos com sucesso");
		} else {
			System.out.println("ERRO: Recursos insuficientes ou entrada invalida");
		}

	}

	public void removerMaterialLimpeza(Scanner input) {

		String[] listaNomes = { "Quantidade de Alvejante: ", "Quantidade de Sabao em po: ",
				"Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: " };
		int[] listaAux = new int[4];
		for (int i = 0; i < listaAux.length; i++) {
			System.out.print(listaNomes[i]);
			listaAux[i] = Integer.parseInt(input.nextLine());
		}

		if (this.getRecursosMateriais().RemoverRecusoMaterialLimpeza(listaAux)) {
			System.out.println("Recursos removidos com sucesso");
		} else {
			System.out.println("ERRO: Recursos insuficientes ou entrada invalida");
		}

	}

	// ########################################################################################################
	// Funções Requisicao

	public void requisicaoMatDidatico(String tipoRH, Scanner input) {
		String[] listaMateriais = { "Livro", "Quadro", "Giz", "Apagador", "Pincel" };
		int[] listaQtd = new int[listaMateriais.length];

		System.out.print("RG da pessoa a receber a requisicao: ");
		String rg = input.nextLine();

		switch (tipoRH) {
		case "professor":
			if (this.getRecursosHumanos().getProfessores().get(rg) != null) {
				for (int i = 0; i < listaMateriais.length; i++) {
					System.out.print("Quantidade de " + listaMateriais[i] + ": ");
					listaQtd[i] = Integer.parseInt(input.nextLine());
				}

				if (this.recursosMateriais.getMateriaisDidaticos().isSuficiente(listaQtd)) {
					this.getRecursosHumanos().getProfessores().get(rg).getMatDidatico().addGeral(listaQtd);
					this.getRecursosMateriais().getMateriaisDidaticos().remGeral(listaQtd);
				} else {
					System.out.println("ERRO: Quantidade de materiais em estoque e insuficiente");
					System.out.println("A requisicao nao foi processada");
				}
			} else {
				System.out.println("ERRO: Professor nao encontrado");
			}
			break;

		case "instrutor":
			if (this.getRecursosHumanos().getInstrutores().get(rg) != null) {
				for (int i = 0; i < listaMateriais.length; i++) {
					System.out.print("Quantidade de " + listaMateriais[i] + ": ");
					listaQtd[i] = Integer.parseInt(input.nextLine());
				}

				if (this.recursosMateriais.getMateriaisDidaticos().isSuficiente(listaQtd)) {
					this.getRecursosHumanos().getInstrutores().get(rg).getMatDidadico().addGeral(listaQtd);
					this.getRecursosMateriais().getMateriaisDidaticos().remGeral(listaQtd);
				} else {
					System.out.println("ERRO: Quantidade de materiais em estoque e insuficiente");
					System.out.println("A requisicao nao foi processada");
				}
			} else {
				System.out.println("ERRO: Instrutor nao encontrado");
			}
			break;

		case "monitor":
			if (this.getRecursosHumanos().getMonitores().get(rg) != null) {
				for (int i = 0; i < listaMateriais.length; i++) {
					System.out.print("Quantidade de " + listaMateriais[i] + ": ");
					listaQtd[i] = Integer.parseInt(input.nextLine());
				}

				if (this.recursosMateriais.getMateriaisDidaticos().isSuficiente(listaQtd)) {
					this.getRecursosHumanos().getMonitores().get(rg).getMatDidadico().addGeral(listaQtd);
					this.getRecursosMateriais().getMateriaisDidaticos().remGeral(listaQtd);
				} else {
					System.out.println("ERRO: Quantidade de materiais em estoque e insuficiente");
					System.out.println("A requisicao nao foi processada");
				}
			} else {
				System.out.println("ERRO: Monitor nao encontrado");
			}
			break;
		}
	}

	public void requisicaoMatEscolar(String tipoRH, Scanner input) {
		String[] listaMateriais = { "Lapis", "Caderno", "Caneta" };
		int[] listaQtd = new int[listaMateriais.length];

		System.out.print("RG da pessoa a receber a requisicao: ");
		String rg = input.nextLine();

		switch (tipoRH) {
		case "aluno":
			if (this.getRecursosHumanos().getAlunos().get(rg) != null) {
				for (int i = 0; i < listaMateriais.length; i++) {
					System.out.print("Quantidade de " + listaMateriais[i] + ": ");
					listaQtd[i] = Integer.parseInt(input.nextLine());
				}

				if (this.recursosMateriais.getMateriaisEscolares().isSuficiente(listaQtd)) {
					this.getRecursosHumanos().getAlunos().get(rg).getMatEscolar().addGeral(listaQtd);
					this.getRecursosMateriais().getMateriaisEscolares().remGeral(listaQtd);
				} else {
					System.out.println("ERRO: Quantidade de materiais em estoque e insuficiente");
					System.out.println("A requisicao nao foi processada");
				}
			} else {
				System.out.println("ERRO: Aluno nao encontrado");
			}
			break;

		}
	}

	public void requisicaoMatLimpeza(String tipoRH, Scanner input) {
		String[] listaMateriais = { "Alvejante", "Sabao em Po", "Agua Sanitaria", "Sabao em Barra" };
		int[] listaQtd = new int[listaMateriais.length];

		System.out.print("RG da pessoa a receber a requisicao: ");
		String rg = input.nextLine();

		switch (tipoRH) {
		case "servente":
			if (this.getRecursosHumanos().getServentes().get(rg) != null) {
				for (int i = 0; i < listaMateriais.length; i++) {
					System.out.print("Quantidade de " + listaMateriais[i] + ": ");
					listaQtd[i] = Integer.parseInt(input.nextLine());
				}

				if (this.recursosMateriais.getMateriaisLimpeza().isSuficiente(listaQtd)) {
					this.getRecursosHumanos().getServentes().get(rg).getMatLimpeza().addGeral(listaQtd);
					this.getRecursosMateriais().getMateriaisLimpeza().remGeral(listaQtd);
				} else {
					System.out.println("ERRO: Quantidade de materiais em estoque e insuficiente");
					System.out.println("A requisicao nao foi processada");
				}
			} else {
				System.out.println("ERRO: Servente nao encontrado");
			}
			break;
		case "cozinheiro":
			if (this.getRecursosHumanos().getCozinheiros().get(rg) != null) {
				for (int i = 0; i < listaMateriais.length; i++) {
					System.out.print("Quantidade de " + listaMateriais[i] + ": ");
					listaQtd[i] = Integer.parseInt(input.nextLine());
				}

				if (this.recursosMateriais.getMateriaisLimpeza().isSuficiente(listaQtd)) {
					this.getRecursosHumanos().getCozinheiros().get(rg).getMatLimpeza().addGeral(listaQtd);
					this.getRecursosMateriais().getMateriaisLimpeza().remGeral(listaQtd);
				} else {
					System.out.println("ERRO: Quantidade de materiais em estoque e insuficiente");
					System.out.println("A requisicao nao foi processada");
				}
			} else {
				System.out.println("ERRO: Cozinheiro nao encontrado");
			}
			break;

		}
	}

	// ########################################################################################################
	// Funções Relatorio

	public void relatorioRH() {
		System.out.println("\n######################################");
		this.recursosHumanos.printRH();
	}

	public void relatorioRM() {
		System.out.println("\n######################################");
		this.recursosMateriais.printRM();
	}

	public void relatorioGeral() {
		this.relatorioRH();
		this.relatorioRM();
	}
}
