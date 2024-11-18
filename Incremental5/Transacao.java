
import java.util.Date;


class Transacao {
    private Date data;
    private float valor;
    private String descricao;
    private String tipo;

    public Transacao(Date data, float valor, String descricao, String tipo) {
        this.data = data;
        this.valor = valor;
        this.descricao = descricao;
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }

    public float getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void detalhesDaTransacao() {
        System.out.println("Data: " + data + ", Valor: " + valor + ", Descrição: " + descricao + ", Tipo: " + tipo);
    }
}