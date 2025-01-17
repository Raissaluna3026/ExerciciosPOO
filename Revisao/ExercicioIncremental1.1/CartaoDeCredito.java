class CartaoDeCredito {
    private String nomeTitular;
    private int numero;
    private float limite;
    private float saldo;
    private Fatura fatura;

    public CartaoDeCredito(String nomeTitular, int numero, float limite, Fatura fatura, float saldo) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.limite = limite;
        this.fatura = fatura;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public float getLimite() {
        return limite;
    }

    public float getSaldo() {
        return saldo;
    }

    public void realizarCompra(float valor) {
        if (saldo + valor <= limite) {
            saldo += valor;
            System.out.println("Compra de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Compra não autorizada! Limite insuficiente.");
        }
    }

    public void adicionarTransacao(Transacao transacao) {
        fatura.adicionarTransacao(transacao);
        realizarCompra(transacao.getValor());
    }
}