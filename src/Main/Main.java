package Main;

import java.util.Scanner;

import Controle.Estoque;

public class Main{

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
                            break;
                        case 2: // Instrutor
                            estoque.cadastrarInstrutor(input);
                            break;
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

        

        input.close();
    }
}
