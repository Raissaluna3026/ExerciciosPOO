class Cliente {
    private String nome;
    private String cpf;
    private CartaoDeCredito cartao;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public CartaoDeCredito getCartao() {
        return cartao;
    }

    public void adicionarCartao(CartaoDeCredito cartao) {
        if (this.cartao == null) {
            this.cartao = cartao;
            System.out.println("Cartão adicionado ao cliente " + nome);
        } else {
            System.out.println("O cliente já possui um cartão ativo.");
        }
    }

    public void removerCartao() {
        if (this.cartao != null) {
            this.cartao = null;
            System.out.println("Cartão removido do cliente " + nome);
        } else {
            System.out.println("O cliente não possui um cartão ativo.");
        }
    }

    public void verificarLimite() {
        if (cartao != null) {
            System.out.println("Limite disponível: " + (cartao.getLimite() - cartao.getSaldo()));
        } else {
            System.out.println("O cliente não possui um cartão.");
        }
    }

    public void gerarFatura() {
        if (cartao != null) {
            System.out.println("Fatura gerada com total: " + cartao.getFatura().getTotal());
        } else {
            System.out.println("O cliente não possui um cartão.");
        }
    }
}
