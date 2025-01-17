
public class Titulo {
    private String nome;
    private String autorPrincipal;
    private String editora;
    private float preco;

    public Titulo(String nome, String autorPrincipal, String editora, float preco) {
        this.nome = nome;
        this.autorPrincipal = autorPrincipal;
        this.editora = editora;
        this.preco = preco;
    }

    public String getEditora(){
        return this.editora;
    }
    public String getNome(){
        return this.nome;
    }
    public String getAutorPrincipal(){
        return this.autorPrincipal;
    }
    public float getPreco(){
        return this.preco;
    }
    public float calcularImposto(){
        return 0.0f;
    }
    public float calcularDesconto(float precoBase) {
        return 0.0f; 
    }
    public float calcularPrecoFinal(boolean temCartaoVIP){
        float precoBase = this.preco + this.calcularImposto();
        float desconto = 0.0f;

        if(temCartaoVIP){
            desconto = this.calcularDesconto(precoBase);
        }
        return precoBase - desconto;
    }



    public String toString() {
    return "Título: " + this.nome + 
           "\nAutor Principal: " + this.autorPrincipal + 
           "\nEditora: " + this.editora + 
           "\nPreço: R$ " + this.preco;
    }


}
