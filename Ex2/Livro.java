package Ex2;

public class Livro {

    public String titulo;
    public String autor;
    public int ano;


    Livro(String tit, String autor, int ano) {
        titulo = tit;
        this.autor = autor;
        this.ano = ano;
    }

    public void exibirInfo() {
        System.out.println("Livro: " + titulo + " Autor:" + autor + "Ano: " + ano);
    }
}
