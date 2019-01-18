package AppEcommerce.Console.core;

public class PessoaJuridica extends Cliente {
    public String cnpj;
    public String nomeFantasia;
    public String razaoSocial;

    public PessoaJuridica(String email) {
        super(email);
    }

    //Getters e Setters

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
