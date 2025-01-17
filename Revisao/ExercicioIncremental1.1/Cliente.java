class Cliente {
    private String nome;
    private String cpf;
    private CartaoDeCredito cartao;

    public Cliente(String nome, String cpf, CartaoDeCredito cartao) {
        this.nome = nome;
        this.cpf = cpf;
        this.cartao = cartao;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void verificarLimite(CartaoDeCredito cartao) {
        System.out.println("Limite disponível: " + (cartao.getLimite() - cartao.getSaldo()));
    }

    public void gerarFatura(Fatura fatura) {
        System.out.println("Fatura gerada com total: " + fatura.getTotal());
    }
}