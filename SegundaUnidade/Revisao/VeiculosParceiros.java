package Revisao;

public class VeiculosParceiros extends Veiculo{
    private double percentualComissao;

    public VeiculosParceiros(String id, String modelo, int anoFabricacao, String situacaoOperacional, double percentualComissao){
        super(id, modelo, anoFabricacao, situacaoOperacional);
        this.percentualComissao = percentualComissao;
    }

    public double calcularComissao(int diasAlugados, double valorDiaria) {
        return (diasAlugados * valorDiaria * percentualComissao);
    }

    @Override
    public float calcularValorAluguel(int dias) {
        return dias * 150;
    }

    
}
