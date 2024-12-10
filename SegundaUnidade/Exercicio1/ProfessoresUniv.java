public class ProfessoresUniv extends Professores{
    private String universidade;
    
    public ProfessoresUniv(String nome, String endereco, String disciplina, String universidade){
        super(nome, endereco, disciplina);
        this.universidade = universidade;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }

}
