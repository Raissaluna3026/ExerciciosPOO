class CartaoBasico extends CartaoDeCredito {

    public CartaoBasico(String nomeTitular, String numero, float limite, Fatura fatura) {
        super(nomeTitular, numero, limite, fatura);
    }

    @Override
    public void realizarCompra(float valor) {
        if (!ativo) {
            System.out.println("Cartão inativo. Transação não permitida.");
            return;
        }
        if (saldo + valor <= limite) {
            saldo += valor;
            Transacao transacao = new Transacao(new Date(), valor, "Compra básica", "compra");
            adicionarTransacao(transacao);
            System.out.println("Compra de R$" + valor + " realizada com sucesso no Cartão Básico.");
        } else {
            System.out.println("Compra não autorizada. Limite insuficiente.");
        }
    }
}
