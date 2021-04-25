package Entidades.RecursoMaterial;

public class MateriaisEscolares {
    protected int lapis;
    protected int caderno;
    protected int caneta;

    public MateriaisEscolares() {
        this.lapis = 0;
        this.caderno = 0;
        this.caneta = 0;
    }

    // Getters, Setters, Adicionar e Remover

    public int getLapis() {
        return this.lapis;
    }

    public void setLapis(int lapis) {
        this.lapis = lapis;
    }

    public void addLapis(int lapis) {
        this.lapis += lapis;
    }

    public boolean remLapis(int lapis) {
        if (this.getLapis() - lapis >= 0) {
            this.lapis -= lapis;
            return true;
        } else
            return false;
    }

    public int getCaderno() {
        return this.caderno;
    }

    public void setCaderno(int caderno) {
        this.caderno = caderno;
    }

    public void addCaderno(int caderno) {
        this.caderno += caderno;
    }

    public boolean remCaderno(int caderno) {
        if (this.getCaderno() - caderno >= 0) {
            this.caderno -= caderno;
            return true;
        } else
            return false;
    }

    public int getCaneta() {
        return this.caneta;
    }

    public void setCaneta(int caneta) {
        this.caneta = caneta;
    }

    public void addCaneta(int caneta) {
        this.caneta += caneta;
    }

    public boolean remCaneta(int caneta) {
        if (this.getCaneta() - caneta >= 0) {
            this.caneta -= caneta;
            return true;
        } else
            return false;
    }

    // Outras funcoes
    public boolean remGeral(int lapis, int caderno, int caneta) {
        boolean c1, c2, c3;
        c1 = this.remLapis(lapis);
        c2 = this.remCaderno(caderno);
        c3 = this.remCaneta(caneta);
        if (c1 && c2 && c3)
            return true;
        else
            return false;
    }

    public void remGeral(int[] listaQtd) {
        this.remGeral(listaQtd[0], listaQtd[1], listaQtd[2]);
    }

    public void addGeral(int lapis, int caderno, int caneta) {
        this.addLapis(lapis);
        this.addCaderno(caderno);
        this.addCaneta(caneta);
    }

    public void addGeral(int[] listaQtd) {
        this.addGeral(listaQtd[0], listaQtd[1], listaQtd[2]);
    }

    public boolean isSuficiente(int lapis, int caderno, int caneta) {
        if (lapis > this.lapis || caderno > this.caderno || caneta > this.caneta) {
            return false;
        } else {
            return true;
        }
    }

    public boolean isSuficiente(int[] listaQtd) {
        return this.isSuficiente(listaQtd[0], listaQtd[1], listaQtd[2]);
    }

    @Override
    public String toString() {
        return "{" + " Lapis='" + getLapis() + "'" + ", Caderno='" + getCaderno() + "'" + ", Caneta='" + getCaneta()
                + "'" + "}";
    }
}
