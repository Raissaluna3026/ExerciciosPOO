package SegundaUnidade.Fixacao8;

public class ContaPoupanca extends Conta{
    private float taxaRendimento;

    public ContaPoupanca(String titular, int numeroConta, int agencia, float saldo, float taxaRendimento){
        super(titular, numeroConta, agencia, saldo);
        this.taxaRendimento = taxaRendimento;
    }
    
    public void realizarRendimento(){
        setSaldo(getSaldo() + getSaldo() * taxaRendimento);
        System.out.println("Rendimento de R$" + getSaldo() * taxaRendimento + " creditado. Saldo atual: R$" + getSaldo());
    }

    @Override
    public void deposito(float valor){
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + getSaldo());
    }

    @Override
    public void saque(float valor){
        if(valor > getSaldo()){
            System.out.println("Saldo insuficiente.");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + getSaldo());
            registrarOperacao(valor);
        }
    }
}
