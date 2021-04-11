package Main;

import java.util.Scanner;

import Controle.*;


public class Main {
    /* Se alguma string entrar com o imput (Exclusivo de int, positivo ou negativo) o programa quebra  */
    /* 
    Primeiro, vao ser cadastrados(no estoque) recursos materias e os funcionarios(recursos humanos)
    Segundo, fazer o preset da quantidade de recursos materias que vai ser fornecida no mes( ao inciar vai ser o primeiro dia do mes)
    Terceiro, a distribuicao é feita a partir de requisicao e a cada requisao é adicionado o recurso ao funcionario e decrementado no estoque
    Quarto, o relatorio geral vai ter uma opcao so pra mostrar que funciona 
     */
    public static void menuGeral() {
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
        System.out.println("12 - Requisicao de Recursos Materiais");
        System.out.println("13 - Preset de quantidade de recursos para distribuicao no começo do mes");
        System.out.println("14 - Relatorio que vai ser gerado automaticamente no fim da seman");
        System.out.println("15 - Sair");
        System.out.print("Insira a opcao: ");
    }

    public static void menuInicial(Estoque estoque, FuncoesAux faux){
        boolean c ;
        System.out.println("\n======== MENU ========");
        System.out.println("Distribuicao para os estoques");
        System.out.println("Materiais Didaticos");
        do{
            if(!faux.atualizarMaterialDidatico(estoque.getRecursosMateriais())){
                System.out.println("voce digitou algo errado, material Didatico nao atualizado");
                System.out.println("Repita o processo");
                c = false; 
            }
            else c = true ;
        }while(!c) ;

        System.out.println("Materiais Escolares");
        do{
            if(! faux.atualizarMaterialEscolar(estoque.getRecursosMateriais())){
                System.out.println("voce digitou algo errado, material Escolar nao atualiado");
                System.out.println("Repita o processo");
                c = false; 
            }
            else c = true ;

        }while(!c) ;

        System.out.println("Materiais limpeza");
        do{
            
            if(! faux.atualizarMaterialLimpeza(estoque.getRecursosMateriais())){
                c = false ;
                System.out.println("voce digitou algo errado, material de Limpeza nao atualiado");
                System.out.println("Repita o processo");
            }
            else c = true ;
        }while(!c) ;

        
        
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Estoque estoque = new Estoque() ;
        FuncoesAux faux = new FuncoesAux();
        int opcao;
        int op;
        menuInicial(estoque, faux);
        do{ 
            menuGeral();
            System.out.println("Opcao : ");
            opcao = Integer.parseInt(input.nextLine()); // nextInt causava erros
            
            switch(opcao){

                case 1: //cadastrar recursos materiais
                
                    faux.menuCadastroRecursoMaterial() ;
                    op = Integer.parseInt(input.nextLine()) ;
                    switch(op){
                        
                        case 1://cadastrar material didatico
                            
                            if(! faux.cadastrarMaterialDidatico(estoque.getRecursosMateriais()))
                                System.out.println("voce digitou algo errado, material Didatico nao cadastrado");
                            
                            break;
                        case 2://cadastrar material Escolar
                            if(! faux.cadastrarMaterialEscolar(estoque.getRecursosMateriais()))
                                System.out.println("voce digitou algo errado, material Escolar nao cadastrado");
                            
                            break;
                        case 3://cadastrar material Limpeza
                            if(! faux.cadastrarMaterialLimpeza(estoque.getRecursosMateriais()))
                                System.out.println("voce digitou algo errado, material de Limpeza nao cadastrado");
                            
                            break;
                    }
                    break;
                case 2: //atualizar recursos materiais
                    faux.menuAtualizarRecursoMaterial();
                    op = Integer.parseInt(input.nextLine()) ;
                    switch(op){
                        case 1://atualizar material didatico
                            if(!faux.atualizarMaterialDidatico(estoque.getRecursosMateriais()))
                                System.out.println("voce digitou algo errado, material Didatico nao atualizado");
                            break;
                        case 2://atualizar material Escolar
                            if(! faux.atualizarMaterialEscolar(estoque.getRecursosMateriais()))
                                System.out.println("voce digitou algo errado, material Escolar nao atualiado");
                            break;
                        case 3://atualizar material Limpeza
                            if(! faux.atualizarMaterialLimpeza(estoque.getRecursosMateriais()))
                                System.out.println("voce digitou algo errado, material de Limpeza nao atualiado");
                            break;
                    }

                    break;
                case 3: //remover recursos materiais
                    faux.menuRemoverRecursoMaterial();
                    op = Integer.parseInt(input.nextLine()) ;
                    switch(op){
                        case 1://remover material didatico
                            if(!faux.removerMaterialDidatico(estoque.getRecursosMateriais()))
                                System.out.println("Quantidade ja  eh 0, material Didatico nao removido");
                            break;
                        case 2://remover material Escolar
                            if(! faux.removerMaterialEscolar(estoque.getRecursosMateriais()))
                                System.out.println("Quantidade ja  eh 0, material Escolar nao removido");
                            break;
                        case 3://remover material Limpeza
                            if(! faux.removerMaterialLimpeza(estoque.getRecursosMateriais()))
                                System.out.println("Quantidade ja  eh 0, material de Limpeza nao removido");
                            break;
                    }
                    break;
                case 4: //relatorio

                    System.out.println(estoque.estoqueRecursosMateriais());
                    break;
                
                case 5: //busca
                    faux.menubuscaRecursoMaterial();
                    op = Integer.parseInt(input.nextLine()) ;
                    switch(op){
                        case 1://buscar material didatico
                            System.out.println(faux.buscaMaterialDidatico(estoque.getRecursosMateriais()));
                            break;
                        case 2://buscar material Escolar
                            System.out.println(faux.buscaMaterialEscolar(estoque.getRecursosMateriais()));
                            break;
                        case 3://buscar material Limpeza
                            System.out.println(faux.buscaMaterialLimpeza(estoque.getRecursosMateriais()));
                            break;
                    }
                    break;
            }
            
        }while(opcao != 6) ;
        
    }
}
