package RecursosHumanos;

public class Pessoa {
    String nome;
    String rg;
    String cpf;
    String telefone;
    int idade;

    public Pessoa() {
        super();
    }

    public Pessoa(String nome, String rg, String cpf, String telefone, int idade) {
        this.nome = nome;
        this.rg = rg;
        this.telefone = telefone;
        this.idade = idade;
    }

    // Getters e Setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "{" + " nome='" + getNome() + "'" + ", rg='" + getRg() + "'" + ", cpf='" + getCpf() + "'"
                + ", telefone='" + getTelefone() + "'" + ", idade='" + getIdade() + "'" + "}";
    }

}
