package padroesestruturais.bridge;

public class Boleto implements TipoPagamento{

    @Override
    public float percentualAcrescimo() {
        return 0.0f;
    }
}
