package SegundaUnidade.Polimorfismo-ex1;

public class Main {
    public static void main(string[] args){
        Beneficiario benef = new Beneficiario("Raissa", "084972214233", "71996114057");Beneficiario benef2 = new Beneficiario("Joao", "09876543232", "7189987766");

        Imovel terreno = new Terreno(234, "Rua das flores", 200, 5.000, 'A', benef, true, false);
        Imovel apto = new Apto("002", "Av. B, 456", 150, 300000, 'B', beneficiario2, 350, 'A');
        Imovel casa = new Casa("003", "Rua C, 789", 500, 600000, 'C', beneficiario1, 450, 'B');


        System.out.println(terreno);
        System.out.println("Taxa Final: R$" + terreno.calcularTaxaFinal());

        System.out.println(apto);
        System.out.println("Taxa Final: R$" + apartamento.calcularTaxaFinal());

        System.out.println(casa);
        System.out.println("Taxa Final: R$" + casa.calcularTaxaFinal());
    }

}
