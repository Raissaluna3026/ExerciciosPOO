package SegundaUnidade.Polimorfismo-ex1;

public class Casa extends Imovel{
    private float areaConstruida;
    private char padraoConstrutivo;

    public Casa(int numeroInscricao, String endereco, float areaTotal, float valorTotal, char tipoLocalizacao, Beneficiario beneficiario, float areaConstruida, char padraoConstrutivo) {
        super(numeroInscricao, endereco, areaTotal, valorTotal, tipoLocalizacao, beneficiario);
        this.areaConstruida = areaConstruida;
        this.padraoConstrutivo = padraoConstrutivo;
    }

    @Override
    public float calcularTaxaColetaFinal() {
        float taxa = calcularTaxaColeta();
        if(areaConstruida > 400){
            taxa += taxa * 0.05f;
        }
        if(padraoConstrutivo == 'A'){
            taxa += taxa * 0.15f;
        }
        return taxa;
    
}
