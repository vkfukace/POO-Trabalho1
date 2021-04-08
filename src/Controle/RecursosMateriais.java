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

	public MateriaisDidaticos getMateriaisDidaticos() {
		return this.materiaisDidaticos;
	}

	public MateriaisLimpeza getMateriaisLimpeza() {
		return this.materiaisLimpeza;
	}

	public MateriaisEscolares getMateriaisEscolares() {
		return this.materiaisEscolares;
	}

	public boolean AdicionarRecusoMaterialDidatico(int livro,int giz,int apagador, int pincel){
		if(livro >= 0 && giz >=0 && apagador>=0 && pincel>=0){
			this.materiaisDidaticos.addLivro(livro);
			this.materiaisDidaticos.addGiz(giz);
			this.materiaisDidaticos.addApagador(apagador);
			this.materiaisDidaticos.addPincel(pincel);
			return true ;
		}else return false ;

	}
	public boolean AtualizarRecusoMaterialDidatico(int livro,int giz,int apagador, int pincel){
		if(livro >= 0 && giz >=0 && apagador>=0 && pincel>=0){
			this.materiaisDidaticos.setLivro(livro);
			this.materiaisDidaticos.setGiz(giz);
			this.materiaisDidaticos.setApagador(apagador);
			this.materiaisDidaticos.setPincel(pincel);
			return true ;
		}
		else return false ;
	}
	public boolean RemoverRecusoMaterialDidatico(int livro,int giz,int apagador, int pincel){
		if(materiaisDidaticos.getLivro() == 0 && materiaisDidaticos.getGiz() == 0 && materiaisDidaticos.getApagador()==0 && materiaisDidaticos.getPincel()==0){
			return false;
		}else{
			this.materiaisDidaticos.remLivro(livro);
			this.materiaisDidaticos.remGiz(giz);
			this.materiaisDidaticos.remApagador(apagador);
			this.materiaisDidaticos.remPincel(pincel);
			return true ;
		}
		
		
	}

	public boolean AdicionarRecusoMaterialLimpeza(int alvejante,int sabaoPo,int aguaSanitaria, int sabaoBarra){
		if(alvejante >= 0 && sabaoPo >=0 && aguaSanitaria>=0 && sabaoBarra>=0){
			this.materiaisLimpeza.addAlvejante(alvejante);
			this.materiaisLimpeza.addSabaoPo(sabaoPo);
			this.materiaisLimpeza.addAguaSanitaria(aguaSanitaria);
			this.materiaisLimpeza.addSabaoBarra(sabaoBarra);
			return true ;
		}
		else return false;
	}
	public boolean AtualizarRecusoMaterialLimpeza(int alvejante,int sabaoPo,int aguaSanitaria, int sabaoBarra){
		if(alvejante >= 0 && sabaoPo >=0 && aguaSanitaria>=0 && sabaoBarra>=0){
			this.materiaisLimpeza.setAlvejante(alvejante);
			this.materiaisLimpeza.setSabaoPo(sabaoPo);
			this.materiaisLimpeza.setAguaSanitaria(aguaSanitaria);
			this.materiaisLimpeza.setSabaoBarra(sabaoBarra);
			return true ;
		}
		else return false ;
	}
	public boolean RemoverRecusoMaterialLimpeza(int alvejante,int sabaoPo,int aguaSanitaria, int sabaoBarra){
		if(materiaisLimpeza.getAlvejante() == 0 && materiaisLimpeza.getSabaoPo() == 0 && materiaisLimpeza.getAguaSanitaria()==0 && materiaisLimpeza.getSabaoBarra()==0){
			return false ;
		}else{
			this.materiaisLimpeza.remAlvejante(alvejante);
			this.materiaisLimpeza.remSabaoPo(sabaoPo);
			this.materiaisLimpeza.remAguaSanitaria(aguaSanitaria);
			this.materiaisLimpeza.remSabaoBarra(sabaoBarra);
			return true ;
		}
		
		
	}

	public boolean AdicionarRecusoMaterialEscolar(int lapis,int caderno,int caneta){
		if(lapis >= 0 && caderno >=0 && caneta>=0){
			this.materiaisEscolares.addLapis(lapis);
			this.materiaisEscolares.addCaderno(caderno);
			this.materiaisEscolares.addCaneta(caneta);
			return true;
		}
		else return false ;
	}
	public boolean AtualizarRecusoMaterialEscolar(int lapis,int caderno,int caneta){
		if(lapis >= 0 && caderno >=0 && caneta>=0){
			this.materiaisEscolares.setLapis(lapis);
			this.materiaisEscolares.setCaderno(caderno);
			this.materiaisEscolares.setCaneta(caneta);
			return true ;
		}
		else return false ;
	}
	public boolean RemoverRecusoMaterialEscolar(int lapis,int caderno,int caneta){
		if(materiaisEscolares.getLapis() == 0 && materiaisEscolares.getCaderno() == 0 && materiaisEscolares.getCaneta()==0){
			return false ;
		}else{
			this.materiaisEscolares.remLapis(lapis);
			this.materiaisEscolares.remCaderno(caderno);
			this.materiaisEscolares.remCaneta(caneta);
			return true ;
		}
		
		
	}


}
 