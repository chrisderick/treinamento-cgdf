package core.enums;

public enum TipoTelefone {
    FIXO(1), MOVEL(2), COMERCIAL(3);

    public int valorTipoTelefone;

    TipoTelefone(int valor) {
        valorTipoTelefone = valor;
    }

    public int getValorTipoTelefone() {
        return valorTipoTelefone;
    }

    public void setValorTipoTelefone(int valorTipoTelefone) {
        this.valorTipoTelefone = valorTipoTelefone;
    }
}
