
class Transacao {
    private float valor;
    private String descricao;

    public Transacao(float valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void detalhesDaTransacao() {
        System.out.println("Valor: " + valor + ", Descrição: " + descricao);
    }
}