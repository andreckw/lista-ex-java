package Ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Jogador> jogadores = new ArrayList<Jogador>();
        int escolha = 0;
        float pontuacao;
        int nvl;
        int achado = -1;
        String busc = "";

        do {
            System.out.println("(1) Adicionar jogador");
            System.out.println("(2) Listar jogadores");
            System.out.println("(3) Alterar a pontuação");
            System.out.println("(4) Alterar o nivel");
            escolha = Integer.parseInt(input.nextLine());
            switch (escolha) {
                case 1:
                    Jogador new_jogador = new Jogador();
                    System.out.print("Digite o nome do Jogador: ");
                    new_jogador.setNome(input.nextLine());
                    System.out.print("Digite a pontuação do Jogador: ");
                    new_jogador.setPontuacao(Float.parseFloat(input.nextLine()));
                    System.out.print("Digite o nivel do Jogador: ");
                    new_jogador.setNivel(Integer.parseInt(input.nextLine()));
                    jogadores.add(new_jogador);
                    break;
                case 2:
                    for (int i = 0; i < jogadores.size(); i++) {
                        jogadores.get(i).imprimir();
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do jogador: ");
                    busc = input.nextLine();
                    System.out.print("Digite a pontuacao do jogador: ");
                    pontuacao = Float.parseFloat(input.nextLine());
                    for (int i = 0; i < jogadores.size(); i++) {
                        String jogador_nome = jogadores.get(i).getNome();
                        if (jogador_nome.equals(busc) == true) {
                            achado = i;
                            break;
                        }
                    }
                    if (achado != -1) {
                        jogadores.get(achado).setPontuacao(pontuacao);
                        System.out.println("Pontuacao alterado: "+jogadores.get(achado).getPontuacao());
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    break;
                case 4:
                    System.out.print("Digite o nome do jogador: ");
                    busc = input.nextLine();
                    System.out.print("Digite o nivel a ser alterado: ");
                    nvl = Integer.parseInt(input.nextLine());
                    achado = -1;
                    for (int i = 0; i < jogadores.size(); i++) {
                        String jogador_nome = jogadores.get(i).getNome();
                        if (jogador_nome == busc) {
                            achado = i;
                            break;
                        }
                    }
                    if (achado != -1) {
                        System.out.println("Nivel alterado: "+jogadores.get(achado).getNivel());
                        jogadores.get(achado).setNivel(nvl);
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    break;
            }
        }while(escolha < 5);   
    }
}

