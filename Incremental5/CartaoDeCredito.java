import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class CartaoDeCredito {
    private String nomeTitular;
    private String numero;
    private float limite;
    private float saldo;
    private float taxaCashback;
    private Fatura fatura;
    private Transacao transacaoAtual;
    private boolean ativo;
    private ArrayList<Transacao> historicoTransacoes;
    

    public CartaoDeCredito(String nomeTitular, String numero, float limite, Fatura fatura) {
        this.nomeTitular = nomeTitular;
        this.numero = numero;
        this.limite = limite;
        this.saldo = 0;
        this.taxaCashback = 0.0f;
        this.fatura = fatura;
        this.ativo = true;      
        this.historicoTransacoes = new ArrayList<>();
    }

    public CartaoDeCredito(String nomeTitular, String numero, float limite, float taxaCashback, Fatura fatura) {
        this(nomeTitular, numero, limite, fatura);
        this.taxaCashback = taxaCashback;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getNumero() {
        return numero;
    }

    public float getLimite() {
        return limite;
    }

    public float getSaldo() {
        return saldo;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void realizarCompraBasica(float valor) {
        if (!ativo) {
            System.out.println("Cartão inativo. Transação não permitida.");
            return;
        }

        if (transacaoAtual == null) {
            if (saldo + valor <= limite) {
                transacaoAtual = new Transacao(new Date(), valor, "Compra básica", "compra");
                saldo += valor;
                fatura.adicionarTransacao(transacaoAtual);
                historicoTransacoes.add(transacaoAtual);
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
                transacaoAtual = new Transacao(new Date(), valor - cashback, "Compra com cashback", "compra");
                saldo += valor - cashback;
                fatura.adicionarTransacao(transacaoAtual);
                historicoTransacoes.add(transacaoAtual);
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
        historicoTransacoes.clear();
        System.out.println("Cartão desativado e todas as transações removidas.");
    }

    public List<Transacao> getHistoricoTransacoes() {
        return historicoTransacoes;
    }

    public List<Transacao> filtrarTransacoesPorTipo(String tipo) {
        List<Transacao> resultado = new ArrayList<>();
        for (Transacao transacao : historicoTransacoes) {
            if (transacao.getTipo().equals(tipo)) {
                resultado.add(transacao);
            }
        }
        return resultado;
    }

    public List<Transacao> filtrarTransacoesPorPeriodo(Date dataInicio, Date dataFim) {
        List<Transacao> resultado = new ArrayList<>();
        for (Transacao transacao : historicoTransacoes) {
            Date dataTransacao = transacao.getData();
            if (!dataTransacao.before(dataInicio) && !dataTransacao.after(dataFim)) {
                resultado.add(transacao);
            }
        }
        return resultado;
    }

    public void adicionarTransacao(Transacao transacao) {
        historicoTransacoes.add(transacao);
    }
}