package model;

import java.util.Date;
import java.util.List;

public class Pedido {
    //Declaração de variáveis
    public int id;
    public Date date = new Date();
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
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
