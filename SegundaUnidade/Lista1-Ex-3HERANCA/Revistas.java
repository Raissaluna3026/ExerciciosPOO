

import your.package.Titulo;

public class Revistas extends Titulo
{
    private String periodicidade;
    
    public Revistas(String nome, String editora, float preco, String periodicidade)
    {
        super(nome, editora, preco);
        this.periodicidade = periodicidade;
    }
    
    @Override
    public String toString(){
        return "Nome: " + getNome() +  "\nEditora: " + getEditora() + "\nPreço: R$" +
        getPreco() + "\nPeriodicidade: " + periodicidade;
    }
    
    @Override
    public float calcularImposto(){
        return this.getPreco() * 1.0f;
    }
    @Override
    public float calcularDesconto(float precoB){
        return precoB * 0.02f;
    }
    
}
