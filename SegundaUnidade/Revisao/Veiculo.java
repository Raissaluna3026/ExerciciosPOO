
package Revisao;

public abstract class Veiculo {
    private String id;
    private String modelo;
    private int anoFabricacao;
    private String situacaoOperacional;

    public Veiculo(String id, String modelo, int anoFabricacao, String situacaoOperacional) {
        this.id = id;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.situacaoOperacional = situacaoOperacional;
    }

    public String getId() {
        return id;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAnoFabricacao(){
        return anoFabricacao;
    }
    public String getSituacaoOperacional(){
        return situacaoOperacional;
    }
    
    public String exibirInformacoes() {
        return "ID: " + id + ", Modelo: " + modelo + ", Ano: " + anoFabricacao + ", Situação: " + situacaoOperacional;
    }
       
    public abstract float calcularValorAluguel(int dias); 
    
}
