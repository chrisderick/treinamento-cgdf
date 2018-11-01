package model;

public class Produto {
    //Declaração de variáveis
    public int id;
    private String descricao;
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
}
