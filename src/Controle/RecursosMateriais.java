package Controle;

import Entidades.RecursoMaterial.*;

public class RecursosMateriais {

	private MateriaisDidaticos materiaisDidaticos;
	private MateriaisLimpeza materiaisLimpeza;
	private MateriaisEscolares materiaisEscolares;

	public RecursosMateriais() {
		this.materiaisDidaticos = new MateriaisDidaticos();
		this.materiaisLimpeza = new MateriaisLimpeza();
		this.materiaisEscolares = new MateriaisEscolares();
	}

	protected MateriaisDidaticos getMateriaisDidaticos() {
		return this.materiaisDidaticos;
	}

	protected MateriaisLimpeza getMateriaisLimpeza() {
		return this.materiaisLimpeza;
	}

	protected MateriaisEscolares getMateriaisEscolares() {
		return this.materiaisEscolares;
	}

	// Operacoes Material Didatico

	protected boolean AdicionarRecusoMaterialDidatico(int livro, int quadro, int giz, int apagador, int pincel) {
		if (livro >= 0 && quadro >= 0 && giz >= 0 && apagador >= 0 && pincel >= 0) {
			this.materiaisDidaticos.addGeral(livro, quadro, giz, apagador, pincel);
			return true;
		} else
			return false;
	}

	protected boolean AdicionarRecusoMaterialDidatico(int[] listaQtd) {
		return AdicionarRecusoMaterialDidatico(listaQtd[0], listaQtd[1], listaQtd[2], listaQtd[3], listaQtd[4]);
	}

	protected boolean AtualizarRecusoMaterialDidatico(int livro, int quadro, int giz, int apagador, int pincel) {
		if (livro >= 0 && giz >= 0 && apagador >= 0 && pincel >= 0) {
			this.materiaisDidaticos.setLivro(livro);
			this.materiaisDidaticos.setQuadro(quadro);
			this.materiaisDidaticos.setGiz(giz);
			this.materiaisDidaticos.setApagador(apagador);
			this.materiaisDidaticos.setPincel(pincel);
			return true;
		} else
			return false;
	}

	protected boolean AtualizarRecusoMaterialDidatico(int[] listaQtd) {
		return AtualizarRecusoMaterialDidatico(listaQtd[0], listaQtd[1], listaQtd[2], listaQtd[3], listaQtd[4]);
	}

	protected boolean RemoverRecusoMaterialDidatico(int livro, int quadro, int giz, int apagador, int pincel) {
		if (livro >= 0 && quadro >= 0 && giz >= 0 && apagador >= 0 && pincel >= 0) {
			return this.materiaisDidaticos.remGeral(livro, quadro, giz, apagador, pincel);
		} else {
			return false;
		}
	}

	protected boolean RemoverRecusoMaterialDidatico(int[] listaQtd) {
		return RemoverRecusoMaterialDidatico(listaQtd[0], listaQtd[1], listaQtd[2], listaQtd[3], listaQtd[4]);
	}

	// Operacoes Material Limpeza

	protected boolean AdicionarRecusoMaterialLimpeza(int alvejante, int sabaoPo, int aguaSanitaria, int sabaoBarra) {
		if (alvejante >= 0 && sabaoPo >= 0 && aguaSanitaria >= 0 && sabaoBarra >= 0) {
			this.materiaisLimpeza.addGeral(alvejante, sabaoPo, aguaSanitaria, sabaoBarra);
			return true;
		} else
			return false;
	}

	protected boolean AdicionarRecusoMaterialLimpeza(int[] listaQtd) {
		return AdicionarRecusoMaterialLimpeza(listaQtd[0], listaQtd[1], listaQtd[2], listaQtd[3]);
	}

	protected boolean AtualizarRecusoMaterialLimpeza(int alvejante, int sabaoPo, int aguaSanitaria, int sabaoBarra) {
		if (alvejante >= 0 && sabaoPo >= 0 && aguaSanitaria >= 0 && sabaoBarra >= 0) {
			this.materiaisLimpeza.setAlvejante(alvejante);
			this.materiaisLimpeza.setSabaoPo(sabaoPo);
			this.materiaisLimpeza.setAguaSanitaria(aguaSanitaria);
			this.materiaisLimpeza.setSabaoBarra(sabaoBarra);
			return true;
		} else
			return false;
	}

	protected boolean AtualizarRecusoMaterialLimpeza(int[] listaQtd) {
		return AtualizarRecusoMaterialLimpeza(listaQtd[0], listaQtd[1], listaQtd[2], listaQtd[3]);
	}

	protected boolean RemoverRecusoMaterialLimpeza(int alvejante, int sabaoPo, int aguaSanitaria, int sabaoBarra) {
		if (alvejante >= 0 && sabaoPo >= 0 && aguaSanitaria >= 0 && sabaoBarra >= 0) {
			return this.materiaisLimpeza.remGeral(alvejante, sabaoPo, aguaSanitaria, sabaoBarra);
		} else {
			return false;
		}
	}

	protected boolean RemoverRecusoMaterialLimpeza(int[] listaQtd) {
		return RemoverRecusoMaterialLimpeza(listaQtd[0], listaQtd[1], listaQtd[2], listaQtd[3]);
	}

	// Operacoes Material Escolar

	protected boolean AdicionarRecusoMaterialEscolar(int lapis, int caderno, int caneta) {
		if (lapis >= 0 && caderno >= 0 && caneta >= 0) {
			this.materiaisEscolares.addGeral(lapis, caderno, caneta);
			return true;
		} else
			return false;
	}

	protected boolean AdicionarRecusoMaterialEscolar(int[] listaQtd) {
		return this.AdicionarRecusoMaterialEscolar(listaQtd[0], listaQtd[1], listaQtd[2]);
	}

	protected boolean AtualizarRecusoMaterialEscolar(int lapis, int caderno, int caneta) {
		if (lapis >= 0 && caderno >= 0 && caneta >= 0) {
			this.materiaisEscolares.setLapis(lapis);
			this.materiaisEscolares.setCaderno(caderno);
			this.materiaisEscolares.setCaneta(caneta);
			return true;
		} else
			return false;
	}

	protected boolean AtualizarRecusoMaterialEscolar(int[] listaQtd) {
		return this.AtualizarRecusoMaterialEscolar(listaQtd[0], listaQtd[1], listaQtd[2]);
	}

	protected boolean RemoverRecusoMaterialEscolar(int lapis, int caderno, int caneta) {
		if (lapis >= 0 && caderno >= 0 && caneta >= 0) {
			return this.materiaisEscolares.remGeral(lapis, caderno, caneta);
		} else {
			return false;
		}
	}

	protected boolean RemoverRecusoMaterialEscolar(int[] listaQtd) {
		return this.RemoverRecusoMaterialEscolar(listaQtd[0], listaQtd[1], listaQtd[2]);
	}

	// Relatorios

	protected void printMatDidatico() {
		System.out.println("Materiais Didaticos:");
		System.out.println(this.materiaisDidaticos.toString());
	}

	protected void printMatEscolar() {
		System.out.println("Materiais Escolares:");
		System.out.println(this.materiaisEscolares.toString());
	}

	protected void printMatLimpeza() {
		System.out.println("Materiais de Limpeza:");
		System.out.println(this.materiaisLimpeza.toString());
	}

	protected void printRM() {
		System.out.println("Recursos Materiais\n");
		printMatDidatico();
		printMatEscolar();
		printMatLimpeza();
	}

}
