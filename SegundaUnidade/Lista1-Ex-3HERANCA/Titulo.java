

public abstract class Titulo
{
    
    private String nome;
    private String editora;
    private float preco;

    
    public Titulo(String nome, String editora, float preco)
    {
        this.nome = nome;
        this.editora = editora;
        this.preco = preco;
    }

    public String getNome(){
        return this.nome;
    }
    public String getEditora(){
        return this.editora;
    }
    public float getPreco(){
        return this.preco;
    }
    
    public String toString(){
        return "Nome: " + nome + "\nEditora: " + editora + "\nPreço: R$" +
        preco;
    }
    public abstract float calcularImposto();
    
    public abstract float calcularDesconto(float precoB);
    
    public float calcularPrecoFinal(boolean temCartaoVIP){
        float precoBase = this.preco + this.calcularImposto();
        float desconto = 0.0f;

        if(temCartaoVIP){
            desconto = this.calcularDesconto(precoBase);
        }
        return precoBase - desconto;
    };
    
    
}
