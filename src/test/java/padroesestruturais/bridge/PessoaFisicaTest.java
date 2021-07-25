package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PessoaFisicaTest {

    @Test
    void deveRetornarPagamentoPessoaFisicaBoleto(){
        TipoPagamento tipoPagamento = new Boleto();
        PessoaFisica pessoaFisica = new PessoaFisica(100.0f);
        pessoaFisica.setPagamento(tipoPagamento);
        assertEquals(100.0f, pessoaFisica.calcularPagamento(), 0.01f);
    }

    @Test
    void deveRetornarPagamentoPessoaFisicaCartaoDebito(){
        TipoPagamento tipoPagamento = new CartaoDebito();
        PessoaFisica pessoaFisica = new PessoaFisica(200.0f);
        pessoaFisica.setPagamento(tipoPagamento);
        assertEquals(220.0f, pessoaFisica.calcularPagamento(), 0.01f);
    }

    @Test
    void deveRetornarPagamentoPessoaFisicaCartaoCredito(){
        TipoPagamento tipoPagamento = new CartaoCredito();
        PessoaFisica pessoaFisica = new PessoaFisica(300.0f);
        pessoaFisica.setPagamento(tipoPagamento);
        assertEquals(450.0f, pessoaFisica.calcularPagamento(), 0.01f);
    }
}
