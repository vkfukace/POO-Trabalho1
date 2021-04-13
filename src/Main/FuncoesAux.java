package Main;
import Controle.*;
import Entidades.RecursoHumano.Aluno;
import Entidades.RecursoHumano.Cozinheiro;
import Entidades.RecursoHumano.Instrutor;
import Entidades.RecursoHumano.Monitor;
import Entidades.RecursoHumano.Professor;
import Entidades.RecursoHumano.Servente;
import java.util.HashMap;

import java.util.Scanner;

public class FuncoesAux {


    public FuncoesAux() {
    }

    public void menuCadastroRecursoMaterial(){
        System.out.println("1 - Cadastrar Material Didatico");
        System.out.println("2 - Cadastrar Material Escolar");
        System.out.println("3 - Cadastrar Material Limpeza");
    }
    public void menuAtualizarRecursoMaterial(){
        System.out.println("1 - Atualizar Material Didatico");
        System.out.println("2 - Atualizar Material Escolar");
        System.out.println("3 - Atualizar Material Limpeza");
    }
    public void menuRemoverRecursoMaterial(){
        System.out.println("1 - Remover Material Didatico");
        System.out.println("2 - Remover Material Escolar");
        System.out.println("3 - Remover Material Limpeza");
    }
    public void menubuscaRecursoMaterial(){
        System.out.println("1 - Buscar Material Didatico");
        System.out.println("2 - Buscar Material Escolar");
        System.out.println("3 - Buscar Material Limpeza");
    }
    public void menubuscaRecursoHumanos(){
        System.out.println("1 - Buscar Professor");
        System.out.println("2 - Buscar Instrutor");
        System.out.println("3 - Buscar Aluno");
        System.out.println("4 - Buscar Monitor");
        System.out.println("5 - Buscar Cozinheiro");
        System.out.println("6 - Buscar Servente");
        
    }
    public void menuCadastroRecursoHumanoInicial(){
        System.out.println("Para inicializar o sistema, cadastre recursos humanos");
        System.out.println("1 - Cadastrar professores");
        System.out.println("2 - Cadastrar instrutores");
        System.out.println("3 - Cadastrar alunos");
        System.out.println("4 - Cadastrar monitores");
        System.out.println("5 - Cadastrar cozinheiros");
        System.out.println("6 - Cadastrar serventes");
        System.out.println("7 - Seguir execucao");
    
    }
    public void menuCadastroRecursoHumano(){
        
        System.out.println("1 - Cadastrar professores");
        System.out.println("2 - Cadastrar instrutores");
        System.out.println("3 - Cadastrar alunos");
        System.out.println("4 - Cadastrar monitores");
        System.out.println("5 - Cadastrar cozinheiros");
        System.out.println("6 - Cadastrar serventes");
 
    
    }
    public void menuAtulizarRecursoHumano(){
        System.out.println("1 - Atualizar professores");
        System.out.println("2 - Atualizar instrutores");
        System.out.println("3 - Atualizar alunos");
        System.out.println("4 - Atualizar monitores");
        System.out.println("5 - Atualizar cozinheiros");
        System.out.println("6 - Atualizar serventes");
    }
    public void menuRemoverRecursoHumano(){
        System.out.println("1 - Remover professores");
        System.out.println("2 - Remover instrutores");
        System.out.println("3 - Remover alunos");
        System.out.println("4 - Remover monitores");
        System.out.println("5 - Remover cozinheiros");
        System.out.println("6 - Remover serventes");
    }
    public void menuRequisicao(){
        System.out.println("1 - Requisicao de Material Didatico");
        System.out.println("2 - Requisicao de Material Escolar");
        System.out.println("3 - Requisicao de Material Limpeza");
    }
    public void menuRh(){
        System.out.println("1 - professores");
        System.out.println("2 - instrutores");
        System.out.println("3 - alunos");
        System.out.println("4 - monitores");
        System.out.println("5 - cozinheiros");
        System.out.println("6 - serventes");
    }
    public void menuEscolhaDeEstouque(){
        System.out.println("O sistema funciona com reposicao de estoque mensal");
        System.out.println("1 - Escolher separadamente a quantidade de cada recurso material");
        System.out.println("2 - Escolher de uma vez todos iguais");
    }


    public String buscaMaterialDidatico(RecursosMateriais aux) {
        return aux.getMateriaisDidaticos().toString() ;
    }
    public String buscaMaterialEscolar(RecursosMateriais aux) {
        return aux.getMateriaisEscolares().toString() ;
    }
    public String buscaMaterialLimpeza(RecursosMateriais aux) {
        return aux.getMateriaisLimpeza().toString() ;
    }
    public void buscaProfessores(RecursosHumanos aux){
        HashMap<String, Professor> professores = aux.getProfessores() ;
        for (String i : professores.keySet()) {
            System.out.println(professores.get(i).toString() + " " + professores.get(i).getMatDidatico().toString());
            
        }
    }
    public void buscaAlunos(RecursosHumanos aux){
        HashMap<String, Aluno> Aluno = aux.getAlunos() ;
        for (String i : Aluno.keySet()) {
            System.out.println(Aluno.get(i).toString() + " " + Aluno.get(i).getMatEscolar().toString());
            
        }
    }
    public void buscaInstrutores(RecursosHumanos aux){
        HashMap<String, Instrutor> instrutor = aux.getInstrutores() ;
        for (String i : instrutor.keySet()) {
            System.out.println(instrutor.get(i).toString()+" "+instrutor.get(i).getMatDidadico().toString());
            
        }
    }
    public void buscaMonitores(RecursosHumanos aux){
        HashMap<String, Monitor> monitore = aux.getMonitores() ;
        for (String i : monitore.keySet()) {
            System.out.println(monitore.get(i).toString()+" "+ monitore.get(i).getMatDidadico().toString() );
            
        }
    }
    public void buscaCozinheiro(RecursosHumanos aux){
        HashMap<String, Cozinheiro> cozinheiro = aux.getCozinheiros() ;
        for (String i : cozinheiro.keySet()) {
            System.out.println(cozinheiro.get(i).toString() + " "+cozinheiro.get(i).getMatLimpeza().toString() );
            
        }
    }
    public void buscaServente(RecursosHumanos aux){
        HashMap<String, Servente> servente = aux.getServentes() ;
        for (String i : servente.keySet()) {
            System.out.println(servente.get(i).toString() +" "+ servente.get(i).getMatLimpeza().toString());
            
        }

    }

    public boolean cadastrarProfessor(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.addProfessor(rg,nome,idade);
    }
    public boolean cadastrarAluno(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.addAluno(rg,nome,idade);
    }
    public boolean cadastrarInstrutor(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.addInstrutor(rg,nome,idade);
    }
    public boolean cadastrarMonitor(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.addMonitor(rg,nome,idade);
    }
    public boolean cadastrarCozinheiro(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.addCozinheiro(rg,nome,idade);
    }
    public boolean cadastrarServente(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.addServente(rg,nome,idade);
    }
    public boolean cadastrarMaterialDidatico(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ", "Quantidade de Apagador: ", "Quantidade de Pincel: "};
        int[] listaAux = new int[5] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AdicionarRecusoMaterialDidatico(listaAux[0], listaAux[1], listaAux[2], listaAux[3], listaAux[4]);
    }
    public boolean cadastrarMaterialEscolar(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: "};
        int[] listaAux = new int[3] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AdicionarRecusoMaterialEscolar(listaAux[0], listaAux[1], listaAux[2]);
        
        
    }
    public boolean cadastrarMaterialLimpeza(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Alvejante: ", "Quantidade de Sabao em po: ", "Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: "};
        int[] listaAux = new int[4] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AdicionarRecusoMaterialLimpeza(listaAux[0], listaAux[1], listaAux[2], listaAux[3]);
        
    }


    public boolean atualizarProfessor(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.alteraProfessor(rg,nome,idade);
    }
    public boolean atualizarAluno(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.alteraAluno(rg,nome,idade);
    }
    public boolean atualizarInstrutor(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.alteraInstrutor(rg,nome,idade);
    }
    public boolean atualizarMonitor(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.alteraMonitor(rg,nome,idade);
    }
    public boolean atualizarCozinheiro(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.alteraCozinheiro(rg,nome,idade);
    }
    public boolean atualizarServente(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.alteraServente(rg,nome,idade);
    }
    public boolean atualizarMaterialDidatico(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ", "Quantidade de Apagador: ", "Quantidade de Pincel: "};
        int[] listaAux = new int[5] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AtualizarRecusoMaterialDidatico(listaAux[0], listaAux[1], listaAux[2], listaAux[3], listaAux[4]);
        
        
    }
    public boolean atualizarMaterialEscolar(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: "};
        int[] listaAux = new int[3] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AtualizarRecusoMaterialEscolar(listaAux[0], listaAux[1], listaAux[2]);
        
        
    }
    public boolean atualizarMaterialLimpeza(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Quantidade de Alvejante: ", "Quantidade de Sabao em po: ", "Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: "};
        int[] listaAux = new int[4] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.AtualizarRecusoMaterialLimpeza(listaAux[0], listaAux[1], listaAux[2], listaAux[3]);
        
    
    }

    public boolean removerProfessor(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.removeProfessor(rg,nome,idade);
    }
    public boolean removerAluno(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.removeAluno(rg,nome,idade);
    }
    public boolean removerInstrutor(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.removeInstrutor(rg,nome,idade);
    }
    public boolean removerMonitor(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.removeMonitor(rg,nome,idade);
    }
    public boolean removerCozinheiro(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.removeCozinheiro(rg,nome,idade);
    }
    public boolean removerServente(RecursosHumanos aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Rg: ", "Nome: ", "Idade: "};
        String rg ;
        String nome ;
        int idade ;
        
        System.out.println("Rg:");
        rg = input.nextLine();
        System.out.println("Nome:");
        nome = input.nextLine();
        System.out.println("Idade:");
        idade = Integer.parseInt(input.nextLine());

        return aux.removeServente(rg,nome,idade);
    }
    public boolean removerMaterialDidatico(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        String[] listaNomes = {"Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ", "Quantidade de Apagador: ", "Quantidade de Pincel: "};
        int[] listaAux = new int[5] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.RemoverRecusoMaterialDidatico(listaAux[0], listaAux[1], listaAux[2], listaAux[3], listaAux[4]);    
    }
    public boolean removerMaterialEscolar(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
        
        String[] listaNomes = {"Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: "};
        int[] listaAux = new int[3] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.RemoverRecusoMaterialEscolar(listaAux[0], listaAux[1], listaAux[2]);
    
    }    
    public boolean removerMaterialLimpeza(RecursosMateriais aux){
        Scanner input = new Scanner(System.in) ;
       
        String[] listaNomes = {"Quantidade de Alvejante: ", "Quantidade de Sabao em po: ", "Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: "};
        int[] listaAux = new int[4] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }
        return aux.RemoverRecusoMaterialLimpeza(listaAux[0], listaAux[1], listaAux[2], listaAux[3]);
    
    }

    public String pegarRg(){
        Scanner input = new Scanner(System.in) ;
        String rg = input.nextLine();
        return rg ;
    }

    public void requisicaoMatDidatico(String rh, RecursosHumanos auxRh, RecursosMateriais auxMat){
        Scanner input = new Scanner(System.in) ;
        System.out.println("Rg do rh a receber a requisicao: ");
        String Rg = input.nextLine();
        
       
        String[] listaNomes = {"Quantidade de Livro: ", "Quantidade de Quadro: ", "Quantidade de Giz: ", "Quantidade de Apagador: ", "Quantidade de Pincel: "};
        int[] listaAux = new int[5] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }

        switch(rh){
            case "professor" :
                Professor profaux = auxRh.getProfessores().get(Rg) ;
                if(profaux != null){

                    if(auxMat.getMateriaisDidaticos().getLivro()>= listaAux[0]){
                        auxMat.getMateriaisDidaticos().remLivro(listaAux[0]);
                        profaux.getMatDidatico().addLivro(listaAux[0]);
                        System.out.println("Requisao concluida");
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisDidaticos().getQuadro()>= listaAux[1]){
                        auxMat.getMateriaisDidaticos().remQuadro(listaAux[1]);
                        profaux.getMatDidatico().addQuadro(listaAux[1]);
                        System.out.println("Requisao concluida");
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisDidaticos().getGiz()>= listaAux[2]){
                        auxMat.getMateriaisDidaticos().remGiz(listaAux[2]);
                        profaux.getMatDidatico().addGiz(listaAux[2]);
                        System.out.println("Requisao concluida");
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisDidaticos().getApagador()>= listaAux[3]){
                        auxMat.getMateriaisDidaticos().remApagador(listaAux[3]);
                        profaux.getMatDidatico().addApagador(listaAux[3]);
                        System.out.println("Requisao concluida");
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisDidaticos().getPincel()>= listaAux[4]){
                        auxMat.getMateriaisDidaticos().remPincel(listaAux[4]);
                        profaux.getMatDidatico().addPincel(listaAux[4]);
                        System.out.println("Requisao concluida");
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                }
                break ;
                
            case "instrutor" :
                Instrutor instaux = auxRh.getInstrutores().get(Rg) ;
                if(instaux != null){
                    if(auxMat.getMateriaisDidaticos().getApagador()>= listaAux[0]){
                        auxMat.getMateriaisDidaticos().remApagador(listaAux[0]);
                        instaux.getMatDidadico().addApagador(listaAux[0]);
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisDidaticos().getGiz()>= listaAux[0]){
                        auxMat.getMateriaisDidaticos().remGiz(listaAux[0]);
                        instaux.getMatDidadico().addGiz(listaAux[0]);
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisDidaticos().getLivro()>= listaAux[0]){
                        auxMat.getMateriaisDidaticos().remLivro(listaAux[0]);
                        instaux.getMatDidadico().addLivro(listaAux[0]);
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisDidaticos().getPincel()>= listaAux[0]){
                        auxMat.getMateriaisDidaticos().remPincel(listaAux[0]);
                        instaux.getMatDidadico().addPincel(listaAux[0]);
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisDidaticos().getQuadro()>= listaAux[0]){
                        auxMat.getMateriaisDidaticos().remQuadro(listaAux[0]);
                        instaux.getMatDidadico().addQuadro(listaAux[0]);
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }

                }
                break ;
                    
            case "monitor" :
                Instrutor moniaux = auxRh.getInstrutores().get(Rg) ;
                if(moniaux != null){
                    if(auxMat.getMateriaisDidaticos().getApagador()>= listaAux[0]){
                        auxMat.getMateriaisDidaticos().remApagador(listaAux[0]);
                        moniaux.getMatDidadico().addApagador(listaAux[0]);
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisDidaticos().getGiz()>= listaAux[0]){
                        auxMat.getMateriaisDidaticos().remGiz(listaAux[0]);
                        moniaux.getMatDidadico().addGiz(listaAux[0]);
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisDidaticos().getLivro()>= listaAux[0]){
                        auxMat.getMateriaisDidaticos().remLivro(listaAux[0]);
                        moniaux.getMatDidadico().addLivro(listaAux[0]);
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisDidaticos().getPincel()>= listaAux[0]){
                        auxMat.getMateriaisDidaticos().remPincel(listaAux[0]);
                        moniaux.getMatDidadico().addPincel(listaAux[0]);
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisDidaticos().getQuadro()>= listaAux[0]){
                        auxMat.getMateriaisDidaticos().remQuadro(listaAux[0]);
                        moniaux.getMatDidadico().addQuadro(listaAux[0]);
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }

                }
            break ;
            }
    
    }
    public void requisicaoMatEscolar(String rh, RecursosHumanos auxRh, RecursosMateriais auxMat){
        Scanner input = new Scanner(System.in) ;
        System.out.println("Rg do rh a receber a requisicao: ");
        String Rg = input.nextLine();

        String[] listaNomes = {"Quantidade de Lapis: ", "Quantidade de Caderno: ", "Quantidade de Caneta: "};
        int[] listaAux = new int[3] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }

        switch(rh){
            case "aluno" :
                Aluno aluaux = auxRh.getAlunos().get(Rg) ;
                if(aluaux != null){

                    if(auxMat.getMateriaisEscolares().getLapis()>= listaAux[0]){
                        auxMat.getMateriaisEscolares().remLapis(listaAux[0]);
                        aluaux.getMatEscolar().addLapis(listaAux[0]);
                        System.out.println("Requisao concluida");
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisEscolares().getCaderno()>= listaAux[1]){
                        auxMat.getMateriaisEscolares().remCaderno(listaAux[1]);
                        aluaux.getMatEscolar().addCaderno(listaAux[1]);
                        System.out.println("Requisao concluida");
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisEscolares().getCaneta()>= listaAux[2]){
                        auxMat.getMateriaisEscolares().remCaneta(listaAux[2]);
                        aluaux.getMatEscolar().addCaneta(listaAux[2]);
                        System.out.println("Requisao concluida");
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                }
            break ;
                
        }
    
    }
    public void requisicaoMatLimpeza(String rh, RecursosHumanos auxRh, RecursosMateriais auxMat){
        Scanner input = new Scanner(System.in) ;
        System.out.println("Rg do rh a receber a requisicao: ");
        String Rg = input.nextLine();

        String[] listaNomes = {"Quantidade de Alvejante: ", "Quantidade de Sabao em po: ", "Quantidade de Agua sanitaria: ", "Quantidade de Sabao barra: "};
        int[] listaAux = new int[4] ; 
        for (int i = 0; i < listaAux.length; i++) {
            System.out.println(listaNomes[i]);
            listaAux[i] = Integer.parseInt(input.nextLine());
        }

        switch(rh){
            case "servente" :
                Servente servaux = auxRh.getServentes().get(Rg) ;
                if(servaux != null){

                    if(auxMat.getMateriaisLimpeza().getAlvejante()>= listaAux[0]){
                        auxMat.getMateriaisLimpeza().remAlvejante(listaAux[0]);
                        servaux.getMatLimpeza().addAlvejante(listaAux[0]);
                        System.out.println("Requisao concluida");
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisLimpeza().getSabaoPo()>= listaAux[1]){
                        auxMat.getMateriaisLimpeza().remSabaoPo(listaAux[1]);
                        servaux.getMatLimpeza().addSabaoPo(listaAux[1]);
                        System.out.println("Requisao concluida");
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisLimpeza().getAguaSanitaria()>= listaAux[2]){
                        auxMat.getMateriaisLimpeza().remAguaSanitaria(listaAux[2]);
                        servaux.getMatLimpeza().addAguaSanitaria(listaAux[2]);
                        System.out.println("Requisao concluida");
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisLimpeza().getSabaoBarra()>= listaAux[3]){
                        auxMat.getMateriaisLimpeza().remSabaoBarra(listaAux[3]);
                        servaux.getMatLimpeza().addSabaoBarra(listaAux[3]);
                        System.out.println("Requisao concluida");
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                }
            break ;
            case "cozinheiro" :
                Cozinheiro cozaux = auxRh.getCozinheiros().get(Rg) ;
                if(cozaux != null){

                    if(auxMat.getMateriaisLimpeza().getAlvejante()>= listaAux[0]){
                        auxMat.getMateriaisLimpeza().remAlvejante(listaAux[0]);
                        cozaux.getMatLimpeza().addAlvejante(listaAux[0]);
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisLimpeza().getSabaoPo()>= listaAux[0]){
                        auxMat.getMateriaisLimpeza().remSabaoPo(listaAux[0]);
                        cozaux.getMatLimpeza().addSabaoPo(listaAux[0]);
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisLimpeza().getAguaSanitaria()>= listaAux[0]){
                        auxMat.getMateriaisLimpeza().remAguaSanitaria(listaAux[0]);
                        cozaux.getMatLimpeza().addAguaSanitaria(listaAux[0]);
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                    if(auxMat.getMateriaisLimpeza().getSabaoBarra()>= listaAux[0]){
                        auxMat.getMateriaisLimpeza().remSabaoBarra(listaAux[0]);
                        cozaux.getMatLimpeza().addSabaoBarra(listaAux[0]);
                    }else{
                        System.out.println("Estoque insuficiente, espere reposicao mensal");
                    }
                }
            break ;
                
        }
    
    }}


    



