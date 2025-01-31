package Revisao;

public class VeiculoProprio extends Veiculo{
    private float depreciacaoAnual;
    
    public VeiculoProprio(String id, String modelo, int anoFabricacao, String situacaoOperacional, float depreciacaoAnual){
        super(id, modelo, anoFabricacao, situacaoOperacional);
        this.depreciacaoAnual = depreciacaoAnual;
    }

    
    public float getDepreciacaoAnual(){
        return depreciacaoAnual;
    }
    public double calcularValorRevenda(int anosDeUso, double valorOriginal) {
        return valorOriginal * Math.pow((1 - depreciacaoAnual), anosDeUso);
    }

    @Override
    public float calcularValorAluguel(int dias){
        return dias * 100;
    }

    

    

}   
