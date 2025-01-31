package Revisao;

public class Aluguel {
    private String identificacaoVeiculo;
    private String modelo;
    private int ano;
    private int duracaoDias;
    private double valorTotal;

    public Aluguel(String identificacaoVeiculo, String modelo, int ano, int duracaoDias, double valorTotal) {
        this.identificacaoVeiculo = identificacaoVeiculo;
        this.modelo = modelo;
        this.ano = ano;
        this.duracaoDias = duracaoDias;
        this.valorTotal = valorTotal;
    }
    
    public boolean exibirDetalhes() {
        System.out.println("Aluguel - Veículo: " + modelo + " (" + ano + "), Duração: " + duracaoDias + " dias, Valor Total: R$ " + valorTotal);
        return true;
    }

}
