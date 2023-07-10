package questao02;

import java.util.ArrayList;

public class Produtor extends Usuario{
    private String nomeCanal;
    private ArrayList<String> categorias;

    public String getNomeCanal() {
        return nomeCanal;
    }

    public ArrayList<String> getCategorias() {
        return categorias;
    }

    public void setCategorias(ArrayList<String> categorias) {
        this.categorias = categorias;
    }

    public void setNomeCanal(String nomeCanal) {
        this.nomeCanal = nomeCanal;
    }
}
