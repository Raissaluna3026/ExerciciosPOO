package SegundaUnidade.Exercicio2;

public class Chefe extends Funcionarios{
    private double bonus;

    public Chefe(String nome, String funcao, double salario, double bonus) {
        super(nome, funcao, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double calculoBonus() {
        return getSalario() * (bonus/100);
    }

    @Override
    public void promover(double novoSalario, String novaFuncao) {
        super.promover(novoSalario, novaFuncao);
        this.bonus = bonus + 1;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + this.bonus;
    }

    @Override
    public double emprestimo() {
        return (getSalario() * 0.40) + (calculoBonus() * 0.10);
    }
}
