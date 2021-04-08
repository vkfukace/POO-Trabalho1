package Main;

import java.util.Scanner;

import Controle.Estoque;
import Controle.RecursosMateriais;

public class Main {
    
    public static void menu2() {
        System.out.println("\n======== MENU ========");
        System.out.println("1 - Cadastrar Recursos Materiais");
        System.out.println("2 - Atualizar Recursos Materiais");
        System.out.println("3 - Mostrar Estoque Recursos Materiais");
        System.out.println("4 - Remover Recursos Materiais");
        /*System.out.println("4 - Cadastrar Recursos Humanos");
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
    public static void menuAtualizarRecursoMaterial(){
        System.out.println("1 - Atualizar Material Didatico");
        System.out.println("2 - Atualizar Material Escolar");
        System.out.println("3 - Atualizar Material Limpeza");
    }
    public static void menuRemoverRecursoMaterial(){
        System.out.println("1 - Remover Material Didatico");
        System.out.println("2 - Remover Material Escolar");
        System.out.println("3 - Remover Material Limpeza");
    }

    public static boolean cadastrarMaterialDidatico(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ", "Quantidade de Apagador: ", "Quantidade de Pincel: "};
        int[] listaAux = new int[5] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AdicionarRecusoMaterialDidatico(listaAux[0], listaAux[1], listaAux[2], listaAux[3]);
    }
    public static boolean cadastrarMaterialEscolar(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: "};
        int[] listaAux = new int[3] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AdicionarRecusoMaterialEscolar(listaAux[0], listaAux[1], listaAux[2]);
        
        
    }
    public static boolean cadastrarMaterialLimpeza(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Alvejante: ", "Quantidade de Sabao em po: ", "Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: "};
        int[] listaAux = new int[4] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AdicionarRecusoMaterialLimpeza(listaAux[0], listaAux[1], listaAux[2], listaAux[3]);
        
    }

    public static boolean atualizarMaterialDidatico(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ", "Quantidade de Apagador: ", "Quantidade de Pincel: "};
        int[] listaAux = new int[5] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AtualizarRecusoMaterialDidatico(listaAux[0], listaAux[1], listaAux[2], listaAux[3]);
        
        
    }
    public static boolean atualizarMaterialEscolar(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: "};
        int[] listaAux = new int[3] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AtualizarRecusoMaterialEscolar(listaAux[0], listaAux[1], listaAux[2]);
        
        
    }
    public static boolean atualizarMaterialLimpeza(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Quantidade de Alvejante: ", "Quantidade de Sabao em po: ", "Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: "};
        int[] listaAux = new int[4] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AtualizarRecusoMaterialLimpeza(listaAux[0], listaAux[1], listaAux[2], listaAux[3]);
        
    
    }

    public static boolean removerMaterialDidatico(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ", "Quantidade de Apagador: ", "Quantidade de Pincel: "};
        int[] listaAux = new int[5] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.RemoverRecusoMaterialDidatico(listaAux[0], listaAux[1], listaAux[2], listaAux[3]);    
    }
    public static boolean removerMaterialEscolar(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: "};
        int[] listaAux = new int[3] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.RemoverRecusoMaterialEscolar(listaAux[0], listaAux[1], listaAux[2]);
    
    }    
    public static boolean removerMaterialLimpeza(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
       
        String[] listaNomes = {"Quantidade de Alvejante: ", "Quantidade de Sabao em po: ", "Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: "};
        int[] listaAux = new int[4] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.RemoverRecusoMaterialLimpeza(listaAux[0], listaAux[1], listaAux[2], listaAux[3]);
    
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Estoque estoque = new Estoque() ;
        int opcao;
        int op;
        
        //erros
        //1 - digiar letras 
        do{ 
            menu2();
            System.out.println("Opcao : ");
            opcao = Integer.parseInt(input.nextLine()); // nextInt causava erros
            
            switch(opcao){

                case 1:
                //cadastrar recursos materiais
                    menuCadastroRecursoMaterial() ;
                    op = Integer.parseInt(input.nextLine()) ;
                    switch(op){
                        
                        case 1://cadastrar material didatico
                            
                            if(! cadastrarMaterialDidatico(estoque.getRecursosMateriais()))
                                System.out.println("voce digitou algo errado, material Didatico nao cadastrado");
                            
                            break;
                        case 2://cadastrar material Escolar
                            if(! cadastrarMaterialEscolar(estoque.getRecursosMateriais()))
                                System.out.println("voce digitou algo errado, material Escolar nao cadastrado");
                            
                            break;
                        case 3://cadastrar material Limpeza
                            if(! cadastrarMaterialLimpeza(estoque.getRecursosMateriais()))
                                System.out.println("voce digitou algo errado, material de Limpeza nao cadastrado");
                            
                            break;
                    }
                    break;
                case 2:
                    menuAtualizarRecursoMaterial();
                    op = Integer.parseInt(input.nextLine()) ;
                    switch(op){
                        case 1://atualizar material didatico
                            if(!atualizarMaterialDidatico(estoque.getRecursosMateriais()));
                                System.out.println("voce digitou algo errado, material Didatico nao atualizado");
                            break;
                        case 2://atualizar material Escolar
                            if(! atualizarMaterialEscolar(estoque.getRecursosMateriais()));
                                System.out.println("voce digitou algo errado, material Escolar nao atualiado");
                            break;
                        case 3://atualizar material Limpeza
                            if(! atualizarMaterialLimpeza(estoque.getRecursosMateriais()));
                                System.out.println("voce digitou algo errado, material de Limpeza nao atualiado");
                            break;
                    }

                    break;
                case 3:
                    menuRemoverRecursoMaterial();
                    op = Integer.parseInt(input.nextLine()) ;
                    switch(op){
                        case 1://remover material didatico
                            if(!removerMaterialDidatico(estoque.getRecursosMateriais()));
                                System.out.println("Quantidade ja  eh 0, material Didatico nao removido");
                            break;
                        case 2://remover material Escolar
                            if(! removerMaterialEscolar(estoque.getRecursosMateriais()));
                                System.out.println("Quantidade ja  eh 0, material Escolar nao removido");
                            break;
                        case 3://remover material Limpeza
                            if(! removerMaterialLimpeza(estoque.getRecursosMateriais()));
                                System.out.println("Quantidade ja  eh 0, material de Limpeza nao removido");
                            break;
                    }
                    break;
                case 4:
                    //relatorio
                    System.out.println(estoque.estoqueRecursosMateriais());
                    break;

            }
            
        }while(opcao != 4) ;
        
    }
}
