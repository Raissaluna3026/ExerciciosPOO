public class ProfessoresCurs extends Professores{
    private String cursinho;

    public ProfessoresCurs(String nome, String endereco, String disciplina, String cursinho){
        super(nome, endereco, disciplina);
        this.cursinho = cursinho;
    }

    public String getCursinho() {
        return cursinho;
    }

    public void setCursinho(String cursinho) {
        this.cursinho = cursinho;
    }

}
