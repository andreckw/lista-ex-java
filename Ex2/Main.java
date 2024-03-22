package Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Livro> estante = new ArrayList<Livro>();
        int escolha;

        do {
            System.out.println("(1) Adicionar livro");
            System.out.println("(2) Listar livro");
            escolha = Integer.parseInt(input.nextLine());
            switch (escolha) {
                case 1:
                    String nome;
                    int ano;
                    String autor;
                    System.out.println("Digite o nome do livro: ");
                    nome = input.nextLine();
                    System.out.println("Digite o nome do autor: ");
                    autor = input.nextLine();
                    System.out.println("Digite o ano de lançamento: ");
                    ano = Integer.parseInt(input.nextLine());
                    Livro livro = new Livro(nome, autor, ano);
            
                    estante.add(livro);
                    break;
                case 2:
                    for (int i = 0; i < estante.size(); i++) {
                        Livro livro_new = estante.get(i);
                        livro_new.exibirInfo();
                    }
                    break;
            }
        } while (escolha < 2);
    }
}
