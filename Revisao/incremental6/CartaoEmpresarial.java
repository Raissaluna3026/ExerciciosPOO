class CartaoEmpresarial extends CartaoDeCredito {
    private float limiteAdicional;

    public CartaoEmpresarial(String nomeTitular, String numero, float limite, float limiteAdicional, Fatura fatura) {
        super(nomeTitular, numero, limite, fatura);
        this.limiteAdicional = limiteAdicional;
    }

    @Override
    public void realizarCompra(float valor) {
        if (!ativo) {
            System.out.println("Cartão inativo. Transação não permitida.");
            return;
        }
        if (saldo + valor <= (limite + limiteAdicional)) {
            saldo += valor;
            Transacao transacao = new Transacao(new Date(), valor, "Compra empresarial", "compra");
            adicionarTransacao(transacao);
            System.out.println("Compra de R$" + valor + " realizada com sucesso no Cartão Empresarial.");
        } else {
            System.out.println("Compra não autorizada. Limite insuficiente.");
        }
    }
}
