import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Pizza> pizzas = new ArrayList<Pizza>();
    private boolean cancelado = false;
    private String endereco;
    private float valor_total = 0;

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void setEndereco(String end) {
        endereco = end;
    }

    public void setCancelado(boolean cancelado) {
        this.cancelado = cancelado;
    }

    public float getValor() {
        return valor_total;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean getCancelamento() {
        return cancelado;
    }

    public void calcularValor() {
        for (int i = 0; i < pizzas.size(); i++) {
            valor_total += pizzas.get(i).getValor();
        }
    }
}
