public class Caixa extends Funcionario{
    public static final double horaExtra = 20.00;
    private int qtdHoras;

    public Caixa(String nome, String cpf, double salario, int qntdHoras){
        super(nome, cpf, salario);
        this.qtdHoras = qntdHoras;
    }

    @Override
    public double calcularSalario(){
        return getSalario() + (qtdHoras * horaExtra);
    }
}
