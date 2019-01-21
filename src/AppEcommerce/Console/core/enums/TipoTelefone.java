package AppEcommerce.Console.core.enums;

public enum TipoTelefone {
    FIXO(0), MOVEL(1), COMERCIAL(2);

    int valorTipoTelefone;

    TipoTelefone(int index) {
       this.valorTipoTelefone = index;
    }

}
