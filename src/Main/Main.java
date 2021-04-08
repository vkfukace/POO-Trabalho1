package Main;

import java.util.Scanner;

import Controle.Estoque;
import Entidades.RecursoMaterial.MateriaisDidaticos;
import Entidades.RecursoMaterial.MateriaisEscolares;
import Entidades.RecursoMaterial.MateriaisLimpeza;

public class Main {
    
    public static void menu() {
        System.out.println("\n======== MENU ========");
        System.out.println("1 - Gerenciar");
        System.out.println("2 - Gerar relatorios");
        System.out.println("3 - Buscar dados");
        System.out.println("4 - Sair");
        System.out.print("Insira a opcao: ");
    }

    public static void menu2() {
        System.out.println("\n======== MENU ========");
        System.out.println("1 - Cadastrar Recursos Materiais");
        System.out.println("2 - Atualizar Recursos Materiais");
        System.out.println("3 - Mostrar Estoque Recursos Materiais");
        /* System.out.println("3 - Remover Recursos Materiais");
        System.out.println("4 - Cadastrar Recursos Humanos");
        System.out.println("5 - Atualizar Recursos Humanos");
        System.out.println("6 - Remover Recursos Humanos"); */
        System.out.println("4 - Sair");
        System.out.print("Insira a opcao: ");
    }

    public static void menuCadastroRecursoMaterial(){
        System.out.println("1 - Cadastrar Material Didatico");
        System.out.println("2 - Cadastrar Material Escolar");
        System.out.println("3 - Cadastrar Material Limpeza");
    }

    public static void cadastrarMaterialDidatico(MateriaisDidaticos aux){
        Scanner input = new Scanner(System.in) ;
        int op ;
        System.out.println("Quantidade de Livro: ");
        op = Integer.parseInt(input.nextLine()) ; 
        aux.addLivro(op);

        System.out.println("Quantidade de Quadro: ");
        op = Integer.parseInt(input.nextLine()) ; 
        aux.addQuadro(op);
        
        System.out.println("Quantidade de Giz: ");
        op = Integer.parseInt(input.nextLine()) ; 
        aux.addGiz(op);

        System.out.println("Quantidade de Apagador: ");
        op = Integer.parseInt(input.nextLine()) ; 
        aux.addApagador(op);

        System.out.println("Quantidade de Pincel: ");
        op = Integer.parseInt(input.nextLine()) ; 
        aux.addPincel(op);
        
        
    }
    public static void cadastrarMaterialEscolar(MateriaisEscolares aux){
        Scanner input = new Scanner(System.in) ;
        int op ; 
        System.out.println("Quantidade de Lapis: ");
        op = Integer.parseInt(input.nextLine()) ; 
        aux.addLapis(op);
        
        System.out.println("Quantidade de Caderno: ");
        op = Integer.parseInt(input.nextLine()) ; 
        aux.addCaderno(op);
        
        System.out.println("Quantidade de Caneta: ");
        op = Integer.parseInt(input.nextLine()) ; 
        aux.addCaneta(op);
        
        
    }
    public static void cadastrarMaterialLimpeza(MateriaisLimpeza aux){
        Scanner input = new Scanner(System.in) ;
        int op ; 
        System.out.println("Quantidade de Alvejante: ");
        op = Integer.parseInt(input.nextLine()) ; 
        aux.addAlvejante(op);
        
        System.out.println("Quantidade de Sabao em po: ");
        op = Integer.parseInt(input.nextLine()) ; 
        aux.addSabaoPo(op);
        
        System.out.println("Quantidade de Agua sanitaria: ");
        op = Integer.parseInt(input.nextLine()) ; 
        aux.addAguaSanitaria(op);
        
        System.out.println("Quantidade de Sabao barra: ");
        op = Integer.parseInt(input.nextLine()) ; 
        aux.addSabaoBarra(op);
        
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Estoque estoque = new Estoque() ;
        int opcao;
        int op;
        int aux;
        
        do{ 
            menu2();
            System.out.println("Opcao : ");
            opcao = Integer.parseInt(input.nextLine()); // nextInt causava erros
            aux = opcao ;
            switch(opcao){

                case 1:
                //cadastrar recursos materiais
                    menuCadastroRecursoMaterial() ;
                    op = Integer.parseInt(input.nextLine()) ;
                    switch(op){
                        
                        case 1://cadastrar material didatico
                            cadastrarMaterialDidatico(estoque.getRecursosMateriais().getMateriaisDidaticos());
                            break;
                        case 2://cadastrar material Escolar
                            cadastrarMaterialEscolar(estoque.getRecursosMateriais().getMateriaisEscolares());
                            break;
                        case 3://cadastrar material Limpeza
                            cadastrarMaterialLimpeza(estoque.getRecursosMateriais().getMateriaisLimpeza());
                            break;
                    }

                    break;
                case 2:
                    //Atualizar recursos
                    break;
                case 3:
                    //relatorio
                    System.out.println(estoque.estoqueRecursosMateriais());
                    break;

            }
            
        }while(aux != 4) ;
        
    }
}
