package Ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int escolha = 0;
        String nome;
        String telefone;
        int tipo_busc = 0;
        String busc = "";
        int busc_index = 0;
        
        do {
            System.out.println("(1) Adicionar contato");
            System.out.println("(2) Listar contatos");
            System.out.println("(3) Buscar contato");
            System.out.println("(4) Remover contato ");
            escolha = Integer.parseInt(input.nextLine());
            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do Contato: ");
                    nome = input.nextLine();
                    System.out.print("Digite o telefone do Contato: ");
                    telefone = input.nextLine();
                    agenda.addContato(nome, telefone);
                    break;
                case 2:
                    agenda.listarContatos();
                    break;
                case 3:
                    System.out.print("Buscar por Telefone ou Nome(2,1): ");
                    tipo_busc = Integer.parseInt(input.nextLine());
                    System.out.print("Digite o nome ou telefone do contato: ");
                    busc = input.nextLine();
                    if (tipo_busc == 1) {
                        agenda.buscarContato(busc, "", tipo_busc);
                    } else {
                        agenda.buscarContato("", busc, tipo_busc);
                    }
                    break;
                case 4:
                    System.out.print("Digite o index do contato: ");
                    busc_index = Integer.parseInt(input.nextLine());
                    agenda.excluirContato(busc_index);
                    break;
            }
        } while (escolha < 5);
    }
}
