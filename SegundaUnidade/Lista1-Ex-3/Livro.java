public class Livro extends Titulo{
    private String resumo;
    private float preco;

    public Livro(String nome, String autorPrincipal, String editora, String resumo, float preco) {
        super(nome, autorPrincipal, editora);
        this.resumo = resumo;
        this.preco = preco;
    }
}
