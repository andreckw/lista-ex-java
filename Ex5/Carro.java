package Ex5;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade_atual;

    Carro (String mr, String md, int ano, float va) {
        marca = mr;
        modelo = md;
        this.ano = ano;
        velocidade_atual = va;
    }

    public void acelerar(float velocidade) {
        velocidade_atual += velocidade;
    }

    public void frear(float velocidade) {
        velocidade_atual -= velocidade;
    }

    public void imprimir() {
        System.out.println("~--~--~--~--~--~--~--~--~--~--~");
        System.out.println("~-- Marca: "+marca);
        System.out.println("~-- Modelo: "+modelo);
        System.out.println("~-- Ano: "+ano);
        System.out.println("~-- Velocidade atual: "+velocidade_atual);
        System.out.println("~--~--~--~--~--~--~--~--~--~--~");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public float getVelocidadeAtual() {
        return velocidade_atual;
    }
}
