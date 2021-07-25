package padroesestruturais.bridge;

public abstract class Pessoa {

    protected TipoPagamento pagamento;
    protected float valor;
    private String nome;

    public Pessoa(float valor) {
        this.valor = valor;
    }

    public void setPagamento(TipoPagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public abstract float calcularPagamento();
}
