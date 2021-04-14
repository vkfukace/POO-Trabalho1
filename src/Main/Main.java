package Main;

import java.util.Scanner;

import Controle.*;

public class Main {
    /*
     * Se alguma string entrar com o imput (Exclusivo de int, positivo ou negativo)
     * o programa quebra
     */
    /*
     * Primeiro, vao ser cadastrados(no estoque) recursos materias e os
     * funcionarios(recursos humanos) Segundo, fazer o preset da quantidade de
     * recursos materias que vai ser fornecida no mes( ao inciar vai ser o primeiro
     * dia do mes) Terceiro, a distribuicao é feita a partir de requisicao e a cada
     * requisao é adicionado o recurso ao funcionario e decrementado no estoque
     * Quarto, o relatorio geral vai ter uma opcao so pra mostrar que funciona
     */
    public static void inicial(Estoque estoque, Scanner input) {
        boolean c;
        System.out.println("\n======== MENU ========");
        System.out.println("Distribuicao para os estoques");
        System.out.println("Materiais Didaticos");
        do {
            if (!estoque.atualizarMaterialDidatico(input)) {
                System.out.println("voce digitou algo errado, material Didatico nao atualizado");
                System.out.println("Repita o processo");
                c = false;
            } else
                c = true;
        } while (!c);

        System.out.println("Materiais Escolares");
        do {
            if (!estoque.atualizarMaterialEscolar(input)) {
                System.out.println("voce digitou algo errado, material Escolar nao atualiado");
                System.out.println("Repita o processo");
                c = false;
            } else
                c = true;

        } while (!c);

        System.out.println("Materiais limpeza");
        do {

            if (!estoque.atualizarMaterialLimpeza(input)) {
                c = false;
                System.out.println("voce digitou algo errado, material de Limpeza nao atualiado");
                System.out.println("Repita o processo");
            } else
                c = true;
        } while (!c);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Estoque estoque = new Estoque();
        int opcao;
        int op;
        Menu menu = new Menu();

        do {
            menu.cadastroRecursoHumanoInicial();
            opcao = Integer.parseInt(input.nextLine());
            switch (opcao) {
            case 1:// cadastrar professores
                if (!estoque.cadastrarProfessor(input))
                    System.out.println("voce digitou algo errado, professor nao cadastrado");
                break;
            case 2:// cadastrar Alunos
                if (!estoque.cadastrarAluno(input))
                    System.out.println("voce digitou algo errado, aluno nao cadastrado");
                break;
            case 3:// cadastrar Instrutor
                if (!estoque.cadastrarInstrutor(input))
                    System.out.println("voce digitou algo errado, instrutor nao cadastrado");
                break;
            case 4:// cadastrar Monitor
                if (!estoque.cadastrarMonitor(input))
                    System.out.println("voce digitou algo errado, monitor nao cadastrado");
                break;
            case 5:// cadastrar Cozinheiro
                if (!estoque.cadastrarCozinheiro(input))
                    System.out.println("voce digitou algo errado, cozinheiro nao cadastrado");
                break;
            case 6:// cadastrar Servente
                if (!estoque.cadastrarServente(input))
                    System.out.println("voce digitou algo errado, servente nao cadastrado");
                break;
            }
        } while (opcao != 7);

        menu.escolhaDeEstoque();
        int aux = Integer.parseInt(input.nextLine());

        if (aux == 2) {
            System.out.println("Quantidade: ");
            int qtd;
            do {
                qtd = Integer.parseInt(input.nextLine());
                if (qtd > 0) {

                    estoque.getRecursosMateriais().AtualizarRecusoMaterialDidatico(qtd, qtd, qtd, qtd, qtd);
                    estoque.getRecursosMateriais().AtualizarRecusoMaterialEscolar(qtd, qtd, qtd);
                    estoque.getRecursosMateriais().AtualizarRecusoMaterialLimpeza(qtd, qtd, qtd, qtd);
                }
            } while (qtd <= 0);

        } else {
            inicial(estoque, input);
        }

        do {
            menu.geral();
            System.out.println("Opcao : ");
            opcao = Integer.parseInt(input.nextLine()); // nextInt causava erros

            switch (opcao) {

            case 1: // cadastrar recursos materiais

                menu.cadastroRecursoMaterial();
                op = Integer.parseInt(input.nextLine());
                switch (op) {

                case 1:// cadastrar material didatico

                    if (!estoque.cadastrarMaterialDidatico(input))
                        System.out.println("voce digitou algo errado, material Didatico nao cadastrado");

                    break;
                case 2:// cadastrar material Escolar
                    if (!estoque.cadastrarMaterialEscolar(input))
                        System.out.println("voce digitou algo errado, material Escolar nao cadastrado");

                    break;
                case 3:// cadastrar material Limpeza
                    if (!estoque.cadastrarMaterialLimpeza(input))
                        System.out.println("voce digitou algo errado, material de Limpeza nao cadastrado");

                    break;
                }
                break;
            case 2: // atualizar recursos materiais
                menu.atualizarRecursoMaterial();
                op = Integer.parseInt(input.nextLine());
                switch (op) {
                case 1:// atualizar material didatico
                    if (!estoque.atualizarMaterialDidatico(input))
                        System.out.println("voce digitou algo errado, material Didatico nao atualizado");
                    break;
                case 2:// atualizar material Escolar
                    if (!estoque.atualizarMaterialEscolar(input))
                        System.out.println("voce digitou algo errado, material Escolar nao atualiado");
                    break;
                case 3:// atualizar material Limpeza
                    if (!estoque.atualizarMaterialLimpeza(input))
                        System.out.println("voce digitou algo errado, material de Limpeza nao atualiado");
                    break;
                }

                break;
            case 3: // remover recursos materiais
                menu.removerRecursoMaterial();
                op = Integer.parseInt(input.nextLine());
                switch (op) {
                case 1:// remover material didatico
                    if (!estoque.removerMaterialDidatico(input))
                        System.out.println("Quantidade ja  eh 0, material Didatico nao removido");
                    break;
                case 2:// remover material Escolar
                    if (!estoque.removerMaterialEscolar(input))
                        System.out.println("Quantidade ja  eh 0, material Escolar nao removido");
                    break;
                case 3:// remover material Limpeza
                    if (!estoque.removerMaterialLimpeza(input))
                        System.out.println("Quantidade ja  eh 0, material de Limpeza nao removido");
                    break;
                }
                break;
            case 4: // estoque recursos materiais

                System.out.println(estoque.estoqueRecursosMateriais());
                break;

            case 5: // busca
                menu.buscaRecursoMaterial();
                op = Integer.parseInt(input.nextLine());
                switch (op) {
                case 1:// buscar material didatico
                    System.out.println(estoque.getRecursosMateriais().getMateriaisDidaticos().toString());
                    break;
                case 2:// buscar material Escolar
                    System.out.println(estoque.getRecursosMateriais().getMateriaisEscolares().toString());
                    break;
                case 3:// buscar material Limpeza
                    System.out.println(estoque.getRecursosMateriais().getMateriaisLimpeza().toString());
                    break;
                }
                break;

            case 6:// cadastrar recurso humano
                menu.cadastroRecursoHumano();
                op = Integer.parseInt(input.nextLine());
                switch (op) {
                case 1:// professor
                    if (!estoque.cadastrarProfessor(input))
                        System.out.println("Algo foi digitado errado professor nao cadastrado");
                    break;
                case 2:// instrutor
                    if (!estoque.cadastrarInstrutor(input))
                        System.out.println("Algo foi digitado errado instrutor nao cadastrado ");
                    break;
                case 3:// alunos
                    if (!estoque.cadastrarAluno(input))
                        System.out.println("Algo foi digitado errado aluno nao cadastrado");
                    break;
                case 4:// monitores
                    if (!estoque.cadastrarMonitor(input))
                        System.out.println("Algo foi digitado errado monitor nao cadastrado");
                    break;
                case 5:// cozinheiros
                    if (!estoque.cadastrarCozinheiro(input))
                        System.out.println("Algo foi digitado errado cozinheiro nao cadastrado");
                    break;
                case 6:// servente
                    if (!estoque.cadastrarServente(input))
                        System.out.println("Algo foi digitado errado servente nao cadastrado");
                    break;
                }
                break;
            case 7:// atualizar recurso humano
                menu.atulizarRecursoHumano();
                op = Integer.parseInt(input.nextLine());
                switch (op) {
                case 1:// atualizar professor
                    if (!estoque.atualizarProfessor(input))
                        System.out.println("Algo foi digitado errado professor nao encontrado");
                    break;
                case 2:// atualizar instrutor
                    if (!estoque.atualizarInstrutor(input))
                        System.out.println("Algo foi digitado errado instrutor nao encontrado ");
                    break;
                case 3:// atualizar alunos
                    if (!estoque.atualizarAluno(input))
                        System.out.println("Algo foi digitado errado aluno nao encontrado");
                    break;
                case 4:// atualizar monitores
                    if (!estoque.atualizarMonitor(input))
                        System.out.println("Algo foi digitado errado monitor nao encontrado");
                    break;
                case 5:// atualizar cozinheiros
                    if (!estoque.atualizarCozinheiro(input))
                        System.out.println("Algo foi digitado errado cozinheiro nao encontrado");
                    break;
                case 6:// atualizar servente
                    if (!estoque.atualizarServente(input))
                        System.out.println("Algo foi digitado errado servente nao encontrado");
                    break;
                }
                break;
            case 8:// remover recurso humano
                menu.removerRecursoHumano();
                op = Integer.parseInt(input.nextLine());
                switch (op) {
                case 1:// remover professor
                    if (!estoque.removerProfessor(input))
                        System.out.println("Algo foi digitado errado professor nao removido");
                    break;
                case 2:// remover instrutor
                    if (!estoque.removerInstrutor(input))
                        System.out.println("Algo foi digitado errado instrutor nao removido ");
                    break;
                case 3:// remover alunos
                    if (!estoque.removerAluno(input))
                        System.out.println("Algo foi digitado errado aluno nao removido");
                    break;
                case 4:// remover monitores
                    if (!estoque.removerMonitor(input))
                        System.out.println("Algo foi digitado errado monitor nao removido");
                    break;
                case 5:// remover cozinheiros
                    if (!estoque.removerCozinheiro(input))
                        System.out.println("Algo foi digitado errado cozinheiro nao removido");
                    break;
                case 6:// remover servente
                    if (!estoque.removerServente(input))
                        System.out.println("Algo foi digitado errado servente nao removido");
                    break;
                }
                break;

            case 9: // mostrar recursos humanos
                estoque.getRecursosHumanos().printRH();
                break;

            case 10:// buscar recurso humano
                menu.buscaRecursoHumanos();
                op = Integer.parseInt(input.nextLine());
                switch (op) {
                case 1:// buscar professor
                    estoque.getRecursosHumanos().printProfessores();
                    break;
                case 2:// buscar instrutor
                    estoque.getRecursosHumanos().printInstrutores();
                    break;
                case 3:// buscar alunos
                    estoque.getRecursosHumanos().printAlunos();
                    break;
                case 4:// buscar monitores
                    estoque.getRecursosHumanos().printMonitores();
                    break;
                case 5:// buscar cozinheiros
                    estoque.getRecursosHumanos().printCozinheiros();
                    break;
                case 6:// buscar servente
                    estoque.getRecursosHumanos().printServentes();
                    break;
                }
                break;

            case 11: // requisicao
                menu.rh();
                op = Integer.parseInt(input.nextLine());
                switch (op) {
                case 1:// professor matDidatico
                    estoque.requisicaoMatDidatico("professor", input);
                    break;
                case 2:// aluno
                    estoque.requisicaoMatEscolar("aluno", input);
                    break;
                case 3:// instrutor
                    estoque.requisicaoMatDidatico("instrutor", input);
                    break;
                case 4:// monitores
                    estoque.requisicaoMatDidatico("monitores", input);
                    break;
                case 5:// cozinheiros
                    estoque.requisicaoMatLimpeza("cozinheiro", input);
                    break;
                case 6:// serventes
                    estoque.requisicaoMatLimpeza("servente", input);
                    break;
                }
                break;

            case 12:// relatorio completo
                System.out.println("Relacao do estoque e recursos humanos");
                estoque.getRecursosHumanos().printRH();
                break;

            }

        } while (opcao != 13);
        input.close();
    }
}
