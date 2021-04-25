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

    // Getters, Setters, Adicionar e Remover

    public int getLivro() {
        return this.livro;
    }

    public void setLivro(int livro) {
        this.livro = livro;
    }

    public void addLivro(int livro) {
        this.livro += livro;
    }

    public boolean remLivro(int livro) {
        if (this.getLivro() - livro >= 0) {
            this.livro -= livro;
            return true;
        } else
            return false;
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

    public boolean remQuadro(int quadro) {
        if (this.getQuadro() - quadro >= 0) {
            this.quadro -= quadro;
            return true;
        } else
            return false;
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

    public boolean remGiz(int giz) {
        if (this.getGiz() - giz >= 0) {
            this.giz -= giz;
            return true;
        } else
            return false;
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

    public boolean remApagador(int apagador) {
        if (this.getApagador() - apagador >= 0) {
            this.apagador -= apagador;
            return true;
        } else
            return false;
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

    public boolean remPincel(int pincel) {
        if (this.getPincel() - pincel >= 0) {
            this.pincel -= pincel;
            return true;
        } else
            return false;
    }

    // Outras funcoes

    public boolean remGeral(int livro, int quadro, int giz, int apagador, int pincel) {
        boolean c1, c2, c3, c4, c5;
        c1 = this.remLivro(livro);
        c2 = this.remQuadro(quadro);
        c3 = this.remGiz(giz);
        c4 = this.remApagador(apagador);
        c5 = this.remPincel(pincel);
        if (c1 && c2 && c3 && c4 && c5)
            return true;
        else
            return false;
    }

    public void remGeral(int[] listaQtd) {
        this.remGeral(listaQtd[0], listaQtd[1], listaQtd[2], listaQtd[3], listaQtd[4]);
    }

    public void addGeral(int livro, int quadro, int giz, int apagador, int pincel) {
        this.addLivro(livro);
        this.addQuadro(quadro);
        this.addGiz(giz);
        this.addApagador(apagador);
        this.addPincel(pincel);
    }

    public void addGeral(int[] listaQtd) {
        this.addGeral(listaQtd[0], listaQtd[1], listaQtd[2], listaQtd[3], listaQtd[4]);
    }

    public boolean isSuficiente(int livro, int quadro, int giz, int apagador, int pincel) {
        if (livro > this.livro || quadro > this.quadro || giz > this.giz || apagador > this.apagador
                || pincel > this.pincel) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isSuficiente(int[] listaQtd) {
        return this.isSuficiente(listaQtd[0], listaQtd[1], listaQtd[2], listaQtd[3], listaQtd[4]);
    }

    @Override
    public String toString() {
        return "{" + " Livro='" + getLivro() + "'" + ", Quadro='" + getQuadro() + "'" + ", Giz='" + getGiz() + "'"
                + ", Apagador='" + getApagador() + "'" + ", Pincel='" + getPincel() + "'" + "}";
    }

}
