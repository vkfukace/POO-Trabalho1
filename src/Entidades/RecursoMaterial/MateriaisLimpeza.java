package Entidades.RecursoMaterial;

public class MateriaisLimpeza {
    private int alvejante;
    private int sabaoPo;
    private int aguaSanitaria;
    private int sabaoBarra;

    public MateriaisLimpeza() {
        this.alvejante = 0;
        this.sabaoPo = 0;
        this.aguaSanitaria = 0;
        this.sabaoBarra = 0;
    }

    // Getters, Setters, Adicionar e Remover

    public int getAlvejante() {
        return this.alvejante;
    }

    public void setAlvejante(int alvejante) {
        this.alvejante = alvejante;
    }

    public void addAlvejante(int alvejante) {
        this.alvejante += alvejante;
    }

    public boolean remAlvejante(int alvejante) {
        if (this.getAlvejante() - alvejante >= 0) {
            this.alvejante -= alvejante;
            return true;
        } else
            return false;
    }

    public int getSabaoPo() {
        return this.sabaoPo;
    }

    public void setSabaoPo(int sabaoPo) {
        this.sabaoPo = sabaoPo;
    }

    public void addSabaoPo(int sabaoPo) {
        this.sabaoPo += sabaoPo;
    }

    public boolean remSabaoPo(int sabaoPo) {
        if (this.getSabaoPo() - sabaoPo >= 0) {
            this.sabaoPo -= sabaoPo;
            return true;
        } else
            return false;
    }

    public int getAguaSanitaria() {
        return this.aguaSanitaria;
    }

    public void setAguaSanitaria(int aguaSanitaria) {
        this.aguaSanitaria = aguaSanitaria;
    }

    public void addAguaSanitaria(int aguaSanitaria) {
        this.aguaSanitaria += aguaSanitaria;
    }

    public boolean remAguaSanitaria(int aguaSanitaria) {
        if (this.getAguaSanitaria() - aguaSanitaria >= 0) {
            this.aguaSanitaria -= aguaSanitaria;
            return true;
        } else
            return false;
    }

    public int getSabaoBarra() {
        return this.sabaoBarra;
    }

    public void setSabaoBarra(int sabaoBarra) {
        this.sabaoBarra = sabaoBarra;
    }

    public void addSabaoBarra(int sabaoBarra) {
        this.sabaoBarra += sabaoBarra;
    }

    public boolean remSabaoBarra(int sabaoBarra) {
        if (this.getSabaoBarra() - sabaoBarra >= 0) {
            this.sabaoBarra -= sabaoBarra;
            return true;
        } else
            return false;
    }

    // Outras funcoes
    public boolean remGeral(int alvejante, int sabaoPo, int aguaSanitaria, int sabaoBarra) {
        boolean c1, c2, c3, c4;
        c1 = this.remAlvejante(alvejante);
        c2 = this.remSabaoPo(sabaoPo);
        c3 = this.remAguaSanitaria(aguaSanitaria);
        c4 = this.remSabaoBarra(sabaoBarra);
        if (c1 && c2 && c3 && c4)
            return true;
        else
            return false;
    }

    public void remGeral(int[] listaQtd) {
        this.remGeral(listaQtd[0], listaQtd[1], listaQtd[2], listaQtd[3]);
    }

    public void addGeral(int alvejante, int sabaoPo, int aguaSanitaria, int sabaoBarra) {
        this.addAlvejante(alvejante);
        this.addSabaoPo(sabaoPo);
        this.addAguaSanitaria(aguaSanitaria);
        this.addSabaoBarra(sabaoBarra);
    }

    public void addGeral(int[] listaQtd) {
        this.addGeral(listaQtd[0], listaQtd[1], listaQtd[2], listaQtd[3]);
    }

    public boolean isSuficiente(int alvejante, int sabaoPo, int aguaSanitaria, int sabaoBarra) {
        if (alvejante > this.alvejante || sabaoPo > this.sabaoPo || aguaSanitaria > this.aguaSanitaria
                || sabaoBarra > this.sabaoBarra) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isSuficiente(int[] listaQtd) {
        return this.isSuficiente(listaQtd[0], listaQtd[1], listaQtd[2], listaQtd[3]);
    }

    @Override
    public String toString() {
        return "{" + " Alvejante='" + getAlvejante() + "'" + ", Sabao em Po='" + getSabaoPo() + "'"
                + ", Agua Sanitaria='" + getAguaSanitaria() + "'" + ", Sabao em Barra='" + getSabaoBarra() + "'" + "}";
    }

}
