package SegundaUnidade.Fixacao8;

public abstract class Conta {
    private String titular;
    private int numeroConta;
    private int agencia;
    private float saldo;
    protected Banco banco;

    public Conta(String titular, int numeroConta, int agencia, float saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }
    public int getNumeroConta(){
        return numeroConta;
    }
    public int getAgencia(){
        return agencia;
    }
    public float getSaldo(){
        return saldo;
    }

    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    public abstract void saque(float valor);


    public void deposito(float valor){
        saldo = saldo + valor;
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + saldo);
    }
    public void valoresMaioresQueQuinh(float saq){
        if(saq > 500){
            System.out.println("Saque maior que R$500,00.");
        } else {
            saque(saq);
        }
    }

    protected void registrarOperacao(float valor){
        if (valor > 500){
            String reg = "Titular: " + titular + " | Operação: Saque | Valor: R$ " + valor;
            banco.adicionarRegistro(reg);
        }
    }
}
