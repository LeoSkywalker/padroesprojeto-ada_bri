package padroesestruturais.bridge;

public class CartaoDebito implements TipoPagamento{

    @Override
    public float percentualAcrescimo() {
        return 0.1f;
    }
}
