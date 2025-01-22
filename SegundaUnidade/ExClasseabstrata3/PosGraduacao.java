package ExClasseabstrata3;

class PosGraduacao extends Curso{
    private int cargaHorariaMax;

    public PosGraduacao(String codigo, String nome, String area, int numeroVagas, double taxaMatricula, int cargaHorariaMax){
        super(codigo, nome, area, numeroVagas, taxaMatricula);
        this.cargaHorariaMax = cargaHorariaMax;

    }

    public int getCargaHorariaMax(){
        return cargaHorariaMax;
    }
    @Override
    public double calcularPrecoComDesconto() {
        return taxaMatricula * 0.95; // 5% de desconto
    }

    @Override
    public String consultarInformacoes() {
        return "Curso: " + nome + "\nCarga horária máxima: " + cargaHorariaMaxima + " horas";
    }
}
