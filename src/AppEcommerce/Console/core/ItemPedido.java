package AppEcommerce.Console.core;

public class ItemPedido {
    //Declaração de variáveis
    public Pedido pedido;
    public Produto produto;
    public int quantidade;

    //Getters e Setters

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

