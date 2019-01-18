package AppEcommerce.Console.core;

public class DescontoPessoaJuridica {
    public int id;
    public PessoaJuridica pessoaJuridica;
    public Produto produto;
    public double percentualDeDesconto;

    //Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PessoaJuridica getPessoaJuridica() {
        return pessoaJuridica;
    }

    public void setPessoaJuridica(PessoaJuridica pessoaJuridica) {
        this.pessoaJuridica = pessoaJuridica;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getPercentualDeDesconto() {
        return percentualDeDesconto;
    }

    public void setPercentualDeDesconto(double percentualDeDesconto) {
        this.percentualDeDesconto = percentualDeDesconto;
    }
}
