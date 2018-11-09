package model;

public enum TipoTelefone {
    FIXO(1), MOVEL(2), COMERCIAL(3);

    public int valorTipoTelefone;

    TipoTelefone(int valor) {
        valorTipoTelefone = valor;
    }
}
