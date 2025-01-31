package Revisao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Frota frota = new Frota();

        // Criando veículos
        Veiculo veiculo1 = new VeiculoProprio("1", "Fusca", 2010, "Disponível", 20000);
        Veiculo veiculo2 = new VeiculosParceiros("2", "Onix", 2018, "Alugado", 0.15);

        // Adicionando veículos à frota
        frota.adicionarVeiculo(veiculo1);
        frota.adicionarVeiculo(veiculo2);

        // Consultando status
        frota.consultarStatus();

        // Registrando alug7el
        Aluguel aluguel1 = new Aluguel("234", "novo", 2029 , 10, 533.60); 
        System.out.println(aluguel1.exibirDetalhes());

        // Gerando relatório
        ArrayList<Aluguel> alugueis = new ArrayList<>();
        alugueis.add(aluguel1);
        Relatorio.gerarRelatorioLongaDuracao(alugueis);
    }
}
