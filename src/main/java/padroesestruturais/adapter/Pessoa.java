package padroesestruturais.adapter;

public class Pessoa {

    ICartaoCredito cartaoCredito;
    CartaoCreditoAdapter persistencia;

    public Pessoa() {
        cartaoCredito = new CartaoCreditoBandeira();
        persistencia = new CartaoCreditoAdapter(cartaoCredito);
    }

    public void setCartaoCredito(String bandeira) {
        cartaoCredito.setCartaoCredito(bandeira);
        persistencia.salvarCartaoCredito();
    }

    public String getCartaoCredito(){
        return persistencia.recuperarCartaoCredito();
    }

    public String getId() {
        return persistencia.getPrefixo();
    }
}
