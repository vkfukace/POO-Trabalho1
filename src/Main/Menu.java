package Main;

public class Menu {

    public Menu() {
    }

    public void geral() {
        System.out.println("\n======== MENU ========");
        System.out.println("1 - Cadastrar Recursos Materiais");
        System.out.println("2 - Atualizar Recursos Materiais");
        System.out.println("3 - Remover Recursos Materiais");
        System.out.println("4 - Mostrar Estoque Recursos Materiais");
        System.out.println("5 - Buscar Recursos Materiais");
        System.out.println("6 - Cadastrar Recursos Humanos");
        System.out.println("7 - Atualizar Recursos Humanos");
        System.out.println("8 - Remover Recursos Humanos");
        System.out.println("9 - Mostrar Recursos Humanos");
        System.out.println("10 - Buscar Recursos Humanos");
        System.out.println("11 - Requisicao de Recursos Materiais");
        System.out.println("12 - Relatorio que vai ser gerado automaticamente no fim da seman");
        System.out.println("13 - Sair");

    }

    public void cadastroRecursoMaterial() {
        System.out.println("1 - Cadastrar Material Didatico");
        System.out.println("2 - Cadastrar Material Escolar");
        System.out.println("3 - Cadastrar Material Limpeza");
    }

    public void atualizarRecursoMaterial() {
        System.out.println("1 - Atualizar Material Didatico");
        System.out.println("2 - Atualizar Material Escolar");
        System.out.println("3 - Atualizar Material Limpeza");
    }

    public void removerRecursoMaterial() {
        System.out.println("1 - Remover Material Didatico");
        System.out.println("2 - Remover Material Escolar");
        System.out.println("3 - Remover Material Limpeza");
    }

    public void buscaRecursoMaterial() {
        System.out.println("1 - Buscar Material Didatico");
        System.out.println("2 - Buscar Material Escolar");
        System.out.println("3 - Buscar Material Limpeza");
    }

    public void buscaRecursoHumanos() {
        System.out.println("1 - Buscar Professor");
        System.out.println("2 - Buscar Instrutor");
        System.out.println("3 - Buscar Aluno");
        System.out.println("4 - Buscar Monitor");
        System.out.println("5 - Buscar Cozinheiro");
        System.out.println("6 - Buscar Servente");

    }

    public void cadastroRecursoHumanoInicial() {
        System.out.println("Para inicializar o sistema, cadastre recursos humanos");
        System.out.println("1 - Cadastrar professores");
        System.out.println("2 - Cadastrar instrutores");
        System.out.println("3 - Cadastrar alunos");
        System.out.println("4 - Cadastrar monitores");
        System.out.println("5 - Cadastrar cozinheiros");
        System.out.println("6 - Cadastrar serventes");
        System.out.println("7 - Seguir execucao");

    }

    public void cadastroRecursoHumano() {

        System.out.println("1 - Cadastrar professores");
        System.out.println("2 - Cadastrar instrutores");
        System.out.println("3 - Cadastrar alunos");
        System.out.println("4 - Cadastrar monitores");
        System.out.println("5 - Cadastrar cozinheiros");
        System.out.println("6 - Cadastrar serventes");

    }

    public void atulizarRecursoHumano() {
        System.out.println("1 - Atualizar professores");
        System.out.println("2 - Atualizar instrutores");
        System.out.println("3 - Atualizar alunos");
        System.out.println("4 - Atualizar monitores");
        System.out.println("5 - Atualizar cozinheiros");
        System.out.println("6 - Atualizar serventes");
    }

    public void removerRecursoHumano() {
        System.out.println("1 - Remover professores");
        System.out.println("2 - Remover instrutores");
        System.out.println("3 - Remover alunos");
        System.out.println("4 - Remover monitores");
        System.out.println("5 - Remover cozinheiros");
        System.out.println("6 - Remover serventes");
    }

    public void requisicao() {
        System.out.println("1 - Requisicao de Material Didatico");
        System.out.println("2 - Requisicao de Material Escolar");
        System.out.println("3 - Requisicao de Material Limpeza");
    }

    public void rh() {
        System.out.println("1 - professores");
        System.out.println("2 - instrutores");
        System.out.println("3 - alunos");
        System.out.println("4 - monitores");
        System.out.println("5 - cozinheiros");
        System.out.println("6 - serventes");
    }

    public void escolhaDeEstoque() {
        System.out.println("O sistema funciona com reposicao de estoque mensal");
        System.out.println("1 - Escolher separadamente a quantidade de cada recurso material");
        System.out.println("2 - Escolher de uma vez todos iguais");
    }
}
