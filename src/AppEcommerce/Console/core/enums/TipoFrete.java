package AppEcommerce.Console.core.enums;

public enum TipoFrete {
    EXPRESSO(1), CONVENCIONAL(2);

    public int valorTipoFrete;

    TipoFrete(int valor) {
        valorTipoFrete = valor;
    }
}
