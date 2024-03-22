package Ex3;

public class ContaBancaria {
    
    public int numeroconta;
    public String titular;
    public float saldo;

    ContaBancaria(int numconta, String nome) {
        numeroconta = numconta;
        titular = nome;
    }

    public void depositar(float valor) {
        saldo += valor;
        retornarSaldo();
    }

    public void sacar(float valor) {
        saldo -= valor;
        retornarSaldo();
    }

    public void retornarSaldo() {
        System.out.println("Saldo atual: "+saldo);
    }
}
