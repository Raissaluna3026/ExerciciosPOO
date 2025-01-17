public class Revista extends Titulo{
    private String periodicidade;

    public Revista(String nome, String autorPrincipal, String editora, float preco, String periodicidade) {
        super(nome, autorPrincipal, editora, preco);
        this.periodicidade = periodicidade;
    }

    public String getPeriodicidade() {
        return this.periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }
    public static Revista criarRevista(String nome, String autorPrincipal, String editora, float preco, String periodicidade) {
        return new Revista(nome, autorPrincipal, editora,preco, periodicidade);
    }
    public boolean temMesmaEditora(Revista outraRevista) {
        return this.getEditora().equalsIgnoreCase(outraRevista.getEditora());
    }
    @Override
    public float calcularImposto(){
        return this.getPreco() * 1.0f;
    }
    @Override
    public float calcularDesconto(float precoBase) {
        return precoBase * 0.02f; 
    }

    @Override
    public String toString() {
    return super.toString() + 
           "\nPeriodicidade: " + this.periodicidade;
    }
    
}
