package Main;
import Controle.*;
import java.util.Scanner;
public class FuncoesAux {


    public FuncoesAux() {
    }

    public  void menuCadastroRecursoMaterial(){
        System.out.println("1 - Cadastrar Material Didatico");
        System.out.println("2 - Cadastrar Material Escolar");
        System.out.println("3 - Cadastrar Material Limpeza");
    }
    public  void menuAtualizarRecursoMaterial(){
        System.out.println("1 - Atualizar Material Didatico");
        System.out.println("2 - Atualizar Material Escolar");
        System.out.println("3 - Atualizar Material Limpeza");
    }
    public  void menuRemoverRecursoMaterial(){
        System.out.println("1 - Remover Material Didatico");
        System.out.println("2 - Remover Material Escolar");
        System.out.println("3 - Remover Material Limpeza");
    }
    public  void menubuscaRecursoMaterial(){
        System.out.println("1 - Buscar Material Didatico");
        System.out.println("2 - Buscar Material Escolar");
        System.out.println("3 - Buscar Material Limpeza");
    }

    public  String buscaMaterialDidatico(RecursosMateriais aux) {
        return aux.getMateriaisDidaticos().toString() ;
    }
    public  String buscaMaterialEscolar(RecursosMateriais aux) {
        return aux.getMateriaisEscolares().toString() ;
    }
    public  String buscaMaterialLimpeza(RecursosMateriais aux) {
        return aux.getMateriaisLimpeza().toString() ;
    }


    public  boolean cadastrarMaterialDidatico(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ", "Quantidade de Apagador: ", "Quantidade de Pincel: "};
        int[] listaAux = new int[5] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AdicionarRecusoMaterialDidatico(listaAux[0], listaAux[1], listaAux[2], listaAux[3], listaAux[4]);
    }
    public  boolean cadastrarMaterialEscolar(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: "};
        int[] listaAux = new int[3] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AdicionarRecusoMaterialEscolar(listaAux[0], listaAux[1], listaAux[2]);
        
        
    }
    public  boolean cadastrarMaterialLimpeza(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Alvejante: ", "Quantidade de Sabao em po: ", "Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: "};
        int[] listaAux = new int[4] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AdicionarRecusoMaterialLimpeza(listaAux[0], listaAux[1], listaAux[2], listaAux[3]);
        
    }

    public  boolean atualizarMaterialDidatico(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ", "Quantidade de Apagador: ", "Quantidade de Pincel: "};
        int[] listaAux = new int[5] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AtualizarRecusoMaterialDidatico(listaAux[0], listaAux[1], listaAux[2], listaAux[3], listaAux[4]);
        
        
    }
    public  boolean atualizarMaterialEscolar(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: "};
        int[] listaAux = new int[3] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AtualizarRecusoMaterialEscolar(listaAux[0], listaAux[1], listaAux[2]);
        
        
    }
    public  boolean atualizarMaterialLimpeza(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Quantidade de Alvejante: ", "Quantidade de Sabao em po: ", "Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: "};
        int[] listaAux = new int[4] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AtualizarRecusoMaterialLimpeza(listaAux[0], listaAux[1], listaAux[2], listaAux[3]);
        
    
    }

    public  boolean removerMaterialDidatico(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ", "Quantidade de Apagador: ", "Quantidade de Pincel: "};
        int[] listaAux = new int[5] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.RemoverRecusoMaterialDidatico(listaAux[0], listaAux[1], listaAux[2], listaAux[3], listaAux[4]);    
    }
    public  boolean removerMaterialEscolar(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: "};
        int[] listaAux = new int[3] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.RemoverRecusoMaterialEscolar(listaAux[0], listaAux[1], listaAux[2]);
    
    }    
    public  boolean removerMaterialLimpeza(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
       
        String[] listaNomes = {"Quantidade de Alvejante: ", "Quantidade de Sabao em po: ", "Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: "};
        int[] listaAux = new int[4] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.RemoverRecusoMaterialLimpeza(listaAux[0], listaAux[1], listaAux[2], listaAux[3]);
    
    }

}
