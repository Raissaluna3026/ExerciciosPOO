public class Estudante extends Pessoas{
    private String nomeEscola;
    private int serie;

    public Estudante(String nome, String endereco, String nomeEsc, int serie){
        super(nome, endereco);
        this.nomeEscola = nomeEsc;
        this.serie = serie;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }
}
