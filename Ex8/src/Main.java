import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Pizza> pizzas_escolhas = new ArrayList<Pizza>();
    public static List<Pedido> pedidos = new ArrayList<Pedido>();

    public static void addPizzas() {
        Scanner input = new Scanner(System.in);
        String nome = "";
        float preco;
        int qtd = 0;

        System.out.println("Nome do sabor: ");
        nome = input.nextLine();
        System.out.println("Preço da pizza: ");
        preco = Float.parseFloat(input.nextLine());
        System.out.println("Quantos ingredientes: ");
        qtd = Integer.parseInt(input.nextLine());

        String[] ingredientes = new String[qtd];
        System.out.println("Digite os ingredientes");
        for (int i = 0; i < qtd; i++) {
            ingredientes[i] = input.nextLine();
        }
        pizzas_escolhas.add(new Pizza(nome, preco, ingredientes));

    }

    public static void criarPedido() {
        Scanner input = new Scanner(System.in);
        int index = -1;
        Pedido new_pedido = new Pedido();

        do {
            System.out.println("Escolha o codigo da pizza (0 ira parar): ");
            for (int i = 0; i < pizzas_escolhas.size(); i++) {
                System.out.println("Cod: " + (i + 1)+" | Nome: " + pizzas_escolhas.get(i).getNome() +
                 " | Valor: "+ pizzas_escolhas.get(i).getValor());
            }
            index = (Integer.parseInt(input.nextLine()) - 1);
            if (index == -1 || index >= pizzas_escolhas.size()) {
                break;
            }
            new_pedido.addPizza(pizzas_escolhas.get(index));
        }while (true);
        System.out.println("Digite o endereco de entrega: ");
        new_pedido.setEndereco(input.nextLine());
        new_pedido.calcularValor();
        System.out.println("~-~- Valor total do pedido: "+new_pedido.getValor()+" -~-~");
        pedidos.add(new_pedido);
    }

    public static void listarPedidos() {
        float media = 0;
        int qtd_cancelado = 0;
        int qtd_n_cancelado = 0;
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        for (int i = 0; i < pedidos.size(); i++) {
            if (!pedidos.get(i).getCancelamento()) {
                System.out.println("Cod: "+ (i+1) + "\nEndereco: "+pedidos.get(i).getEndereco()+"\nValor total: "+ pedidos.get(i).getValor());
                media += pedidos.get(i).getValor();
                System.out.println("------------------------------------");
                qtd_n_cancelado++;
            } else {
                qtd_cancelado++;
            }
        }
        System.out.println("vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv");
        media = media / pedidos.size();
        System.out.println("Quantidade total: "+ pedidos.size());
        System.out.println("Quantidade cancelado: "+ qtd_cancelado);
        System.out.println("Quantidade nao cancelado: "+ qtd_n_cancelado);
        System.out.println("Media: " + media);
    }
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int escolha = 0;
        pizzas_escolhas.add(new Pizza("Barbecue", Float.parseFloat("19.90"), new String[] {"Molho Barbcue", "Carne", "Queijo"}));
        pizzas_escolhas.add(new Pizza("Portuguesa", Float.parseFloat("15.99"), new String[] {"Molho de Tomate", "Tomate", "Queijo", "Cebola"}));
        
        do {
            System.out.println("[1] Adicionar sabor");
            System.out.println("[2] Fazer pedido");
            System.out.println("[3] Listar pedidos");
            System.out.println("[4] Cancelar pedido");

            escolha = Integer.parseInt(input.nextLine());
            switch (escolha) {
                case 1:
                    addPizzas();
                    break;
                case 2:
                    criarPedido();
                    break;
                case 3:
                    listarPedidos();
                    break;
                case 4:
                    System.out.println("Digite o codigo do pedido a ser cancelado: ");
                    pedidos.remove((Integer.parseInt(input.nextLine()) - 1));
                    break;
            }
        }while(escolha < 5);
    }
}
