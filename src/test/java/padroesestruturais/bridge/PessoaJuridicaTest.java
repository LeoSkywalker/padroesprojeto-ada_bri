package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PessoaJuridicaTest {

    @Test
    void deveRetornarPagamentoPessoaJuridicaBoleto(){
        TipoPagamento tipoPagamento = new Boleto();
        PessoaJuridica pessoaJuridica = new PessoaJuridica(100.0f);
        pessoaJuridica.setPagamento(tipoPagamento);
        pessoaJuridica.setDesconto(0.05f);
        assertEquals(95.0f, pessoaJuridica.calcularPagamento(), 0.01f);
    }

    @Test
    void deveRetornarPagamentoPessoaJuridicaCartaoDebito(){
        TipoPagamento tipoPagamento = new CartaoDebito();
        PessoaJuridica pessoaJuridica = new PessoaJuridica(200.0f);
        pessoaJuridica.setPagamento(tipoPagamento);
        pessoaJuridica.setDesconto(0.07f);
        assertEquals(204.60f, pessoaJuridica.calcularPagamento(), 0.01f);
    }

    @Test
    void deveRetornarPagamentoPessoaJuridicaCartaoCredito(){
        TipoPagamento tipoPagamento = new CartaoCredito();
        PessoaJuridica pessoaJuridica = new PessoaJuridica(300.0f);
        pessoaJuridica.setPagamento(tipoPagamento);
        pessoaJuridica.setDesconto(0.10f);
        assertEquals(405.0f, pessoaJuridica.calcularPagamento(), 0.01f);
    }
}
