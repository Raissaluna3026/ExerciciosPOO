class CartaoPremium extends CartaoDeCredito {
    private float cashback;
    private int pontosFidelidade;

    public CartaoPremium(String nomeTitular, String numero, float limite, float cashback, Fatura fatura) {
        super(nomeTitular, numero, limite, fatura);
        this.cashback = cashback;
        this.pontosFidelidade = 0;
    }

    @Override
    public void realizarCompra(float valor) {
        if (!ativo) {
            System.out.println("Cartão inativo. Transação não permitida.");
            return;
        }

        if (saldo + valor <= limite) {
            saldo += valor;
            pontosFidelidade += valor; // Cada real equivale a 1 ponto
            Transacao transacao = new Transacao(new Date(), valor, "Compra com pontos de fidelidade", "compra");
            adicionarTransacao(transacao);
            System.out.println("Compra de R$" + valor + " realizada no Cartão Premium. Pontos acumulados: " + pontosFidelidade);
        } else {
            System.out.println("Compra não autorizada. Limite insuficiente.");
        }
    }

    public void aplicarCashback() {
        if (pontosFidelidade >= 1000) {
            float valorCashback = pontosFidelidade * cashback;
            pontosFidelidade = 0; // Zera os pontos após aplicar o cashback
            Transacao transacao = new Transacao(new Date(), -valorCashback, "Cashback aplicado", "cashback");
            adicionarTransacao(transacao);
            System.out.println("Cashback de R$" + valorCashback + " aplicado à fatura.");
        } else {
            System.out.println("Pontos insuficientes para cashback. Acumule pelo menos 1000 pontos.");
        }
    }
}
