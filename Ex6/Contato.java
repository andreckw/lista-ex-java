package Ex6;

public class Contato {
    private String nome;
    private String telefone;

    Contato (String nm, String tf) {
        nome = nm;
        telefone = tf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}
