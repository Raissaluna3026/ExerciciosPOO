package Fixação7.Fixação7;

public class ClienteEspecial extends Cliente {
    private double descontoMensal;

    public ClienteEspecial(String nome, double descontoMensal) {
        super(nome);
        this.descontoMensal = descontoMensal;
    }

    @Override
    public void aplicarBeneficios() {
        System.out.println("Desconto mensal de R$ " + descontoMensal + " aplicado ao cliente especial.");
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nDesconto Mensal: R$ " + descontoMensal;
    }
}

