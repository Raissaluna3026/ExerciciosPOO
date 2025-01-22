
public class LivroDidatico extends Livro{
    private String area;

    public LivroDidatico(String nome, String autorPrincipal, String editora, String resumo, float preco, String area) {
        super(nome, autorPrincipal, editora, resumo, preco);
        this.area = area;
        
    }
    public String getArea() {
        return this.area;
    }

    public static LivroDidatico criarLivroDidatico(String nome, String autorPrincipal, String editora, String resumo, float preco, String area) {
        return new LivroDidatico(nome, autorPrincipal, editora, resumo, preco, area);
    }
    @Override
    public float calcularImposto(){
        return this.getPreco() * 0.5f;
    }
    @Override
    public float calcularDesconto(float precoBase) {
        return precoBase * 0.10f; 
    }

}
