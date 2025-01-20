package SegundaUnidade.Polimorfismo-ex1;

public class Apto extends Imovel{
    private float areaPrivativa;
    private char padraoConstrutivo;

    public Apto(int numeroInscricao, String endereco, float areaTotal, float valorTotal, char tipoLocalizacao, Beneficiario beneficiario, float areaPrivativa, char padraoConstrutivo) {
        super(numeroInscricao, endereco, areaTotal, valorTotal, tipoLocalizacao, beneficiario);
        this.areaPrivativa = areaPrivativa;
        this.padraoConstrutivo = padraoConstrutivo;
    }


    public float getAreaPrivativa() {
        return areaPrivativa;
    }

    @Override
    public float calcularTaxaColetaFinal() {
        float taxa = calcularTaxaColeta();
        if(areaPrivativa > 300){
            taxa += taxa * 0.05f;
        }
        switch (padraoConstrutivo) {
            case 'A': taxa += taxa * 0.05f; 
            case 'B': taxa += taxa * 0.02f;
            case 'C': taxa += taxa * 0.01f;  
        }
        return taxa;
    }
}
