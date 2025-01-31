

public class LivrosDidaticos extends Livros
{
    private String area;

    
    public LivrosDidaticos(String nome, String editora, float preco, String autorPrincipal, String resumo, String area)
    {
        super(nome, editora, preco, autorPrincipal, resumo);
        this.area = area;
    }
    
    
    @Override
    public float calcularImposto(){
        return this.getPreco() * 0.05f;
    }
    @Override
    public float calcularDesconto(float precoB){
        return precoB * 0.10f;
    }
    @Override
    public String toString(){
        return "Nome: " + getNome() + "\nAutor Principal: " + getAutorPrincipal() +  "\nEditora: " + getEditora() + "\nPreço: R$" +
        getPreco() + "\nArea: " + area + "\nResumo: " + getResumo();
    }

}
