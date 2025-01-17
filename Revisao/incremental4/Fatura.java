
class Fatura {
    private float total;

    public Fatura() {
        this.total = 0;
    }

    public float getTotal() {
        return total;
    }

    public void adicionarTransacao(Transacao transacao) {
        total += transacao.getValor();
        System.out.println("Transação de R$" + transacao.getValor() + " adicionada à fatura.");
    }

    public void limparFatura() {
        total = 0;
        System.out.println("Fatura limpa.");
    }
}
