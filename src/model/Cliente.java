package model;

public class Cliente {
    public int id;
    public String email;
    public List<Telefone> telefones;

    public Cliente(String email){
        this.email = email;
        this.telefones = new List<Telefone>();
    }

    public void AddTelefone(String numero, TipoTelefone tipoTelefone){
       //TODO: continuar os arquivos do método e etc...
    }
}
