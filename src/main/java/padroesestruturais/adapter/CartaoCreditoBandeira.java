package padroesestruturais.adapter;

public class CartaoCreditoBandeira implements ICartaoCredito{

    private String bandeira;

    @Override
    public String getCartaoCredito() {
        return this.bandeira;
    }

    @Override
    public void setCartaoCredito(String bandeira) {
        this.bandeira = bandeira;
    }
}
