import java.util.ArrayList;

public class Condominio {
    private ArrayList<Casa> casas;


    public Condominio() {
        casas = new ArrayList<Casa>();
    }

    // Operacao "C" - criar/cadastrar
    public boolean cadastrarCasa(Casa c) {
        return casas.add(c);
    }

    // Operacao "R" - consultar
    public Casa consultarCasaEndereco(String endereco) {
        for(int i=0; i<casas.size();i++) {
            Casa aux = casas.get(i);
            if(aux.getEndereco().equals(endereco))
                return aux;
        }
        return null;
    }

    /**
     * R - Retrieve
     * Consulta todas as casas cadastradas
     * @return lista auxiliar com casas cadastradas
     */
    public ArrayList<Casa> consultarTodasCasas() {
        // ArrayList auxiliar para o retorno
        ArrayList<Casa> aux = new ArrayList<>();
        for(int i=0; i< casas.size(); i++) {
            Casa casa = casas.get(i);
            aux.add(casa);
        }
        return aux;
    }
}
