public class Imovel {
    private int numeroInscricao;
    private String endereco;
    private float areaTotal;
    private float valorTotal;
    private char tipoLocalizacao;
    private Beneficiario beneficiario;

    public Imovel(int numeroInscricao, String endereco, float areaTotal, float valorTotal, char tipoLocalizacao, Beneficiario beneficiario) {
        this.numeroInscricao = numeroInscricao;
        this.endereco = endereco;
        this.areaTotal = areaTotal;
        this.valorTotal = valorTotal;
        this.tipoLocalizacao = tipoLocalizacao;
        this.beneficiario = beneficiario;
    }


    public float calcularTaxaColeta(){
        switch(tipoLocalizacao){
            case 'A': return valorTotal * 0.002f;
            case 'B': return valorTotal * 0.0015f;
            case 'C': return valorTotal * 0.001f;
            case 'D': return valorTotal * 0.0005f;
            default: throw new IllegalArgumentException("Tipo de localização inválido.");
        }
    }

    public abstract float calcularTaxaColetaFinal();
}
