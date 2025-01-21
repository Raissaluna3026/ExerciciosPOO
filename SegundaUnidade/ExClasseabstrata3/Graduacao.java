package ExClasseabstrata3;

public class Graduacao extends Curso{
    private int qntsDisciplinasObg;
    private int qntsDisciplinasOpt;
    
    public Graduacao(String codigo, String nome, String area, int numeroVagas, int qntsDisciplinasObg, int qntsDisciplinasOpt){
        super(codigo, nome, area, numeroVagas);
        this.qntsDisciplinasObg = qntsDisciplinasObg;
        this.qntsDisciplinasOpt = qntsDisciplinasOpt;
    }

    public int getQntsDisciplinasObg(){
        return qntsDisciplinasObg;
    }
    public int getTotalDisciplinas(){
        return qntsDisciplinasObg + qntsDisciplinasOpt;
    }
    
    

}
