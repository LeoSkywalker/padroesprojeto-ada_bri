package padroesestruturais.bridge;

public class CartaoCredito implements TipoPagamento {

    @Override
    public float percentualAcrescimo() {
        return 0.5f;
    }
}
