public class EstudantesInternacionais extends Estudante{
    private String paisOrigem;
    
    public EstudantesInternacionais(String nome, String endereco, String nomeEsc, int serie, String pais){
        super(nome, endereco, nomeEsc, serie);
        this.paisOrigem = pais;
    }

}
