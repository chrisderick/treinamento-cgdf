package AppEcommerce.Console.core;

public class Produto {
    //Declaração de variáveis
    public int id;
    public String descricao;
    public double preco;
    public double peso;
    public boolean disponivel;

    public Produto(String descricao, double preco, double peso)
    {
        this.descricao = descricao;
        this.preco = preco;
        this.peso = peso;
        this.disponivel = true;
    }

    //Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
