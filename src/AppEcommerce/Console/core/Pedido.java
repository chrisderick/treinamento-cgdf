package AppEcommerce.Console.core;

import java.util.Calendar;
import java.util.List;

public class Pedido {
    //Declaração de variáveis
    public int id;
    public Calendar date = Calendar.getInstance();
    public List<ItemPedido> itens;
    public Frete frete;
    public IFormaDePagamento formaDePagamento;

    //Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public Frete getFrete() {
        return frete;
    }

    public void setFrete(Frete frete) {
        this.frete = frete;
    }

    public IFormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(IFormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }
}
