package ExClasseabstrata3;

public class PosGraduacao extends Curso{
    private int cargaHorariaMax;

    public PosGraduacao(String codigo, String nome, String area, int numeroVagas, int cargaHorariaMax){
        super(codigo, nome, area, numeroVagas);
        this.cargaHorariaMax = cargaHorariaMax;

    }

    public int getCargaHorariaMax(){
        return cargaHorariaMax;
    }
}
