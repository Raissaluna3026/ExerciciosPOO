public class Revista extends Titulo{
    private String periodicidade;

    public Revista(String nome, String autorPrincipal, String editora, String periodicidade) {
        super(nome, autorPrincipal, editora);
        this.periodicidade = periodicidade;
    }

    public String getPeriodicidade() {
        return this.periodicidade;
    }

    public void setPeriodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }
    public static Revista criarRevista(String nome, String autorPrincipal, String editora, String periodicidade) {
        return new Revista(nome, autorPrincipal, editora, periodicidade);
    }
    
}
