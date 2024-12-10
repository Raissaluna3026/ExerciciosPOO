package ListaDeExercicio.Ex1;

public class Chefe extends Empregado{
    private double bonus;

    public Chefe(String nome, String cpf, double salario, double bonus) {
        super(nome, cpf, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double calculoBonus() {
        return getSalario() * (bonus/100);
    }

    @Override
    public double calcularEmprestimo() {
        return (super.calcularEmprestimo() + calculoBonus() );
    }
}
