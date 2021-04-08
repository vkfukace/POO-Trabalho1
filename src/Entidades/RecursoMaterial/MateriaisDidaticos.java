package Entidades.RecursoMaterial;

public class MateriaisDidaticos {
    private int livro;
    private int quadro;
    private int giz;
    private int apagador;
    private int pincel;

    public MateriaisDidaticos() {
        this.livro = 0;
        this.quadro = 0;
        this.giz = 0;
        this.apagador = 0;
        this.pincel = 0;
    }

    public int getLivro() {
        return this.livro;
    }
    public void setLivro(int livro) {
        this.livro = livro;
    }
    public void addLivro(int livro) {
        this.livro += livro;
    }
    public void remLivro(int livro) {
        this.livro -= livro;
        if(this.getLivro()<0) this.livro = 0 ;
    }

    public int getQuadro() {
        return this.quadro;
    }
    public void setQuadro(int quadro) {
        this.quadro = quadro;
    }
    public void addQuadro(int quadro) {
        this.quadro += quadro;
    }
    public void remQuadro(int quadro) {
        this.quadro -= quadro;
        if(this.getQuadro()<0) this.quadro = 0 ;
    }

    public int getGiz() {
        return this.giz;
    }
    public void setGiz(int giz) {
        this.giz = giz;
    }
    public void addGiz(int giz) {
        this.giz += giz;
    }
    public void remGiz(int giz) {
        this.giz -= giz;
        if(this.getGiz()<0) this.giz = 0 ;
    }

    public int getApagador() {
        return this.apagador;
    }
    public void setApagador(int apagador) {
        this.apagador = apagador;
    }
    public void addApagador(int apagador) {
        this.apagador += apagador;
    }
    public void remApagador(int apagador) {
        this.apagador -= apagador;
        if(this.getApagador()<0) this.apagador = 0 ;
    }
    
    public int getPincel() {
        return this.pincel;
    }
    public void setPincel(int pincel) {
        this.pincel = pincel;
    }
    public void addPincel(int pincel) {
        this.pincel += pincel;
    }
    public void remPincel(int pincel) {
        this.pincel -= pincel;
        if(this.getPincel()<0) this.pincel = 0 ;
    }

    @Override
    public String toString() {
        return "{" + " Livro='" + getLivro() + "'" + ", Quadro='" + getQuadro() + "'" + ", Giz='" + getGiz() + "'"
                + ", Apagador='" + getApagador() + "'" + ", Pincel='" + getPincel() + "'" + "}";
    }

}
