package Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<ContaBancaria> contas = new ArrayList<ContaBancaria>();
        int escolha = 0;
        float valor;
        int achado = -1;
        int busc_conta;

        do {
            System.out.println("(1) Adicionar conta");
            System.out.println("(2) Listar contas");
            System.out.println("(3) Depositar a uma conta");
            System.out.println("(4) Sacar de uma conta");
            escolha = Integer.parseInt(input.nextLine());
            switch (escolha) {
                case 1:
                    String titular;
                    int conta = contas.size()+1;
                    System.out.print("Digite o nome do titular: ");
                    titular = input.nextLine();
                    ContaBancaria conta_new = new ContaBancaria(conta, titular);
                    contas.add(conta_new);
                    break;
                case 2:
                    for (int i = 0; i < contas.size(); i++) {
                        ContaBancaria conta_get = contas.get(i);
                        System.out.println("Num_Conta: " + conta_get.numeroconta + " - Titular: " + conta_get.titular + " - Saldo: "+ conta_get.saldo);
                    }
                    break;
                case 3:
                    System.out.print("Digite qual conta sera depositada: ");
                    busc_conta = Integer.parseInt(input.nextLine());
                    System.out.print("Digite o valor a ser depositada: ");
                    valor = Float.parseFloat(input.nextLine());
                    for (int i = 0; i < contas.size(); i++) {
                        ContaBancaria conta_get = contas.get(i);
                        if (conta_get.numeroconta == busc_conta) {
                            achado = i;
                            break;
                        }
                    }
                    if (achado != -1) {
                        ContaBancaria conta_get = contas.get(achado);
                        conta_get.depositar(valor);
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    break;
                case 4:
                    System.out.print("Digite qual conta sera sacado: ");
                    busc_conta = Integer.parseInt(input.nextLine());
                    System.out.print("Digite o valor a ser sacado: ");
                    valor = Float.parseFloat(input.nextLine());
                    achado = -1;
                    for (int i = 0; i < contas.size(); i++) {
                        ContaBancaria conta_get = contas.get(i);
                        if (conta_get.numeroconta == busc_conta) {
                            achado = i;
                            break;
                        }
                    }
                    if (achado != -1) {
                        ContaBancaria conta_get = contas.get(achado);
                        conta_get.sacar(valor);
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    break;
            }
        }while(escolha < 5);
    }
}
