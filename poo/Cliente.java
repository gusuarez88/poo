import java.util.*;

public class Cliente {
    private String nome;
    private ArrayList<Casa> casas;

    public Cliente( String nome ) {
        this.nome = nome;
        casas = new ArrayList<Casa>();
    }

    public String getNome() {
        return nome;
    }

    public void comprarCasa( Casa c ) {
        casas.add( c );
    }

    public ArrayList<Casa> consultarCasasCompradas() {
        return casas;
    }
}
