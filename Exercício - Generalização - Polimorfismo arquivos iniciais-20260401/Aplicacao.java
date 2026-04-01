import java.util.Scanner;

public class Aplicacao {
    private Equipe equipe;
    private Scanner entrada;

    public Aplicacao() {
        equipe = new Equipe();
        entrada = new Scanner(System.in);
    }

    public void inicializa() {
        Gerente g;
        g = new Gerente("Maria",1111.11,11.11,"Mobile",1.1);
        equipe.addFuncionario(g);
        g = new Gerente("Pedro",222.22,22.22,"Web",2.2);
        equipe.addFuncionario(g);
    }

    public void executa() {
        int opcao = 0;
        do {
            System.out.println("===================");
            System.out.println("Opcoes:");
            System.out.println("[0] Sair");
            System.out.println("[1] Consulta por nome");
            System.out.print("Digite a opcao desejada: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            switch(opcao) {
                case 1:
                    consultaPorNome();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while(opcao != 0);
    }

    private void consultaPorNome() {
        System.out.println("===================");
        System.out.print("Digite o nome do funcionario: ");
        String nome = entrada.nextLine();
        Funcionario f = equipe.pesquisaNome(nome);
        if(f == null)
            System.out.println("Erro. Nao ha funcionario com este nome");
        else {
            System.out.println(f.geraDescricao());
        }
    }

}
