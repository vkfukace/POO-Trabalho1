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

	public boolean AdicionarRecusoMaterialDidatico(int livro,int quadro,int giz,int apagador, int pincel){
		if(livro >= 0 && quadro>=0 && giz >=0 && apagador>=0 && pincel>=0){
			this.materiaisDidaticos.addLivro(livro);
			this.materiaisDidaticos.addQuadro(quadro);
			this.materiaisDidaticos.addGiz(giz);
			this.materiaisDidaticos.addApagador(apagador);
			this.materiaisDidaticos.addPincel(pincel);
			return true ;
		}else return false ;

	}
	public boolean AtualizarRecusoMaterialDidatico(int livro,int quadro,int giz,int apagador, int pincel){
		if(livro >= 0 && giz >=0 && apagador>=0 && pincel>=0){
			this.materiaisDidaticos.setLivro(livro);
			this.materiaisDidaticos.setQuadro(quadro);
			this.materiaisDidaticos.setGiz(giz);
			this.materiaisDidaticos.setApagador(apagador);
			this.materiaisDidaticos.setPincel(pincel);
			return true ;
		}
		else return false ;
	}
	public boolean RemoverRecusoMaterialDidatico(int livro,int quadro,int giz,int apagador, int pincel){
		boolean c1,c2,c3,c4,c5;
		if(livro <= 0 && quadro<=0 && giz <= 0 && apagador<=0 && pincel<=0){
			return false;
		}else{
			c1 = this.materiaisDidaticos.remLivro(livro);
			c2 = this.materiaisDidaticos.remQuadro(quadro);
			c3 = this.materiaisDidaticos.remGiz(giz);
			c4 = this.materiaisDidaticos.remApagador(apagador);
			c5 = this.materiaisDidaticos.remPincel(pincel);
			if(c1 && c2 && c3 && c4 && c5) return true ;
			else return false ;
			
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
		boolean c1,c2,c3,c4;
		if(alvejante <= 0 && sabaoPo <= 0 && aguaSanitaria<=0 && sabaoBarra<=0){
			return false ;
		}else{
			c1 = this.materiaisLimpeza.remAlvejante(alvejante);
			c2 = this.materiaisLimpeza.remSabaoPo(sabaoPo);
			c3 = this.materiaisLimpeza.remAguaSanitaria(aguaSanitaria);
			c4 = this.materiaisLimpeza.remSabaoBarra(sabaoBarra);
			if(c1 && c2 && c3 && c4) return true ;
			else return false ;
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
		boolean c1,c2,c3;
		if(lapis <= 0 && caderno <= 0 && caneta<=0){
			return false ;
		}else{
			c1 = this.materiaisEscolares.remLapis(lapis);
			c2 = this.materiaisEscolares.remCaderno(caderno);
			c3 = this.materiaisEscolares.remCaneta(caneta);
			if(c1 && c2 && c3) return true ;
			else return false ;
		}
		
		
	}


}
 