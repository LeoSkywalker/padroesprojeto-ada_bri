package padroesestruturais.bridge;

public class PessoaFisica extends Pessoa{

    public PessoaFisica(float valor){
        super(valor);
    }

    public float calcularPagamento() {
        return this.valor * (1 + this.pagamento.percentualAcrescimo());
    }
}
