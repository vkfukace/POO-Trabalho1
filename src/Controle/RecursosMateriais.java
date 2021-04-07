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

	public int AdicionarRecusoMaterialDidatico(int livro,int giz,int apagador, int pincel){
		if(livro >= 0 && giz >=0 && apagador>=0 && pincel>=0){
			this.materiaisDidaticos.addLivro(livro);
			this.materiaisDidaticos.addGiz(giz);
			this.materiaisDidaticos.addApagador(apagador);
			this.materiaisDidaticos.addPincel(pincel);
			return 1 ;
		}else return 0 ;

		
	}
	public int AtualizarRecusoMaterialDidatico(int livro,int giz,int apagador, int pincel){
		
		this.materiaisDidaticos.setLivro(livro);
		this.materiaisDidaticos.setGiz(giz);
		this.materiaisDidaticos.setApagador(apagador);
		this.materiaisDidaticos.setPincel(pincel);

		return 1 ;
	}
	public int RemoverRecusoMaterialDidatico(int livro,int giz,int apagador, int pincel){
		if(materiaisDidaticos.getLivro() == 0 && materiaisDidaticos.getGiz() == 0 && materiaisDidaticos.getApagador()==0 && materiaisDidaticos.getPincel()==0){
			return 0 ;
		}else{
			this.materiaisDidaticos.remLivro(livro);
			this.materiaisDidaticos.remGiz(giz);
			this.materiaisDidaticos.remApagador(apagador);
			this.materiaisDidaticos.remPincel(pincel);
		}
		
		return 1 ;
	}

	public int AdicionarRecusoMaterialLimpeza(int alvejante,int sabaoPo,int aguaSanitaria, int sabaoBarra){
		
		this.materiaisLimpeza.addAlvejante(alvejante);
		this.materiaisLimpeza.addSabaoPo(sabaoPo);
		this.materiaisLimpeza.addAguaSanitaria(aguaSanitaria);
		this.materiaisLimpeza.addSabaoBarra(sabaoBarra);
		
		return 1 ;
	}
	public int AtualizarRecusoMaterialLimpeza(int alvejante,int sabaoPo,int aguaSanitaria, int sabaoBarra){
		
		this.materiaisLimpeza.setAlvejante(alvejante);
		this.materiaisLimpeza.setSabaoPo(sabaoPo);
		this.materiaisLimpeza.setAguaSanitaria(aguaSanitaria);
		this.materiaisLimpeza.setSabaoBarra(sabaoBarra);
		
		return 1 ;
	}
	public int RemoverRecusoMaterialLimpeza(int livro,int giz,int apagador, int pincel){
		if(materiaisDidaticos.getLivro() == 0 && materiaisDidaticos.getGiz() == 0 && materiaisDidaticos.getApagador()==0 && materiaisDidaticos.getPincel()==0){
			return 0 ;
		}else{
			this.materiaisDidaticos.remLivro(livro);
			this.materiaisDidaticos.remGiz(giz);
			this.materiaisDidaticos.remApagador(apagador);
			this.materiaisDidaticos.remPincel(pincel);
		}
		
		return 1 ;
	}

	public int AdicionarRecusoMaterialEscolar(int lapis,int caderno,int caneta){
		
		this.materiaisEscolares.addLapis(lapis);
		this.materiaisEscolares.addCaderno(caderno);
		this.materiaisEscolares.addCaneta(caneta);
	
		return 1 ;
	}
	public int AtualizarRecusoMaterialEscolar(int lapis,int caderno,int caneta){
		
		this.materiaisEscolares.setLapis(lapis);
		this.materiaisEscolares.setCaderno(caderno);
		this.materiaisEscolares.setCaneta(caneta);
	
		return 1 ;
	}
	public int RemoverRecusoMaterialEscolar(int livro,int giz,int apagador, int pincel){
		if(materiaisDidaticos.getLivro() == 0 && materiaisDidaticos.getGiz() == 0 && materiaisDidaticos.getApagador()==0 && materiaisDidaticos.getPincel()==0){
			return 0 ;
		}else{
			this.materiaisDidaticos.remLivro(livro);
			this.materiaisDidaticos.remGiz(giz);
			this.materiaisDidaticos.remApagador(apagador);
			this.materiaisDidaticos.remPincel(pincel);
		}
		
		return 1 ;
	}


}
 