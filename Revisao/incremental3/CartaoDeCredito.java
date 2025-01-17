
class CartaoDeCredito {
    private String nomeTitular;
    private int numero;
    private float limite;
    private float saldo;
    private float taxaCashback;
    private Fatura fatura;
    private Transacao transacaoAtual;
    private boolean ativo;

    public CartaoDeCredito(String nomeTitular, int numero, float limite) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.limite = limite;
        
    }

    public CartaoDeCredito(String nomeTitular, int numero, float limite, float taxaCashback) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.limite = limite;
        this.saldo = 0;
        this.taxaCashback = taxaCashback;
        this.fatura = fatura;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public float getLimite() {
        return limite;
    }

    public float getSaldo() {
        return saldo;
    }

    public void realizarCompraBasica(float valor) {
        if (!ativo) {
            System.out.println("Cartão inativo. Transação não permitida.");
            return;
        }

        if (transacaoAtual == null) {
            if (saldo + valor <= limite) {
                transacaoAtual = new Transacao(valor, "Compra básica");
                saldo += valor;
                fatura.adicionarTransacao(transacaoAtual);
                System.out.println("Compra básica de R$" + valor + " realizada com sucesso.");
            } else {
                System.out.println("Compra não autorizada! Limite insuficiente.");
            }
        } else {
            System.out.println("Já existe uma transação ativa. Finalize-a antes de iniciar uma nova.");
        }
    }

    public void realizarCompraComCashback(float valor) {
        if (!ativo) {
            System.out.println("Cartão inativo. Transação não permitida.");
            return;
        }

        if (transacaoAtual == null) {
            if (saldo + valor <= limite) {
                float cashback = valor * taxaCashback;
                transacaoAtual = new Transacao(valor - cashback, "Compra com cashback");
                saldo += valor - cashback;
                fatura.adicionarTransacao(transacaoAtual);
                System.out.println("Compra com cashback de R$" + valor + " realizada com sucesso. Cashback aplicado: R$" + cashback);
            } else {
                System.out.println("Compra não autorizada! Limite insuficiente.");
            }
        } else {
            System.out.println("Já existe uma transação ativa. Finalize-a antes de iniciar uma nova.");
        }
    }

    public void finalizarTransacao() {
        if (transacaoAtual != null) {
            transacaoAtual = null;
            System.out.println("Transação finalizada.");
        } else {
            System.out.println("Não há transação ativa para finalizar.");
        }
    }

    public void desativarCartao() {
        ativo = false;
        transacaoAtual = null;
        fatura.limparFatura();
        System.out.println("Cartão desativado e todas as transações removidas.");
    }
    
    public Fatura getFatura() {
        return fatura;
    }
}