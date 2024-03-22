package Ex4;

public class Jogador {
    private String nome;
    private float pontuacao;
    private int nivel;

    Jogador () {

    }

    public void setNome(String nm) {
        nome = nm;
    }

    public String getNome() {
        return nome;
    }

    public void setPontuacao(Float ptc) {
        pontuacao = ptc;
    }

    public float getPontuacao() {
        return pontuacao;
    }

    public void setNivel(int lv) {
        nivel = lv;
    }

    public int getNivel() {
        return nivel;
    }

    public void imprimir() {
        System.out.println("~--~--~--~--~--~--~--~--~--~--");
        System.out.println("~-- Nome: "+ nome);
        System.out.println("~-- Nivel: "+ nivel);
        System.out.println("~-- Pontuacao: "+ pontuacao);
        System.out.println("~--~--~--~--~--~--~--~--~--~--");
    }
}
