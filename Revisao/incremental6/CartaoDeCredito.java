abstract class CartaoDeCredito {
    protected String nomeTitular;
    protected String numero;
    protected float limite;
    protected float saldo;
    protected Fatura fatura;
    protected boolean ativo;
    protected List<Transacao> historicoTransacoes;

    public CartaoDeCredito(String nomeTitular, String numero, float limite, Fatura fatura) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.limite = limite;
        this.saldo = 0;
        this.fatura = fatura;
        this.ativo = true;
        this.historicoTransacoes = new ArrayList<>();
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getNumero() {
        return numero;
    }

    public float getLimite() {
        return limite;
    }

    public float getSaldo() {
        return saldo;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void adicionarTransacao(Transacao transacao) {
        historicoTransacoes.add(transacao);
        fatura.adicionarTransacao(transacao);
    }

    public void desativarCartao() {
        ativo = false;
        historicoTransacoes.clear();
        fatura.limparFatura();
    }

    // Método que será sobrescrito nas subclasses
    public abstract void realizarCompra(float valor);
}
