package Main;

public class Menu {

    public Menu() {
    }

    protected void principal() {
        System.out.println("\n========== MENU ==========");
        System.out.println("1 - Operacoes com Recursos Humanos");
        System.out.println("2 - Operacoes com Recursos Materiais");
        System.out.println("3 - Distribuicao de Recursos");
        System.out.println("4 - Relatorios");
        System.out.println("0 - Sair");
    }

    protected void operacoesRecursos() {
        System.out.println("\n======== OPERACOES ========");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Atualizar");
        System.out.println("3 - Buscar");
        System.out.println("4 - Remover");
        System.out.println("0 - Voltar");
    }

    protected void operacoesRM(String operacao) {
        System.out.println("\n======== " + operacao.toUpperCase() + " ========");
        System.out.println("1 - " + operacao + " Material Didatico");
        System.out.println("2 - " + operacao + " Material Escolar");
        System.out.println("3 - " + operacao + " Material Limpeza");
        System.out.println("0 - Voltar");
    }

    protected void operacoesRH(String operacao) {
        System.out.println("\n======== " + operacao.toUpperCase() + " ========");
        System.out.println("1 - " + operacao + " Professor");
        System.out.println("2 - " + operacao + " Instrutor");
        System.out.println("3 - " + operacao + " Aluno");
        System.out.println("4 - " + operacao + " Monitor");
        System.out.println("5 - " + operacao + " Cozinheiro");
        System.out.println("6 - " + operacao + " Servente");
        System.out.println("0 - Voltar");
    }

    protected void relatorios() {
        System.out.println("\n======== RELATORIOS ========");
        System.out.println("Tipos de relatorio:");
        System.out.println("1 - Recursos Humanos");
        System.out.println("2 - Recursos Materiais");
        System.out.println("3 - Geral");
        System.out.println("0 - Voltar");
    }

    protected void requisicao() {
        System.out.println("\n======== REQUISICAO DE RECURSOS ========");
        System.out.println("Requisicao de recursos para:");
        System.out.println("1 - Professor");
        System.out.println("2 - Instrutor");
        System.out.println("3 - Aluno");
        System.out.println("4 - Monitor");
        System.out.println("5 - Cozinheiro");
        System.out.println("6 - Servente");
        System.out.println("0 - Voltar");
    }
}
