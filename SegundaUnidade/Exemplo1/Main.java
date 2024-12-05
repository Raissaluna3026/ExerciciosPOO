
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        float s; 
        int i;
        int ii;
        LocalDate d1 = LocalDate.of(2000, 2, 1);
        LocalDate d2 = LocalDate.of(1999, 8, 22);
        LocalDate d3 = LocalDate.of(2003, 5, 12);
        Pessoa p = new Pessoa("Raissa", 345677, d1);
        i = p.qualIdentidade();
        Funcionario f1 = new Funcionario("Luna", 4356789, d1, d2, 1000);
        Funcionario f2 = new Funcionario("Lucas", 4356789, d2, d3, 3000);
        s = f1.qualSalario();
        i = f1.qualIdentidade();
        ii = f2.qualIdentidade();
    }
}
