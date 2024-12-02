import java.util.Date;

public class Transacao
{
    private String tipo;
    private String descricao;
    private double valor;
    private Date data;
    
    public Transacao(String tipo, String descricao, double valor)
    {
        this.tipo = tipo;
        this.descricao = descricao;
        this.valor = valor;
        this.data = new Date();
    }
    public String getTipo(){
        return tipo;
    }
    public double getValor(){
        return valor;
    }
    public Date getData(){
        return data;
    }
    @Override
    public String toString() {
        return "Transacao{" +
                "tipo='" + tipo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }
}   
