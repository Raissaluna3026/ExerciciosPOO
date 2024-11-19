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

    public CartaoDeCredito getCartao(String numeroCartao) {
        for (CartaoDeCredito cartao : cartoesDeCredito) {
            if (cartao.getNumero().equals(numeroCartao)) {
                return cartao;
            }
        }
        System.out.println("Cartão não encontrado.");
        return null;
    }

    public void adicionarCartao(CartaoDeCredito cartao) {
        if (cartoesDeCredito.isEmpty()) { // Permitir apenas 1 cartão
            this.cartoesDeCredito.add(cartao);
            System.out.println("Cartão adicionado ao cliente " + nome);
        } else {
            System.out.println("O cliente já possui um cartão ativo.");
        }
    }

    public void removerCartao(String numeroCartao) {
        CartaoDeCredito cartaoParaRemover = getCartao(numeroCartao);
        if (cartaoParaRemover != null) {
            cartoesDeCredito.remove(cartaoParaRemover);
            System.out.println("Cartão removido do cliente " + nome);
        } else {
            System.out.println("O cliente não possui um cartão ativo com o número fornecido.");
        }
    }

    public void verificarLimite() {
        if (!cartoesDeCredito.isEmpty()) {
            for (CartaoDeCredito cartao : cartoesDeCredito) {
                double limiteDisponivel = cartao.getLimite() - cartao.getSaldo();
                System.out.println("Limite disponível no cartão " + cartao.getNumero() + ": " + limiteDisponivel);
            }
        } else {
            System.out.println("O cliente não possui cartões cadastrados.");
        }
    }

    public void gerarFatura() {
        if (!cartoesDeCredito.isEmpty()) {
            for (CartaoDeCredito cartao : cartoesDeCredito) {
                System.out.println("Fatura do cartão " + cartao.getNumero() + ": " + cartao.getFatura().getTotal());
            }
        } else {
            System.out.println("O cliente não possui cartões cadastrados.");
        }
 
    }

    public void realizarCompra(String numeroCartao, float valor) {
        CartaoDeCredito cartao = getCartao(numeroCartao);
        if (cartao != null) {
            if (cartao.getSaldo() + valor <= cartao.getLimite()) {
                cartao.realizarCompraBasica(valor); // Delegar parte da lógica ao cartão
            } else {
                System.out.println("Compra não autorizada! Limite insuficiente no cartão " + numeroCartao + ".");
            }
        } else {
            System.out.println("Compra não realizada. Cartão não encontrado.");
        }
    }
    

}
