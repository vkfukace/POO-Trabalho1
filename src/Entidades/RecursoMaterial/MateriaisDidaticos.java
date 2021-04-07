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
        this.livro += livro;
    }

    public int getQuadro() {
        return this.quadro;
    }

    public void setQuadro(int quadro) {
        this.quadro += quadro;
    }

    public int getGiz() {
        return this.giz;
    }

    public void setGiz(int giz) {
        this.giz += giz;
    }

    public int getApagador() {
        return this.apagador;
    }

    public void setApagador(int apagador) {
        this.apagador += apagador;
    }

    public int getPincel() {
        return this.pincel;
    }

    public void setPincel(int pincel) {
        this.pincel += pincel;
    }

    @Override
    public String toString() {
        return "{" + " Livro='" + getLivro() + "'" + ", Quadro='" + getQuadro() + "'" + ", Giz='" + getGiz() + "'"
                + ", Apagador='" + getApagador() + "'" + ", Pincel='" + getPincel() + "'" + "}";
    }

}
