package padroesestruturais.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaTest {

    @Test
    void deveRetornarBandeiraCartaoPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setCartaoCredito("Visa");

        assertEquals("Visa", pessoa.getCartaoCredito());
    }

    @Test
    void deveRetornarPrefixoCartaoPessoa() {
        Pessoa pessoa = new Pessoa();
        pessoa.setCartaoCredito("AmericanExpress");

        assertEquals("34", pessoa.getId());
    }
}
