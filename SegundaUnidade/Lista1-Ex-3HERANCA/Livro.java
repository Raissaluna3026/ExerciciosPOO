public class Livro extends Titulo{
    private String resumo;

    public Livro(String nome, String autorPrincipal, String editora, String resumo, float preco) {
        super(nome, autorPrincipal, editora, preco);
        this.resumo = resumo;
    }

    public String getResumo() {
        return this.resumo;
    }

    @Override
    public float calcularImposto(){
        return this.getPreco() * 0.8f;
    }
    @Override
    public float calcularDesconto(float precoBase) {
        return precoBase * 0.03f; 
    }

    @Override
    public String toString() {
    return super.toString() + 
           "\nResumo: " + this.resumo;
    }

}
