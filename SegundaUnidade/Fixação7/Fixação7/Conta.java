package Fixação7.Fixação7;

public abstract class Conta {
    private String nomeTitular;
    private String agencia;
    private float saldo;

    public Conta(String nomeTitular, String agencia, float saldo) {
        this.nomeTitular = nomeTitular;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }
    public String getAgencia() {
        return agencia;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    public void depositar(float valor){
        this.saldo += valor;
    }
    public boolean sacar(float valor){
        if (saldo >= valor) {
            this.saldo -= valor;
            return true;
        } 
        return false;
    }
    public abstract void processarMensalidade();
    @Override
    public String toString() {
        return "Titular: " + nomeTitular +
               "\nAgência: " + agencia +
               "\nSaldo: R$ " + saldo;
    }

}
