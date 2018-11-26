package core;

import core.enums.TipoTelefone;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    public int id;
    public String email;
    public List<Telefone> telefones;

    public Cliente(String email){
        this.email = email;
        this.telefones = new ArrayList<Telefone>();
    }

    public void AddTelefone(String numero, TipoTelefone tipoTelefone){
        Telefone telefone = new Telefone(0, numero, tipoTelefone, this);
        this.telefones.add(telefone);
    }

    public void AddEndereco(String logradouro, String cep, String bairro, String cidade, String uf, String pais){
        Endereco endereco = new Endereco(logradouro, cep, bairro, cidade, uf, pais, this);
    }

    //Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    private void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }
}
