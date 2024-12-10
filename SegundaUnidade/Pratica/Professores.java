public class Professores extends Pessoas{
    private String disciplinaQueEnsina;

    public Professores(String nome, String endereco, String disciplina){
        super(nome, endereco);
        this.disciplinaQueEnsina = disciplina;
    }

    public String getDisciplinaQueEnsina() {
        return disciplinaQueEnsina;
    }

    public void setDisciplinaQueEnsina(String disciplinaQueEnsina) {
        this.disciplinaQueEnsina = disciplinaQueEnsina;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProf." + getNome() + "\nDisciplina que ensina: " + disciplinaQueEnsina;
    }
    
}
