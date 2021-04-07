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
        this.lapis += lapis;
    }

    public int getCaderno() {
        return this.caderno;
    }

    public void setCaderno(int caderno) {
        this.caderno += caderno;
    }

    public int getCaneta() {
        return this.caneta;
    }

    public void setCaneta(int caneta) {
        this.caneta += caneta;
    }

    @Override
    public String toString() {
        return "{" + " Lapis='" + getLapis() + "'" + ", Caderno='" + getCaderno() + "'" + ", Caneta='" + getCaneta()
                + "'" + "}";
    }
}
