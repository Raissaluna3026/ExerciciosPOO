class CartaoPremium extends CartaoDeCredito {
    private float cashback;
    private float limiteExtra;

    public CartaoPremium(String nomeTitular, String numero, float limite, float cashback, float limiteExtra, Fatura fatura) {
        super(nomeTitular, numero, limite, fatura);
        this.cashback = cashback;
        this.limiteExtra = limiteExtra;
    }

    @Override
    public void realizarCompra(float valor) {
        if (!ativo) {
            System.out.println("Cartão inativo. Transação não permitida.");
            return;
        }
        if (saldo + valor <= (limite + limiteExtra)) {
            float valorComCashback = valor - (valor * cashback);
            saldo += valorComCashback;
            Transacao transacao = new Transacao(new Date(), valorComCashback, "Compra com cashback", "compra");
            adicionarTransacao(transacao);
            System.out.println("Compra de R$" + valor + " realizada com sucesso no Cartão Premium. Cashback aplicado: R$" + (valor * cashback));
        } else {
            System.out.println("Compra não autorizada. Limite insuficiente.");
        }
    }
}
