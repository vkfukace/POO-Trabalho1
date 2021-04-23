package Main;

public class Menu {

    public Menu() {
    }

    public void principal() {
        System.out.println("\n========== MENU ==========");
        System.out.println("1 - Operacoes com Recursos Humanos");
        System.out.println("2 - Operacoes com Recursos Materiais");
        System.out.println("3 - Distribuicao de Recursos");
        System.out.println("4 - Relatorios");
        System.out.println("5 - Sair");
    }

    public void operacoesRecursos() {
        System.out.println("\n======== OPERACOES ========");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Atualizar");
        System.out.println("3 - Buscar");
        System.out.println("4 - Remover");
        System.out.println("5 - Voltar");
    }

    public void operacoesRM(String operacao) {
        System.out.println("\n======== " + operacao.toUpperCase() + " ========");
        System.out.println("1 - " + operacao + " Material Didatico");
        System.out.println("2 - " + operacao + " Material Escolar");
        System.out.println("3 - " + operacao + " Material Limpeza");
        System.out.println("4 - Voltar");
    }

    public void operacoesRH(String operacao) {
        System.out.println("\n======== " + operacao.toUpperCase() + " ========");
        System.out.println("1 - " + operacao + " Professor");
        System.out.println("2 - " + operacao + " Instrutor");
        System.out.println("3 - " + operacao + " Aluno");
        System.out.println("4 - " + operacao + " Monitor");
        System.out.println("5 - " + operacao + " Cozinheiro");
        System.out.println("6 - " + operacao + " Servente");
        System.out.println("7 - Voltar");
    }

    public void relatorios() {
        System.out.println("\n======== RELATORIOS ========");
        System.out.println("1 - Recursos Humanos");
        System.out.println("2 - Recursos Materiais");
        System.out.println("3 - Geral");
        System.out.println("4 - Voltar");
    }

    public void requisicao() {
        System.out.println("1 - Requisicao de Material Didatico");
        System.out.println("2 - Requisicao de Material Escolar");
        System.out.println("3 - Requisicao de Material Limpeza");
    }

    // public void geral() {
    // System.out.println("\n======== MENU ========");
    // System.out.println("1 - Cadastrar Recursos Materiais");
    // System.out.println("2 - Atualizar Recursos Materiais");
    // System.out.println("3 - Remover Recursos Materiais");
    // System.out.println("4 - Mostrar Estoque Recursos Materiais");
    // System.out.println("5 - Buscar Recursos Materiais");
    // System.out.println("6 - Cadastrar Recursos Humanos");
    // System.out.println("7 - Atualizar Recursos Humanos");
    // System.out.println("8 - Remover Recursos Humanos");
    // System.out.println("9 - Mostrar Recursos Humanos");
    // System.out.println("10 - Buscar Recursos Humanos");
    // System.out.println("11 - Requisicao de Recursos Materiais");
    // System.out.println("12 - Relatorio que vai ser gerado automaticamente no fim
    // da seman");
    // System.out.println("13 - Sair");

    // }

    public void cadastroRecursoHumanoInicial() {
        System.out.println("Para inicializar o sistema, cadastre recursos humanos");
        System.out.println("1 - Cadastrar Professor");
        System.out.println("2 - Cadastrar Instrutor");
        System.out.println("3 - Cadastrar Aluno");
        System.out.println("4 - Cadastrar Monitor");
        System.out.println("5 - Cadastrar Cozinheiro");
        System.out.println("6 - Cadastrar Servente");
        System.out.println("7 - Seguir execucao");

    }

    public void rh() {
        System.out.println("1 - Professor");
        System.out.println("2 - Instrutor");
        System.out.println("3 - Aluno");
        System.out.println("4 - Monitor");
        System.out.println("5 - Cozinheiro");
        System.out.println("6 - Servente");
    }

    public void escolhaDeEstoque() {
        System.out.println("O sistema funciona com reposicao de estoque mensal");
        System.out.println("1 - Escolher separadamente a quantidade de cada recurso material");
        System.out.println("2 - Escolher de uma vez todos iguais");
    }
}
