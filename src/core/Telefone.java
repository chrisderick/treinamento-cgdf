package core;

import core.enums.TipoTelefone;

public class Telefone {
    public int id;
    public String numero;
    public TipoTelefone tipoTelefone;
    public Cliente cliente;

    public Telefone(int id, String numero, TipoTelefone tipoTelefone, Cliente cliente) {
        this.id = id;
        this.numero = numero;
        this.tipoTelefone = tipoTelefone;
        this.cliente = cliente;
    }

    //Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TipoTelefone getTipoTelefone() {
        return tipoTelefone;
    }

    public void setTipoTelefone(TipoTelefone tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
