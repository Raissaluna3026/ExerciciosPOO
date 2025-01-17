package Fixação7.Fixação7;

public class Especial extends Conta{
    private float taxaMensal;
    private float limiteCredito;

    public Especial(String nomeTitular, String agencia, float saldo, float taxaMensal, float limiteCredito) {
        super(nomeTitular, agencia, saldo);
        this.taxaMensal = taxaMensal;
        this.limiteCredito = limiteCredito;
    }
    public boolean sacar(float valor){
        if(getSaldo() + limiteCredito >= valor){
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }
    @Override
    public void processarMensalidade() {
        setSaldo(getSaldo() - taxaMensal);      
    }
    @Override
    public String toString() {
        return super.toString() +
               "\nTaxa de Débito: R$ " + taxaMensal +
               "\nLimite de Crédito: R$ " + limiteCredito;
    }

}
