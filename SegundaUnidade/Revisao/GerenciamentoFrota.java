package Revisao;

public interface GerenciamentoFrota {
    void adicionarVeiculo(Veiculo veiculo);
    void removerVeiculo(String id);
    void consultarStatus();
}
