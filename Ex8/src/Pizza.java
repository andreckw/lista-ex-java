import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nome;
    private float valor;
    private List<String> ingredientes = new ArrayList<String>();

    Pizza (String nm, float vlr, String[] igs) {
        nome = nm;
        valor = vlr;
        for (int i = 0; i < igs.length; i++) {
            ingredientes.add(igs[i]);
        }
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }

    public String getIngredientes() {
        return ingredientes.toString();
    }
}
