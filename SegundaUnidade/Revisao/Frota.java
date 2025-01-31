package Revisao;

import java.util.ArrayList;

public class Frota implements GerenciamentoFrota{
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    @Override
    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    };

    @Override
    public void removerVeiculo(String id){
        veiculos.removeIf(veiculo -> veiculo.getId().equals(id));   
    }
    @Override
    public void consultarStatus(){
        System.out.println("Status dos veículos");
        for (Veiculo v : veiculos){
            System.out.println(v.exibirInformacoes());
        }
    }
}
