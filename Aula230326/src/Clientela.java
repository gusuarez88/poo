import java.util.ArrayList;

public class Clientela {
    private ArrayList<Cliente> clientela;

    public Clientela() {
        clientela = new ArrayList<Cliente>();
    }

    public boolean cadastrarCliente( Cliente cliente ) {
        for( Cliente aux : clientela ) {
            if ( aux.getNome().equals( cliente.getNome() ) ) {
                return false;
            }
        }

        clientela.add( cliente );
        return true;
    }

    public Cliente consultarClientePorNome( String nome ) {
        for ( Cliente aux : clientela ) {
            if ( aux.getNome().equals( nome ) ) {
                return aux;
            }
        }
        return null;
    }
}
