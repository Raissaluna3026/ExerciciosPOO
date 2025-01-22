package ExInterface2;

public abstract class Conta implements ContaInterface{

    private String titular;
    private int numeroConta;
    private int agencia;
    private float saldo;

    public Conta(String titular, int numeroConta, int agencia, float saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public float getSaldo(){
        return saldo;
    }
   
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }

    @Override
    public void depositar(float valor){
        setSaldo(getSaldo() + valor);
    }
    @Override
    public abstract void sacar(float valor);

    @Override
    public String getDetalhes(){
        return "Titular: " + titular + "\nNúmero da conta: " + numeroConta + "\nAgência: " + agencia + "\nSaldo: R$" + saldo;
    }
}
