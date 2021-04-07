package Controle;

import Entidades.RecursoMaterial.*;
import java.util.Scanner;

public class RecursosMateriais {

	private MateriaisDidaticos materiaisDidaticos;

	private MateriaisLimpeza materiaisLimpeza;

	private MateriaisEscolares materiaisEscolares;

	

	public RecursosMateriais() {
		this.materiaisDidaticos = new MateriaisDidaticos();
		this.materiaisLimpeza = new MateriaisLimpeza();
		this.materiaisEscolares = new MateriaisEscolares();
	}

	public int AdicionarRecusoMaterialDidatico(int livro,int giz,int apagador, int pincel){
		
		this.materiaisDidaticos.setLivro(livro);
		this.materiaisDidaticos.setGiz(giz);
		this.materiaisDidaticos.setApagador(apagador);
		this.materiaisDidaticos.setPincel(pincel);

		return 1 ;
	}

	public int AdicionarRecusoMaterialLimpeza(int alvejante,int sabaoPo,int aguaSanitaria, int sabaoBarra){
		
		this.materiaisLimpeza.setAlvejante(alvejante);
		this.materiaisLimpeza.setSabaoPo(sabaoPo);
		this.materiaisLimpeza.setAguaSanitaria(aguaSanitaria);
		this.materiaisLimpeza.setSabaoBarra(sabaoBarra);
		
		return 1 ;
	}
	public int AdicionarRecusoMaterialEscolar(int lapis,int caderno,int caneta){
		
		this.materiaisEscolares.setLapis(lapis);
		this.materiaisEscolares.setCaderno(caderno);
		this.materiaisEscolares.setCaneta(caneta);
		

		return 1 ;
	}



}
 