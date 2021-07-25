package padroesestruturais.adapter;

public class CartaoCreditoAdapter extends CartaoCreditoId {

    private ICartaoCredito cartaoCreditoBandeira;

    public CartaoCreditoAdapter(ICartaoCredito cartaoCreditoBandeira) {
        this.cartaoCreditoBandeira = cartaoCreditoBandeira;
    }

    public String recuperarCartaoCredito() {
        if (this.getPrefixo().equals("4"))
            cartaoCreditoBandeira.setCartaoCredito("Visa");
        else if (this.getPrefixo().equals("51"))
            cartaoCreditoBandeira.setCartaoCredito("MasterCard1");
        else if (this.getPrefixo().equals("52"))
            cartaoCreditoBandeira.setCartaoCredito("MasterCard2");
        else if (this.getPrefixo().equals("34"))
            cartaoCreditoBandeira.setCartaoCredito("AmericanExpress");
        return cartaoCreditoBandeira.getCartaoCredito();
    }

    public void salvarCartaoCredito() {
        if (cartaoCreditoBandeira.getCartaoCredito().equals("Visa"))
            this.setPrefixo("4");
        else if(cartaoCreditoBandeira.getCartaoCredito().equals("MasterCard1"))
            this.setPrefixo("51");
        else if(cartaoCreditoBandeira.getCartaoCredito().equals("MasterCard2"))
            this.setPrefixo("52");
        else if(cartaoCreditoBandeira.getCartaoCredito().equals("AmericanExpress"))
            this.setPrefixo("34");
    }
}
