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
        System.out.println("11 - Requisicao de Recursos Materiais");
        System.out.println("12 - Relatorio que vai ser gerado automaticamente no fim da seman");
        System.out.println("13 - Sair");
        
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

        do{
            faux.menuCadastroRecursoHumanoInicial();
            opcao = Integer.parseInt(input.nextLine());
            switch(opcao){
                case 1://cadastrar professores
                    if(!faux.cadastrarProfessor(estoque.getRecursosHumanos()))
                        System.out.println("voce digitou algo errado, professor nao cadastrado");
                    break;
                case 2://cadastrar Alunos
                    if(!faux.cadastrarAluno(estoque.getRecursosHumanos()))
                        System.out.println("voce digitou algo errado, aluno nao cadastrado");
                    break;
                case 3://cadastrar Instrutor
                    if(!faux.cadastrarInstrutor(estoque.getRecursosHumanos()))
                        System.out.println("voce digitou algo errado, instrutor nao cadastrado");
                    break;
                case 4://cadastrar Monitor
                    if(!faux.cadastrarMonitor(estoque.getRecursosHumanos()))
                        System.out.println("voce digitou algo errado, monitor nao cadastrado");
                    break;
                case 5://cadastrar Cozinheiro
                    if(!faux.cadastrarCozinheiro(estoque.getRecursosHumanos()))
                        System.out.println("voce digitou algo errado, cozinheiro nao cadastrado");
                    break;
                case 6://cadastrar Servente
                    if(!faux.cadastrarServente(estoque.getRecursosHumanos()))
                        System.out.println("voce digitou algo errado, servente nao cadastrado");
                    break;
            }
        }while(opcao!=7 );
        
        faux.menuEscolhaDeEstouque();
        int aux = Integer.parseInt(input.nextLine());

        if(aux == 2){
            System.out.println("Quantidade: ");
            int qtd ;
            do{ 
                qtd = Integer.parseInt(input.nextLine());
                if(qtd>0){
                    
                    estoque.getRecursosMateriais().AtualizarRecusoMaterialDidatico(qtd,qtd,qtd,qtd,qtd) ;
                    estoque.getRecursosMateriais().AtualizarRecusoMaterialEscolar(qtd,qtd,qtd);
                    estoque.getRecursosMateriais().AtualizarRecusoMaterialLimpeza(qtd,qtd,qtd,qtd);
                }
            }while(qtd <=0 ) ;

                
            
        }else{
            menuInicial(estoque, faux);
        }
        
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
                case 4: //estoque recursos materiais

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
                
                case 6://cadastrar recurso humano
                    faux.menuCadastroRecursoHumano();
                    op = Integer.parseInt(input.nextLine()) ;
                    switch(op){
                        case 1 ://professor
                            if(!faux.cadastrarProfessor(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado professor nao cadastrado");
                            break;
                        case 2 ://instrutor
                            if(!faux.cadastrarInstrutor(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado instrutor nao cadastrado ");
                            break;
                        case 3 ://alunos
                            if(!faux.cadastrarAluno(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado aluno nao cadastrado");
                            break;
                        case 4 ://monitores
                            if(!faux.cadastrarMonitor(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado monitor nao cadastrado");
                            break;
                        case 5 ://cozinheiros
                            if(!faux.cadastrarCozinheiro(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado cozinheiro nao cadastrado");
                            break;
                        case 6 ://servente
                            if(!faux.cadastrarServente(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado servente nao cadastrado");
                            break;
                    }
                    break;
                case 7://atualizar recurso humano
                    faux.menuAtulizarRecursoHumano();
                    op = Integer.parseInt(input.nextLine()) ;
                    switch(op){
                        case 1 ://atualizar professor
                            if(!faux.atualizarProfessor(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado professor nao encontrado");
                            break;
                        case 2 ://atualizar instrutor
                            if(!faux.atualizarInstrutor(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado instrutor nao encontrado ");
                            break;
                        case 3 ://atualizar alunos
                            if(!faux.atualizarAluno(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado aluno nao encontrado");
                            break;
                        case 4 ://atualizar monitores
                            if(!faux.atualizarMonitor(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado monitor nao encontrado");
                            break;
                        case 5 ://atualizar cozinheiros
                            if(!faux.atualizarCozinheiro(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado cozinheiro nao encontrado");
                            break;
                        case 6 ://atualizar servente
                            if(!faux.atualizarServente(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado servente nao encontrado");
                            break;
                    }
                    break;
                case 8://remover recurso humano
                    faux.menuRemoverRecursoHumano();
                    op = Integer.parseInt(input.nextLine()) ;
                    switch(op){
                        case 1 ://remover professor
                            if(!faux.removerProfessor(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado professor nao removido");
                            break;
                        case 2 ://remover instrutor
                            if(!faux.removerInstrutor(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado instrutor nao removido ");
                            break;
                        case 3 ://remover alunos
                            if(!faux.removerAluno(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado aluno nao removido");
                            break;
                        case 4 ://remover monitores
                            if(!faux.removerMonitor(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado monitor nao removido");
                            break;
                        case 5 ://remover cozinheiros
                            if(!faux.removerCozinheiro(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado cozinheiro nao removido");
                            break;
                        case 6 ://remover servente
                            if(!faux.removerServente(estoque.getRecursosHumanos()))
                                System.out.println("Algo foi digitado errado servente nao removido");
                            break;
                    }
                    break;
                
                case 9: //mostrar recursos humanos
                    estoque.getRecursosHumanos().printRH();
                    break ;
                
                case 10://buscar recurso humano
                    faux.menubuscaRecursoHumanos();
                    op = Integer.parseInt(input.nextLine()) ;
                    switch(op){
                        case 1 ://buscar professor
                            
                            faux.buscaProfessores(estoque.getRecursosHumanos());
                            break;
                        case 2 ://buscar instrutor
                            faux.buscaInstrutores(estoque.getRecursosHumanos());
                            break;
                        case 3 ://buscar alunos
                            
                            faux.buscaAlunos(estoque.getRecursosHumanos());
                            break;
                        case 4 ://buscar monitores
                            
                            faux.buscaMonitores(estoque.getRecursosHumanos());
                            break;
                        case 5 ://buscar cozinheiros
                            
                            faux.buscaCozinheiro(estoque.getRecursosHumanos());
                            break;
                        case 6 ://buscar servente
                            
                            faux.buscaServente(estoque.getRecursosHumanos());
                            break;
                    }
                    break;
                
                case 11: //requisicao
                    faux.menuRh();
                    op = Integer.parseInt(input.nextLine()) ;
                    String rg;
                    switch(op){
                        case 1://professor matDidatico
                            faux.requisicaoMatDidatico("professor", estoque.getRecursosHumanos(), estoque.getRecursosMateriais());
                            break;
                        case 2://aluno
                            faux.requisicaoMatEscolar("aluno", estoque.getRecursosHumanos(), estoque.getRecursosMateriais());
                            break;
                        case 3://instrutor
                            faux.requisicaoMatDidatico("instrutor", estoque.getRecursosHumanos(), estoque.getRecursosMateriais());
                            break;
                        case 4://monitores
                            faux.requisicaoMatDidatico("monitores", estoque.getRecursosHumanos(), estoque.getRecursosMateriais());
                            break;
                        case 5://cozinheiros
                            faux.requisicaoMatLimpeza("cozinheiro", estoque.getRecursosHumanos(), estoque.getRecursosMateriais());
                            break;
                        case 6://serventes
                            faux.requisicaoMatLimpeza("servente", estoque.getRecursosHumanos(), estoque.getRecursosMateriais());
                            break;
                    }
                    break;
                
                case 12://relatorio completo
                    System.out.println("Relacao do estoque e recursos humanos");
                    faux.buscaProfessores(estoque.getRecursosHumanos());
                    faux.buscaInstrutores(estoque.getRecursosHumanos());
                    faux.buscaAlunos(estoque.getRecursosHumanos());
                    faux.buscaMonitores(estoque.getRecursosHumanos());
                    faux.buscaCozinheiro(estoque.getRecursosHumanos());
                    faux.buscaServente(estoque.getRecursosHumanos());
                    break;
            
            }
            
        }while(opcao !=13) ;
        
    }
}
