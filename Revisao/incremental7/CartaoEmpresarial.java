class CartaoEmpresarial extends CartaoDeCredito {
    private float limiteExtra;

    public CartaoEmpresarial(String nomeTitular, String numero, float limite, float limiteExtra, Fatura fatura) {
        super(nomeTitular, numero, limite, fatura);
        this.limiteExtra = limiteExtra;
    }

    @Override
    public void realizarCompra(float valor) {
        if (!ativo) {
            System.out.println("Cartão inativo. Transação não permitida.");
            return;
        }

        float saldoDisponivel = limite + limiteExtra;

        if (saldo + valor <= saldoDisponivel) {
            saldo += valor;
            Transacao transacao = new Transacao(new Date(), valor, "Compra empresarial", "compra");
            adicionarTransacao(transacao);
            System.out.println("Compra de R$" + valor + " realizada com sucesso no Cartão Empresarial.");
        } else {
            System.out.println("Compra não autorizada. Limite insuficiente.");
        }
    }

    public void realizarCompraParcelada(float valor, int parcelas) {
        if (!ativo) {
            System.out.println("Cartão inativo. Transação não permitida.");
            return;
        }

        float valorParcela = valor / parcelas;
        float saldoDisponivel = limite + limiteExtra;

        if (saldo + valor <= saldoDisponivel) {
            saldo += valor;
            for (int i = 1; i <= parcelas; i++) {
                Transacao transacao = new Transacao(new Date(), valorParcela, "Parcela " + i + "/" + parcelas, "compra parcelada");
                adicionarTransacao(transacao);
            }
            System.out.println("Compra parcelada de R$" + valor + " em " + parcelas + "x de R$" + valorParcela + " realizada com sucesso.");
        } else {
            System.out.println("Compra não autorizada. Limite insuficiente.");
        }
    }
}
