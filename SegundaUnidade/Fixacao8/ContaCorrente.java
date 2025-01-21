package SegundaUnidade.Fixacao8;

public class ContaCorrente extends Conta{
    private float taxaManutencaoMensal;
    private float limiteEspecial;

    public ContaCorrente(String titular, int numeroConta, int agencia, float saldo, float taxaManutencaoMensal, float limiteEspecial) {
        super(titular, numeroConta, agencia, saldo);
        this.taxaManutencaoMensal = taxaManutencaoMensal;
        this.limiteEspecial = limiteEspecial;
    }

    public void realizarManutencaoMensal(){
        setSaldo(getSaldo() - taxaManutencaoMensal);
        System.out.println("Taxa de manutenção de R$" + taxaManutencaoMensal + " debitada. Saldo atual: R$" + getSaldo());
    }
    

    @Override
    public void deposito(float valor){
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito de R$" + valor + " realizado. Saldo atual: R$" + getSaldo());
    }

    @Override
    public void saque(float valor){
        if(valor > getSaldo() + limiteEspecial){
            System.out.println("Saldo insuficiente.");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + getSaldo());
            registrarOperacao(valor);
        }
    }

}
