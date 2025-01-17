package Fixação7.Fixação7;

public class Poupanca extends Conta{
    private float rendimentoMensal;
    public Poupanca(String nomeTitular, String agencia, float saldo, float rendimentoMensal) {
        super(nomeTitular, agencia, saldo);
        this.rendimentoMensal = rendimentoMensal;
    }


    @Override
    public void processarMensalidade(){
        setSaldo(getSaldo() + getSaldo() * rendimentoMensal);
    }

    @Override
    public String toString(){
        return super.toString() +
               "\nRendimento Mensal: " + rendimentoMensal;
    }
}

