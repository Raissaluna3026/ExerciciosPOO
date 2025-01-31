
public class Livros extends Titulo{
    private String autorPrincipal;
    private String resumo;
    
    public Livros(String nome, String editora, float preco, String autorPrincipal, String reusmo)
    {
        super(nome, editora, preco);
        this.autorPrincipal = autorPrincipal;
        this.resumo = resumo;
    }
    
    public String getAutorPrincipal(){
        return this.autorPrincipal;
    }
    public String getResumo(){
        return this.resumo;
    }
    @Override
    public float calcularImposto(){
        return this.getPreco() * 0.08f;
    }
    @Override
    public float calcularDesconto(float precoB){
        return precoB * 0.03f;
    }
    
    @Override
    public String toString(){
        return "Nome: " + getNome() + "\nAutor Principal: " + autorPrincipal + "\nResumo: " + resumo +
        "\nEditora: " + getEditora() + "\nPreço: R$" +
        getPreco();
    }
    
}
