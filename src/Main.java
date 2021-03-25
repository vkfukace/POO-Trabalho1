import java.util.Scanner;

public class Principal {
    public static void menu() {
        System.out.println("\n======== MENU ========");
        System.out.println("1 - Inserir Cliente");
        System.out.println("2 - Listar Clientes");
        System.out.println("3 - Sair");
        System.out.print("Insira a opcao: ");
    }

    public static void main(String[] args) {
        ArrayCliente lista = new ArrayCliente(1000);
        Scanner input = new Scanner(System.in);
        int opcao;

        menu();
        opcao = Integer.parseInt(input.nextLine()); // nextInt causava erros

        while (opcao != 3) {
            switch (opcao) {
            case 1:
                System.out.print("\nInsira o nome do cliente: ");
                String nome = input.nextLine();
                System.out.print("Insira o telefone do cliente: ");
                String fone = input.nextLine();
                System.out.print("Insira a renda do cliente: ");
                float renda = Float.parseFloat(input.nextLine());
                lista.insere(new Cliente(nome, fone, renda));
                break;
            case 2:
                System.out.println("\nLista de Clientes:");
                lista.listaClientes();
                break;
            default:
                System.out.println("\nOpcao Invalida!");
            }

            menu();
            opcao = Integer.parseInt(input.nextLine());
        }

        input.close();
    }
}
