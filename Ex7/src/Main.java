import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<Produto>();
        int escolha = 0;
        String nome;
        String cod;
        int qtd = 0;
        float preco = 0;
        
        do {
            System.out.println("(1) Adicionar produto");
            System.out.println("(2) Listar produtos");
            escolha = Integer.parseInt(input.nextLine());
            switch (escolha) {
                case 1:
                    Produto new_produto = new Produto();
                    System.out.print("Digite o nome do Produto: ");
                    nome = input.nextLine();
                    new_produto.setNome(nome);
                    System.out.print("Digite o codigo do Produto: ");
                    cod = input.nextLine();
                    new_produto.setCod(cod);
                    System.out.print("Digite a quatidade do Produto: ");
                    qtd = Integer.parseInt(input.nextLine());
                    new_produto.setEstoque(qtd);
                    System.out.print("Digite o preco Produto: ");
                    preco = Float.parseFloat(input.nextLine());
                    new_produto.setPreco(preco);
                    produtos.add(new_produto);
                    break;
                case 2:
                    for (int i = 0; i < produtos.size(); i++) {
                        Produto get_produto = produtos.get(i);
                        System.out.println("~--~--~--~--~--~--~--~--~--~--~\n"+
                        "Nome: "+get_produto.getNome()+" | Codigo: "+get_produto.getCod()+
                        " | Preco: " + get_produto.getPreco() + " | Estoque: " + get_produto.getEstoque());
                    }
                    break;
            }
        } while (escolha < 3);
    }
}
