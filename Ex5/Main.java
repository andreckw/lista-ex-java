package Ex5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Carro> carros = new ArrayList<Carro>();
        int escolha = 0;
        String marca;
        String modelo;
        float velocidade;
        int ano;
        int achado = -1;
        String busc_marca = "";
        String busc_modelo = "";

        do {
            System.out.println("(1) Adicionar Carro");
            System.out.println("(2) Listar carros");
            System.out.println("(3) Aumentar a velocidade");
            System.out.println("(4) Diminuir a velocidade");
            escolha = Integer.parseInt(input.nextLine());
            switch (escolha) {
                case 1:
                    System.out.print("Digite a marca do Carro: ");
                    marca = input.nextLine();
                    System.out.print("Digite o modelo do Carro: ");
                    modelo = input.nextLine();
                    System.out.print("Digite o ano do Carro: ");
                    ano = Integer.parseInt(input.nextLine());
                    System.out.print("Digite a velocidade atual do Carro: ");
                    velocidade = Float.parseFloat(input.nextLine());
                    Carro carro_new = new Carro(marca, modelo, ano, velocidade);
                    carros.add(carro_new);
                    break;
                case 2:
                    for (int i = 0; i < carros.size(); i++) {
                        carros.get(i).imprimir();
                    }
                    break;
                case 3:
                    System.out.print("Digite a marca do Carro: ");
                    busc_marca = input.nextLine();
                    System.out.print("Digite o modelo do Carro: ");
                    busc_modelo = input.nextLine();
                    System.out.print("Digite a velocidade para ser aumentada do Carro: ");
                    velocidade = Float.parseFloat(input.nextLine());
                    for (int i = 0; i < carros.size(); i++) {
                        String carro_marca = carros.get(i).getMarca();
                        String carro_modelo = carros.get(i).getModelo();
                        if ((carro_marca.equals(busc_marca) == true) && carro_modelo.equals(busc_modelo)) {
                            achado = i;
                            break;
                        }
                    }
                    if (achado != -1) {
                        carros.get(achado).acelerar(velocidade);
                        System.out.println("Velocidade aumentada: "+carros.get(achado).getVelocidadeAtual());
                    } else {
                        System.out.println("Carro não encontrado");
                    }
                    break;
                case 4:
                    System.out.print("Digite a marca do Carro: ");
                    busc_marca = input.nextLine();
                    System.out.print("Digite o modelo do Carro: ");
                    busc_modelo = input.nextLine();
                    System.out.print("Digite a velocidade para ser aumentada do Carro: ");
                    velocidade = Float.parseFloat(input.nextLine());
                    for (int i = 0; i < carros.size(); i++) {
                        String carro_marca = carros.get(i).getMarca();
                        String carro_modelo = carros.get(i).getModelo();
                        if ((carro_marca.equals(busc_marca) == true) && carro_modelo.equals(busc_modelo)) {
                            achado = i;
                            break;
                        }
                    }
                    if (achado != -1) {
                        carros.get(achado).frear(velocidade);
                        System.out.println("Nivel alterado: "+carros.get(achado).getVelocidadeAtual());
                    } else {
                        System.out.println("Carro não encontrado");
                    }
                    break;
            }
        }while(escolha < 5);  
    }
}
