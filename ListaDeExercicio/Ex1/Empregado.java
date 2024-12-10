package ListaDeExercicio.Ex1;

public class Empregado extends Clientes{
    private double salario;

    public Empregado(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public double calcularEmprestimo() {
        return  getSalario() * 2;
    }

}
