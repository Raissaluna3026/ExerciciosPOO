package Revisao;

import java.util.ArrayList;

public class Relatorio {
    public static void gerarRelatorioLongaDuracao(ArrayList<Aluguel> alugueis){
        System.out.println("Relatório de aluguéis de longa duração");
        for (Aluguel aluguel : alugueis){
            System.out.println(aluguel.exibirDetalhes());
        }
    }

    
}
