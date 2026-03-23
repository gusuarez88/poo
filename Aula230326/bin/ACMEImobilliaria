import java.util.ArrayList;
import java.util.Scanner;

public class ACMEImobilliaria {
    private Condominio condominio;
    private Scanner entrada;
    private Clientela clientela;

    public ACMEImobilliaria() {
        condominio = new Condominio();
        entrada = new Scanner(System.in);
        clientela = new Clientela(); 
    }

    public void executar() {
        System.out.println("Aplicacao ACMEImobiliaria!");
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("========================");
            menu();
            System.out.print("Digite a opcao desejada: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            System.out.println("========================");

            switch(opcao) {
                case 0:
                    break;
                case 1:
                    cadastrarCasa();
                    break;
                case 2:
                    consultarCasaPorEndereco();
                    break;
                case 3:
                    listarTodasCasas();
                    break;
                case 4:
                    cadastraCliente();
                    break;
                case 5:
                    comprarCasa();
                    break;
                case 6:
                    listaCasasClientes();
                    break;
                case 99:
                    easterEgg();
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }
    }

    private void menu() {
        System.out.println("Menu de opcoes");
        System.out.println("[0] Sair");
        System.out.println("[1] Cadastrar uma casa");
        System.out.println("[2] Consultar uma casa");
        System.out.println("[3] Listar todas as casas");
        System.out.println("[4] Cadastrar novo cliente");
        System.out.println("[5] Comprar uma nova casa");
        System.out.println("[6] Listar todas as casas de um cliente");
    }

    private void cadastrarCasa() {
        System.out.print("Digite o tamanho: ");
        int tamanho = entrada.nextInt();

        System.out.print("Digite o valor: ");
        double valor = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Digite o endereco: ");
        String endereco = entrada.nextLine();

        Casa casa = new Casa(tamanho, valor, endereco);

        if (condominio.cadastrarCasa(casa))
            System.out.println("Casa cadastrada!");
        else
            System.out.println("Erro no cadastramento!");
    }

    private void consultarCasaPorEndereco() {
        System.out.print("Digite o endereco: ");
        String endereco = entrada.nextLine();

        Casa casa = condominio.consultarCasaEndereco(endereco);

        if (casa == null)
            System.out.println("Casa nao encontrada.");
        else {
            System.out.println("Tamanho: " + casa.getTamanho());
            System.out.println("Valor: " + casa.getValor());
            System.out.println("Endereco: " + casa.getEndereco());
        }
    }

    private void listarTodasCasas() {
        ArrayList<Casa> listaCasas = condominio.consultarTodasCasas();

        if (listaCasas.isEmpty()) {
            System.out.println("Nenhuma casa cadastrada.");
        } else {
            for (Casa casa : listaCasas) {
                System.out.println("Tamanho: " + casa.getTamanho());
                System.out.println("Valor: " + casa.getValor());
                System.out.println("Endereco: " + casa.getEndereco());
                System.out.println("--------------------------");
            }
        }
    }

    private void cadastraCliente() {
        System.out.print("Qual o nome do cliente? ");
        String nomeCliente = entrada.nextLine();

        Cliente c1 = new Cliente(nomeCliente);
        clientela.cadastrarCliente(c1);

        System.out.println("Cliente cadastrado!");
    }

    private void comprarCasa() {
        System.out.print("Qual o nome do cliente? ");
        String nomeCliente = entrada.nextLine();

        System.out.print("Qual o endereco da casa? ");
        String enderecoCasa = entrada.nextLine();

        Casa casa = condominio.consultarCasaEndereco(enderecoCasa);
        Cliente cliente = clientela.consultarClientePorNome(nomeCliente);

        if (cliente != null && casa != null) {
            cliente.comprarCasa(casa);
            System.out.println("Compra realizada!");
        } else {
            System.out.println("Erro na compra!");
        }
    }

    private void listaCasasClientes() {
        System.out.print("Qual o nome do cliente: ");
        String nomeCliente = entrada.nextLine();

        Cliente cliente = clientela.consultarClientePorNome(nomeCliente);

        if (cliente != null) {
            ArrayList<Casa> casas = cliente.consultarCasasCompradas();

            if (casas.isEmpty()) {
                System.out.println("Cliente nao possui casas.");
            } else {
                System.out.println( "Casas de " + nomeCliente );
                for (Casa casa : casas) {
                    System.out.println("Tamanho: " + casa.getTamanho());
                    System.out.println("Valor: " + casa.getValor());
                    System.out.println("Endereco: " + casa.getEndereco());
                    System.out.println("----------------------");
                }
            }
        } else {
            System.out.println("Cliente nao encontrado.");
        }
    }

    private void easterEgg() {
        System.out.println("Easter egg!!!");
        condominio.cadastrarCasa(new Casa(111, 111.11, "Rua Um"));
        condominio.cadastrarCasa(new Casa(222, 222.22, "Rua Dois"));
        condominio.cadastrarCasa(new Casa(333, 333.33, "Rua Tres"));
        condominio.cadastrarCasa(new Casa(444, 444.44, "Rua Quatro"));
    }
}