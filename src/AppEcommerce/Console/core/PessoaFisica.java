package AppEcommerce.Console.core;

import AppEcommerce.Console.core.enums.Sexo;

import java.util.Date;

public class PessoaFisica extends Cliente {
    public String cpf;
    public String nome;
    public Date dataNascimento = new Date();
    public Sexo sexo;

    public PessoaFisica(String email) {
        super(email);
    }

    //Getters e Setters

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }
}
