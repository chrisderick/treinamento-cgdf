package AppEcommerce.Console.core;

public class CartaoDeCredito implements IFormaDePagamento {
    public String numero;
    public String vencimento;
    public Cliente cliente;

    //Getters e Setters

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
