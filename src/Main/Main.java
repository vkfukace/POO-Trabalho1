package Main;

import java.util.Scanner;

import Controle.Estoque;
import Controle.RecursosMateriais;

public class Main {
    //fazer variaves de estoque em cada recursoMaterial para consultar antes de fazer requisao
    //se tiver estoque requisao eh feita
    //se nao espera o mes virar para repor o estoque
    public static void menu2() {
        System.out.println("\n======== MENU ========");
        System.out.println("1 - Requisicao de Recursos Materiais");
        System.out.println("2 - Atualizar Recursos Materiais");
        System.out.println("3 - Remover Recursos Materiais");
        System.out.println("4 - Mostrar Estoque Recursos Materiais");
        System.out.println("5 - Buscar Recursos Materiais");
        System.out.println("6 - Cadastrar Recursos Humanos");
        System.out.println("7 - Atualizar Recursos Humanos");
        System.out.println("8 - Remover Recursos Humanos");
        System.out.println("9 - Mostrar Estoque Recursos Humanos");
        System.out.println("10 - Buscar Recursos Humanos");
        System.out.println("11 - Preset de quantidade de recursos para distribuicao no começo do mes");
        System.out.println("12 - Relatorio que vai ser gerado automaticamente no fim da seman");
        /*System.out.println("5 - Atualizar Recursos Humanos");
        System.out.println("6 - Remover Recursos Humanos"); */
        System.out.println("6 - Sair");
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
    public static void menubuscaRecursoMaterial(){
        System.out.println("1 - Buscar Material Didatico");
        System.out.println("2 - Buscar Material Escolar");
        System.out.println("3 - Buscar Material Limpeza");
    }

    public static String buscaMaterialDidatico(RecursosMateriais aux) {
        return aux.getMateriaisDidaticos().toString() ;
    }
    public static String buscaMaterialEscolar(RecursosMateriais aux) {
        return aux.getMateriaisEscolares().toString() ;
    }
    public static String buscaMaterialLimpeza(RecursosMateriais aux) {
        return aux.getMateriaisLimpeza().toString() ;
    }


    public static boolean cadastrarMaterialDidatico(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ", "Quantidade de Apagador: ", "Quantidade de Pincel: "};
        int[] listaAux = new int[5] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AdicionarRecusoMaterialDidatico(listaAux[0], listaAux[1], listaAux[2], listaAux[3], listaAux[4]);
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
        return aux.AtualizarRecusoMaterialDidatico(listaAux[0], listaAux[1], listaAux[2], listaAux[3], listaAux[4]);
        
        
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
        return aux.RemoverRecusoMaterialDidatico(listaAux[0], listaAux[1], listaAux[2], listaAux[3], listaAux[4]);    
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

                case 1: //cadastrar recursos materiais
                
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
                case 2: //atualizar recursos materiais
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
                case 3: //remover recursos materiais
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
                case 4: //relatorio

                    System.out.println(estoque.estoqueRecursosMateriais());
                    break;
                
                case 5: //busca
                    menubuscaRecursoMaterial();
                    op = Integer.parseInt(input.nextLine()) ;
                    switch(op){
                        case 1://buscar material didatico
                            System.out.println(buscaMaterialDidatico(estoque.getRecursosMateriais()));
                            break;
                        case 2://buscar material Escolar
                            System.out.println(buscaMaterialEscolar(estoque.getRecursosMateriais()));
                            break;
                        case 3://buscar material Limpeza
                            System.out.println(buscaMaterialLimpeza(estoque.getRecursosMateriais()));
                            break;
                    }
                    break;
            }
            
        }while(opcao != 6) ;
        
    }
}
