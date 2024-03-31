public class Produto {
    private int qtd_estoque;
    private float preco;
    private String nome;
    private String codigo;

    Produto () {

    }

    public void setNome(String nm) {
        nome = nm;
    }

    public String getNome() {
        return nome;
    }

    public void setCod(String cod) {
        codigo = cod;
    }

    public String getCod() {
        return codigo;
    }

    public void setPreco(float pc) {
        preco = pc;
    }

    public float getPreco() {
        return preco;
    }

    public void setEstoque(int qtd) {
        qtd_estoque = qtd;
    }

    public int getEstoque() {
        return qtd_estoque;
    }
}
