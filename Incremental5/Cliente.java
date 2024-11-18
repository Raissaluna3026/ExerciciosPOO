import java.util.ArrayList;

class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<CartaoDeCredito> cartoesDeCredito;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.cartoesDeCredito = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public CartaoDeCredito getCartao(CartaoDeCredito cartao) {
            return cartao;
    }

    public void adicionarCartao(CartaoDeCredito cartao) {
        if (this.cartoesDeCredito == null) {
            this.cartoesDeCredito = cartoesDeCredito;
            System.out.println("Cartão adicionado ao cliente " + nome);
        } else {
            System.out.println("O cliente já possui um cartão ativo.");
        }
    }

    public void removerCartao() {
        if (this.cartoesDeCredito != null) {
            this.cartoesDeCredito = null;
            System.out.println("Cartão removido do cliente " + nome);
        } else {
            System.out.println("O cliente não possui um cartão ativo.");
        }
    }

    public void verificarLimite() {
        if (cartoesDeCredito != null) {
            System.out.println("Limite disponível: " + (cartoesDeCredito.getLimite() - cartoesDeCredito.getSaldo()));
        } else {
            System.out.println("O cliente não possui um cartão.");
        }
    }

    public void gerarFatura() {
        if (cartoesDeCredito != null) {
            System.out.println("Fatura gerada com total: " + cartoesDeCredito.getFatura().getTotal());
        } else {
            System.out.println("O cliente não possui um cartão.");
        }
    }
}