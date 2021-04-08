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

    public int getAlvejante() {
        return this.alvejante;
    }
    public void setAlvejante(int alvejante) {
        this.alvejante = alvejante;
    }
    public void addAlvejante(int alvejante) {
        this.alvejante += alvejante;
    }
    public void remAlvejante(int alvejante) {
        if(this.getAlvejante() - alvejante >= 0) this.alvejante -= alvejante;
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
    public void remSabaoPo(int sabaoPo) {
        if(this.getSabaoPo() - sabaoPo >= 0) this.sabaoPo -= sabaoPo;
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
    public void remAguaSanitaria(int aguaSanitaria) {
        if(this.getAguaSanitaria() - aguaSanitaria >= 0) this.aguaSanitaria -= aguaSanitaria;
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
    public void remSabaoBarra(int sabaoBarra) {
        if(this.getSabaoBarra() - sabaoBarra >= 0) this.sabaoBarra -= sabaoBarra;
    }


    @Override
    public String toString() {
        return "{" + " Alvejante='" + getAlvejante() + "'" + ", Sabao em Po='" + getSabaoPo() + "'"
                + ", Agua Sanitaria='" + getAguaSanitaria() + "'" + ", Sabao em Barra='" + getSabaoBarra() + "'" + "}";
    }

}
