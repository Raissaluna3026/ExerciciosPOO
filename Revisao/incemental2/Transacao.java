
class Transacao {
    private int data;
    private float valor;
    private String descricao;

    public Transacao(int data, float valor, String descricao) {
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getData() {
        return data;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void detalhesDaTransacao() {
        System.out.println("Data: " + data + ", Valor: " + valor + ", Descrição: " + descricao);
    }
}
