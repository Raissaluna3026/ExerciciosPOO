class Fatura {
    private int dataVencimento;
    private float total;

    public Fatura(int dataVencimento, float total) {
        this.dataVencimento = dataVencimento;
        this.total = total;
    }

    public int getDataVencimento() {
        return dataVencimento;
    }

    public float getTotal() {
        return total;
    }

    public void adicionarTransacao(Transacao transacao) {
        total += transacao.getValor();
        System.out.println("Transação de R$" + transacao.getValor() + " adicionada à fatura.");
    }
}