public class Empacotadores extends Funcionario{
    public float bonus;
    
    public Empacotadores(String nome, String cpf, double salario, boolean audicao){
        super(nome, cpf, salario);
        this.bonus = audicao  ? 1.1f : 1.0f;
    }

    @Override
    public double calcularSalario(){
        return getSalario() * bonus;
    }
}
