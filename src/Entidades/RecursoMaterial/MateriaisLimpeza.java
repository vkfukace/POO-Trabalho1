package Entidades.RecursoMaterial;

public class MateriaisLimpeza {
    private int alvejante;
    private int sabaoPo;
    private int aguaSanitaria;
    private int sabaoBarra;

    public int getAlvejante() {
        return this.alvejante;
    }

    public void setAlvejante(int alvejante) {
        this.alvejante = alvejante;
    }

    public int getSabaoPo() {
        return this.sabaoPo;
    }

    public void setSabaoPo(int sabaoPo) {
        this.sabaoPo = sabaoPo;
    }

    public int getAguaSanitaria() {
        return this.aguaSanitaria;
    }

    public void setAguaSanitaria(int aguaSanitaria) {
        this.aguaSanitaria = aguaSanitaria;
    }

    public int getSabaoBarra() {
        return this.sabaoBarra;
    }

    public void setSabaoBarra(int sabaoBarra) {
        this.sabaoBarra = sabaoBarra;
    }

    @Override
    public String toString() {
        return "{" + " Alvejante='" + getAlvejante() + "'" + ", Sabao em Po='" + getSabaoPo() + "'"
                + ", Agua Sanitaria='" + getAguaSanitaria() + "'" + ", Sabao em Barra='" + getSabaoBarra() + "'" + "}";
    }

}
