package Main;

import java.util.Scanner;

import Controle.*;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Estoque estoque = new Estoque();
        int opcao1, opcao2, opcao3;
        Menu menu = new Menu();

        System.out.println("SISTEMA DE GERENCIAMENTO DE RECURSOS");

        do {
            menu.principal();
            System.out.print("Opcao: ");
            opcao1 = Integer.parseInt(input.nextLine()); // nextInt causava erros

            switch (opcao1) {
            case 1: // Operacoes recursos humanos
                menu.operacoesRecursos();
                System.out.print("Opcao: ");
                opcao2 = Integer.parseInt(input.nextLine());
                switch (opcao2) {
                case 1: // Cadastrar
                    menu.operacoesRH("Cadastrar");
                    System.out.print("Opcao: ");
                    opcao3 = Integer.parseInt(input.nextLine());
                    switch (opcao3) {
                    case 1: // Professor
                        estoque.cadastrarProfessor(input);
                    case 2: // Instrutor
                        estoque.cadastrarInstrutor(input);
                    case 3: // Aluno
                        estoque.cadastrarAluno(input);
                        break;
                    case 4: // Monitor
                        estoque.cadastrarMonitor(input);
                        break;
                    case 5: // Cozinheiro
                        estoque.cadastrarCozinheiro(input);
                        break;
                    case 6: // Servente
                        estoque.cadastrarServente(input);
                        break;
                    case 0: // Sair
                        break;
                    default:
                        System.out.println("Opcao Invalida!");
                    }
                    break;
                case 2: // Atualizar
                    menu.operacoesRH("Atualizar");
                    System.out.print("Opcao: ");
                    opcao3 = Integer.parseInt(input.nextLine());
                    switch (opcao3) {
                    case 1: // Professor
                        estoque.atualizarProfessor(input);
                        break;
                    case 2: // Instrutor
                        estoque.atualizarInstrutor(input);
                        break;
                    case 3: // Aluno
                        estoque.atualizarAluno(input);
                        break;
                    case 4: // Monitor
                        estoque.atualizarMonitor(input);
                        break;
                    case 5: // Cozinheiro
                        estoque.atualizarCozinheiro(input);
                        break;
                    case 6: // Servente
                        estoque.atualizarServente(input);
                        break;
                    case 0: // Sair
                        break;
                    default:
                        System.out.println("Opcao Invalida!");
                    }
                    break;
                case 3: // Buscar
                    menu.operacoesRH("Buscar");
                    System.out.print("Opcao: ");
                    opcao3 = Integer.parseInt(input.nextLine());
                    switch (opcao3) {
                    case 1: // Professor
                        estoque.buscarProfessor(input);
                        break;
                    case 2: // Instrutor
                        estoque.buscarInstrutor(input);
                        break;
                    case 3: // Aluno
                        estoque.buscarAluno(input);
                        break;
                    case 4: // Monitor
                        estoque.buscarMonitor(input);
                        break;
                    case 5: // Cozinheiro
                        estoque.buscarCozinheiro(input);
                        break;
                    case 6: // Servente
                        estoque.buscarServente(input);
                        break;
                    case 0: // Sair
                        break;
                    default:
                        System.out.println("Opcao Invalida!");
                    }
                    break;
                case 4: // Remover
                    menu.operacoesRH("Remover");
                    System.out.print("Opcao: ");
                    opcao3 = Integer.parseInt(input.nextLine());
                    switch (opcao3) {
                    case 1: // Professor
                        estoque.removerProfessor(input);
                        break;
                    case 2: // Instrutor
                        estoque.removerInstrutor(input);
                        break;
                    case 3: // Aluno
                        estoque.removerAluno(input);
                        break;
                    case 4: // Monitor
                        estoque.removerMonitor(input);
                        break;
                    case 5: // Cozinheiro
                        estoque.removerCozinheiro(input);
                        break;
                    case 6: // Servente
                        estoque.removerServente(input);
                        break;
                    case 0: // Sair
                        break;
                    default:
                        System.out.println("Opcao Invalida!");
                    }
                    break;
                case 0: // Sair
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                }
                break;
            case 2: // Operacoes recursos materiais
                menu.operacoesRecursos();
                System.out.print("Opcao: ");
                opcao2 = Integer.parseInt(input.nextLine());
                switch (opcao2) {
                case 1: // Cadastrar
                    menu.operacoesRM("Cadastrar");
                    System.out.print("Opcao: ");
                    opcao3 = Integer.parseInt(input.nextLine());
                    switch (opcao3) {
                    case 1: // Material Didatico
                        estoque.cadastrarMaterialDidatico(input);
                        break;
                    case 2: // Material Escolar
                        estoque.cadastrarMaterialEscolar(input);
                        break;
                    case 3: // Material de Limpeza
                        estoque.cadastrarMaterialLimpeza(input);
                        break;
                    case 0: // Sair
                        break;
                    default:
                        System.out.println("Opcao Invalida!");
                    }
                    break;
                case 2: // Atualizar
                    menu.operacoesRM("Atualizar");
                    System.out.print("Opcao: ");
                    opcao3 = Integer.parseInt(input.nextLine());
                    switch (opcao3) {
                    case 1: // Material Didatico
                        estoque.atualizarMaterialDidatico(input);
                        break;
                    case 2: // Material Escolar
                        estoque.atualizarMaterialEscolar(input);
                        break;
                    case 3: // Material de Limpeza
                        estoque.atualizarMaterialLimpeza(input);
                        break;
                    case 0: // Sair
                        break;
                    default:
                        System.out.println("Opcao Invalida!");
                    }
                    break;
                case 3: // Buscar
                    menu.operacoesRM("Buscar");
                    System.out.print("Opcao: ");
                    opcao3 = Integer.parseInt(input.nextLine());
                    switch (opcao3) {
                    case 1: // Material Didatico
                        estoque.buscarMaterialDidatico();
                        break;
                    case 2: // Material Escolar
                        estoque.buscarMaterialEscolar();
                        break;
                    case 3: // Material de Limpeza
                        estoque.buscarMaterialLimpeza();
                        break;
                    case 0: // Sair
                        break;
                    default:
                        System.out.println("Opcao Invalida!");
                    }
                    break;
                case 4: // Remover
                    menu.operacoesRM("Remover");
                    System.out.print("Opcao: ");
                    opcao3 = Integer.parseInt(input.nextLine());
                    switch (opcao3) {
                    case 1: // Material Didatico
                        estoque.removerMaterialDidatico(input);
                        break;
                    case 2: // Material Escolar
                        estoque.removerMaterialEscolar(input);
                        break;
                    case 3: // Material de Limpeza
                        estoque.buscarMaterialLimpeza();
                        break;
                    case 0: // Sair
                        break;
                    default:
                        System.out.println("Opcao Invalida!");
                    }
                    break;
                case 0: // Sair
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                }

                break;
            case 3: // Distribuicao de recursos
                menu.requisicao();
                System.out.print("Opcao: ");
                opcao2 = Integer.parseInt(input.nextLine());
                switch (opcao2) {
                case 1:// professor
                    estoque.requisicaoMatDidatico("professor", input);
                    break;
                case 2:// instrutor
                    estoque.requisicaoMatDidatico("instrutor", input);
                    break;
                case 3:// aluno
                    estoque.requisicaoMatEscolar("aluno", input);
                    break;
                case 4:// monitor
                    estoque.requisicaoMatDidatico("monitor", input);
                    break;
                case 5:// cozinheiro
                    estoque.requisicaoMatLimpeza("cozinheiro", input);
                    break;
                case 6:// servente
                    estoque.requisicaoMatLimpeza("servente", input);
                    break;
                case 0:// sair
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                }
                break;
            case 4: // Relatorios
                menu.relatorios();
                System.out.print("Opcao: ");
                opcao2 = Integer.parseInt(input.nextLine());
                switch (opcao2) {
                case 1: // Recursos Humanos
                    estoque.relatorioRH();
                    break;
                case 2: // Recursos Materiais
                    estoque.relatorioRM();
                    break;
                case 3: // Geral
                    estoque.relatorioGeral();
                    break;
                case 0: // Sair
                    break;
                default:
                    System.out.println("Opcao Invalida!");
                }
                break;
            case 0: // Sair
                break;

            default:
                System.out.println("Opcao Invalida!");

            }
        } while (opcao1 != 0);

        // switch (opcao) {

        // case 1: // cadastrar recursos materiais

        // menu.cadastroRecursoMaterial();
        // op = Integer.parseInt(input.nextLine());
        // switch (op) {

        // case 1:// cadastrar material didatico

        // if (!estoque.cadastrarMaterialDidatico(input))
        // System.out.println("voce digitou algo errado, material Didatico nao
        // cadastrado");

        // break;
        // case 2:// cadastrar material Escolar
        // if (!estoque.cadastrarMaterialEscolar(input))
        // System.out.println("voce digitou algo errado, material Escolar nao
        // cadastrado");

        // break;
        // case 3:// cadastrar material Limpeza
        // if (!estoque.cadastrarMaterialLimpeza(input))
        // System.out.println("voce digitou algo errado, material de Limpeza nao
        // cadastrado");

        // break;
        // }
        // break;
        // case 2: // atualizar recursos materiais
        // menu.atualizarRecursoMaterial();
        // op = Integer.parseInt(input.nextLine());
        // switch (op) {
        // case 1:// atualizar material didatico
        // if (!estoque.atualizarMaterialDidatico(input))
        // System.out.println("voce digitou algo errado, material Didatico nao
        // atualizado");
        // break;
        // case 2:// atualizar material Escolar
        // if (!estoque.atualizarMaterialEscolar(input))
        // System.out.println("voce digitou algo errado, material Escolar nao
        // atualiado");
        // break;
        // case 3:// atualizar material Limpeza
        // if (!estoque.atualizarMaterialLimpeza(input))
        // System.out.println("voce digitou algo errado, material de Limpeza nao
        // atualiado");
        // break;
        // }

        // break;
        // case 3: // remover recursos materiais
        // menu.removerRecursoMaterial();
        // op = Integer.parseInt(input.nextLine());
        // switch (op) {
        // case 1:// remover material didatico
        // if (!estoque.removerMaterialDidatico(input))
        // System.out.println("Quantidade ja eh 0, material Didatico nao removido");
        // break;
        // case 2:// remover material Escolar
        // if (!estoque.removerMaterialEscolar(input))
        // System.out.println("Quantidade ja eh 0, material Escolar nao removido");
        // break;
        // case 3:// remover material Limpeza
        // if (!estoque.removerMaterialLimpeza(input))
        // System.out.println("Quantidade ja eh 0, material de Limpeza nao removido");
        // break;
        // }
        // break;
        // case 4: // estoque recursos materiais

        // System.out.println(estoque.estoqueRecursosMateriais());
        // break;

        // case 5: // busca
        // menu.buscaRecursoMaterial();
        // op = Integer.parseInt(input.nextLine());
        // switch (op) {
        // case 1:// buscar material didatico
        // System.out.println(estoque.getRecursosMateriais().getMateriaisDidaticos().toString());
        // break;
        // case 2:// buscar material Escolar
        // System.out.println(estoque.getRecursosMateriais().getMateriaisEscolares().toString());
        // break;
        // case 3:// buscar material Limpeza
        // System.out.println(estoque.getRecursosMateriais().getMateriaisLimpeza().toString());
        // break;
        // }
        // break;

        // case 6:// cadastrar recurso humano
        // menu.cadastroRecursoHumano();
        // op = Integer.parseInt(input.nextLine());
        // switch (op) {
        // case 1:// professor
        // if (!estoque.cadastrarProfessor(input))
        // System.out.println("Algo foi digitado errado professor nao cadastrado");
        // break;
        // case 2:// instrutor
        // if (!estoque.cadastrarInstrutor(input))
        // System.out.println("Algo foi digitado errado instrutor nao cadastrado ");
        // break;
        // case 3:// alunos
        // if (!estoque.cadastrarAluno(input))
        // System.out.println("Algo foi digitado errado aluno nao cadastrado");
        // break;
        // case 4:// monitores
        // if (!estoque.cadastrarMonitor(input))
        // System.out.println("Algo foi digitado errado monitor nao cadastrado");
        // break;
        // case 5:// cozinheiros
        // if (!estoque.cadastrarCozinheiro(input))
        // System.out.println("Algo foi digitado errado cozinheiro nao cadastrado");
        // break;
        // case 6:// servente
        // if (!estoque.cadastrarServente(input))
        // System.out.println("Algo foi digitado errado servente nao cadastrado");
        // break;
        // }
        // break;
        // case 7:// atualizar recurso humano
        // menu.atualizarRecursoHumano();
        // op = Integer.parseInt(input.nextLine());
        // switch (op) {
        // case 1:// atualizar professor
        // if (!estoque.atualizarProfessor(input))
        // System.out.println("Algo foi digitado errado professor nao encontrado");
        // break;
        // case 2:// atualizar instrutor
        // if (!estoque.atualizarInstrutor(input))
        // System.out.println("Algo foi digitado errado instrutor nao encontrado ");
        // break;
        // case 3:// atualizar alunos
        // if (!estoque.atualizarAluno(input))
        // System.out.println("Algo foi digitado errado aluno nao encontrado");
        // break;
        // case 4:// atualizar monitores
        // if (!estoque.atualizarMonitor(input))
        // System.out.println("Algo foi digitado errado monitor nao encontrado");
        // break;
        // case 5:// atualizar cozinheiros
        // if (!estoque.atualizarCozinheiro(input))
        // System.out.println("Algo foi digitado errado cozinheiro nao encontrado");
        // break;
        // case 6:// atualizar servente
        // if (!estoque.atualizarServente(input))
        // System.out.println("Algo foi digitado errado servente nao encontrado");
        // break;
        // }
        // break;
        // case 8:// remover recurso humano
        // menu.removerRecursoHumano();
        // op = Integer.parseInt(input.nextLine());
        // switch (op) {
        // case 1:// remover professor
        // if (!estoque.removerProfessor(input))
        // System.out.println("Algo foi digitado errado professor nao removido");
        // break;
        // case 2:// remover instrutor
        // if (!estoque.removerInstrutor(input))
        // System.out.println("Algo foi digitado errado instrutor nao removido ");
        // break;
        // case 3:// remover alunos
        // if (!estoque.removerAluno(input))
        // System.out.println("Algo foi digitado errado aluno nao removido");
        // break;
        // case 4:// remover monitores
        // if (!estoque.removerMonitor(input))
        // System.out.println("Algo foi digitado errado monitor nao removido");
        // break;
        // case 5:// remover cozinheiros
        // if (!estoque.removerCozinheiro(input))
        // System.out.println("Algo foi digitado errado cozinheiro nao removido");
        // break;
        // case 6:// remover servente
        // if (!estoque.removerServente(input))
        // System.out.println("Algo foi digitado errado servente nao removido");
        // break;
        // }
        // break;

        // case 9: // mostrar recursos humanos
        // estoque.getRecursosHumanos().printRH();
        // break;

        // case 10:// buscar recurso humano
        // menu.buscaRecursoHumanos();
        // op = Integer.parseInt(input.nextLine());
        // switch (op) {
        // case 1:// buscar professor
        // estoque.getRecursosHumanos().printProfessores();
        // break;
        // case 2:// buscar instrutor
        // estoque.getRecursosHumanos().printInstrutores();
        // break;
        // case 3:// buscar alunos
        // estoque.getRecursosHumanos().printAlunos();
        // break;
        // case 4:// buscar monitores
        // estoque.getRecursosHumanos().printMonitores();
        // break;
        // case 5:// buscar cozinheiros
        // estoque.getRecursosHumanos().printCozinheiros();
        // break;
        // case 6:// buscar servente
        // estoque.getRecursosHumanos().printServentes();
        // break;
        // }
        // break;

        // case 11: // requisicao
        // menu.rh();
        // op = Integer.parseInt(input.nextLine());
        // switch (op) {
        // case 1:// professor matDidatico
        // estoque.requisicaoMatDidatico("professor", input);
        // break;
        // case 2:// aluno
        // estoque.requisicaoMatEscolar("aluno", input);
        // break;
        // case 3:// instrutor
        // estoque.requisicaoMatDidatico("instrutor", input);
        // break;
        // case 4:// monitores
        // estoque.requisicaoMatDidatico("monitores", input);
        // break;
        // case 5:// cozinheiros
        // estoque.requisicaoMatLimpeza("cozinheiro", input);
        // break;
        // case 6:// serventes
        // estoque.requisicaoMatLimpeza("servente", input);
        // break;
        // }
        // break;

        // case 12:// relatorio completo
        // System.out.println("Relacao do estoque e recursos humanos");
        // estoque.getRecursosHumanos().printRH();
        // break;

        // }

        // } while (opcao != 13);

        input.close();
    }
}
