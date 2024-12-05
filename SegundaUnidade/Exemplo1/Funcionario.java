import java.time.LocalDate;

public class Funcionario extends Pessoa {
    private LocalDate admissao;
    private float salario;

    public Funcionario(String nome, int identidade, LocalDate nasc, LocalDate adm, float sal) {
        super(nome, identidade, nasc);
        admissao = adm;
        salario = sal;
    }

    @Override
    public String toString(){
        return super.toString() + "\nData de admissão: " + admissao + "\nSalário: " + salario;
    }
    final public float qualSalario(){
        return salario;
    }

}
