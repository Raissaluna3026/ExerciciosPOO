import java.time.LocalDate;

public class ChefeDeDepartamento extends Funcionario {
    private String departamento;
    private LocalDate promocaoAchefe;


    public ChefeDeDepartamento(String nome, int identidade, LocalDate nasc, LocalDate adm, float sal, String dep, LocalDate prom) {
        super(nome, identidade, nasc, adm, sal);
        departamento = dep;
        promocaoAchefe = prom;
    }

    public String toString(){
        return super.toString() + "\nDepartamento: " + departamento + "\nData de promoção a chefe: " + promocaoAchefe;
    }
    public String qualDepartamento(){
        return departamento;
    }

}
