import java.util.ArrayList;


public class Cliente
{
    private String nome;
    private String cpf;
    private ArrayList<CartaoDeCredito> cartoes;

    public Cliente(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.cartoes = new ArrayList<>();
    }
    public void adicionarCartao(CartaoDeCredito cartao) {
        cartoes.add(cartao);
        System.out.println("Cartão adicionado com sucesso! Limite: R$" + cartao.getLimite());
    }
    public CartaoDeCredito buscarCartao(int numeroCartao){
        for (CartaoDeCredito cartao : cartoes){
            if(cartao.getNumero() == numeroCartao){
                return cartao;
            }
        }
        return null;
    }
    public void removerCartao(int numeroCartao){
        for (CartaoDeCredito cartao : cartoes) {
            if (cartao.getNumero() == numeroCartao) { // Verifica se o número coincide
                cartoes.remove(cartao); // Remove o cartão encontrado
                System.out.println("Cartão removido com sucesso.");
                return; // Sai do método após a remoção
            }
        }
        System.out.println("Cartão não encontrado."); // Caso não encontre o cartão
    }
    public ArrayList<CartaoDeCredito> getCartoes() {
        return cartoes;
    }
    
}
