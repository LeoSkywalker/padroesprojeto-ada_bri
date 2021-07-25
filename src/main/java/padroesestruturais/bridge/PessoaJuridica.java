package padroesestruturais.bridge;

public class PessoaJuridica extends Pessoa{

    private float desconto;

    public PessoaJuridica(float valor) {
        super(valor);
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float calcularPagamento() {
        return (this.valor - (this.valor * this.desconto)) * (1 + this.pagamento.percentualAcrescimo());
    }
}
