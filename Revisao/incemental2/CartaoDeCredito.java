class CartaoDeCredito {
    private String nomeTitular;
    private int numero;
    private float limite;
    private float saldo;
    private float taxaCashback;
    private Fatura fatura;

    public CartaoDeCredito(String nomeTitular, int numero, float limite) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.limite = limite;
        
   }

    public CartaoDeCredito(String nomeTitular, int numero, float limite, float taxaCashback) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.limite = limite;
        this.saldo = 0;
        this.taxaCashback = taxaCashback;
        
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

    public void realizarCompraBasica(float valor) {
        if (saldo + valor <= limite) {
            saldo += valor;
            System.out.println("Compra básica de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Compra não autorizada! Limite insuficiente.");
        }
    }

    public void realizarCompraComCashback(float valor) {
        if (saldo + valor <= limite) {
            float cashback = valor * taxaCashback;
            saldo += valor - cashback;
            System.out.println("Compra com cashback de R$" + valor + " realizada com sucesso. Cashback aplicado: R$" + cashback);
        } else {
            System.out.println("Compra não autorizada! Limite insuficiente.");
        }
    }

    public void adicionarTransacao(Transacao transacao) {
        fatura.adicionarTransacao(transacao);
        realizarCompraBasica(transacao.getValor());
    }
}
