package ExInterface2;

public class ContaCorrente extends Conta{
    private double limite;
    private float taxaManutencaoMensal;

    public ContaCorrente(String titular, int numeroConta, int agencia, float saldo, float taxaManutencaoMensal, double limite){
        super(titular, numeroConta, agencia, saldo);
        this.limite = limite;
        this.taxaManutencaoMensal = taxaManutencaoMensal;
    }

    public void realizarManutencaoMensal(){
        setSaldo(getSaldo() - taxaManutencaoMensal);
        System.out.println("Taxa de manutenção de R$" + taxaManutencaoMensal + " debitada. Saldo atual: R$" + getSaldo());
    }
    @Override
    public void sacar(float valor){
        if (valor > getSaldo() + limite){
            System.out.println("Saldo insuficiente.");
        }else{
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado. Saldo atual: R$" + getSaldo());
        }
    }
}
