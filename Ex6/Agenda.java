package Ex6;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos = new ArrayList<Contato>();

    public void addContato(String nome, String telefone) {
        Contato contato_new = new Contato(nome, telefone);
        contatos.add(contato_new);
    }

    public void excluirContato(int index) {
        contatos.remove(index);
    }

    public void buscarContato(String nome, String telefone, int pesquisa) {
        int index = -1;
        if (pesquisa == 1) {
            for (int i = 0; i < contatos.size(); i++) {
                Contato contato_get = contatos.get(i);
                if (contato_get.getNome().equals(nome)) {
                    index = i;
                    break;
                }
            }
        } else {
            for (int i = 0; i < contatos.size(); i++) {
                Contato contato_get = contatos.get(i);
                if (contato_get.getTelefone().equals(telefone)) {
                    index = i;
                    break;
                }
            }
        }
        if (index != -1) {
            Contato contato_get = contatos.get(index);
            System.out.println("Nome"+ contato_get.getNome());
            System.out.println("Telefone"+ contato_get.getTelefone());
        } else {
            System.out.println("Contato não encontrado");
        }
    }

    public void listarContatos() {
        for (int i = 0; i < contatos.size(); i++) {
            Contato contato_get = contatos.get(i);
            System.out.print(i + " | Nome"+ contato_get.getNome() + "- ");
            System.out.println("Telefone"+ contato_get.getTelefone());
        }
    }
}
