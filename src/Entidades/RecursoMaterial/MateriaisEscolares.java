package Entidades.RecursoMaterial;

public class MateriaisEscolares {
    private int lapis;
    private int caderno;
    private int caneta;

    public MateriaisEscolares() {
        this.lapis = 0;
        this.caderno = 0;
        this.caneta = 0;
    }

    public int getLapis() {
        return this.lapis;
    }
    public void setLapis(int lapis) {
        this.lapis = lapis;
    }
    public void addLapis(int lapis) {
        this.lapis += lapis;
    }
    public void remLapis(int lapis) {
        if(this.getLapis() - lapis >= 0) this.lapis -= lapis;
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
    public void remCaderno(int caderno) {
        if(this.getCaderno() - caderno >= 0) this.caderno -= caderno;
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
    public void remCaneta(int caneta) {
        if(this.getCaneta() - caderno >= 0) this.caderno -= caderno;
    }

    @Override
    public String toString() {
        return "{" + " Lapis='" + getLapis() + "'" + ", Caderno='" + getCaderno() + "'" + ", Caneta='" + getCaneta()
                + "'" + "}";
    }
}
