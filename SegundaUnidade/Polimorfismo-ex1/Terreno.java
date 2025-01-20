package SegundaUnidade.Polimorfismo-ex1;

public class Terreno extends Imovel {
	private boolean estaAreaAmbiental;
    private boolean areaRural;

    public Terreno(int numeroInscricao, String endereco, float areaTotal, float valorTotal, char tipoLocalizacao, Beneficiario beneficiario, boolean estaAreaAmbiental) {
        super(numeroInscricao, endereco, areaTotal, valorTotal, tipoLocalizacao, beneficiario);
        this.estaAreaAmbiental = estaAreaAmbiental;
        this.areaRural = false;
    }

    @Override
    public float calcularTaxaColetaFinal() {
        float taxa = calcularTaxaColeta();
        if(estaAreaAmbiental){
            taxa += taxa  * 0.2f; 
        }
        if(areaRural){
            taxa -= taxa * 0.1f;
        }
        return taxa;
    }

}
