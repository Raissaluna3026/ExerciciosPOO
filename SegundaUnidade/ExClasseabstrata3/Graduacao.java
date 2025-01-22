package ExClasseabstrata3;

public class Graduacao extends Curso{
    private int qntsDisciplinasObg;
    private int qntsDisciplinasOpt;
    
    public Graduacao(String codigo, String nome, String area, int numeroVagas, double taxaMatricula, int qntsDisciplinasObg, int qntsDisciplinasOpt){
        super(codigo, nome, area, numeroVagas, taxaMatricula);
        this.qntsDisciplinasObg = qntsDisciplinasObg;
        this.qntsDisciplinasOpt = qntsDisciplinasOpt;
    }

    public int getQntsDisciplinasObg(){
        return qntsDisciplinasObg;
    }
    public int getTotalDisciplinas(){
        return qntsDisciplinasObg + qntsDisciplinasOpt;
    }
    @Override
    public double calcularPrecoComDesconto() {
        return taxaMatricula * 0.90; // 10% de desconto
    }

    @Override
    public String consultarInformacoes() {
        return "Curso: " + nome + "\nDisciplinas obrigatórias: " + qntsDisciplinasObg + 
               "\nDisciplinas optativas: " + qntsDisciplinasOpt;
    }
    

}
