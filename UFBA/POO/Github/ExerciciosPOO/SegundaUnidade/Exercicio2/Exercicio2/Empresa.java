package UFBA.POO.Github.ExerciciosPOO.SegundaUnidade.Exercicio2.Exercicio2;



import java.util.ArrayList;

public class Empresa {
    private int cnpj;
    private String razaoSocial;
    private ArrayList<Funcionarios> funcionarios;

    public Empresa(int cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.funcionarios = new ArrayList<>();
    }

    public int getCnpj() {
        return this.cnpj;
    }
    public String razaoSocial() {
        return this.razaoSocial;
    }
    public void addFuncionario(Funcionarios funcionario) {
        this.funcionarios.add(funcionario);
    }
    @Override
    public String toString() {
        return "CNPJ: " + this.cnpj + "\nRazão Social: " + this.razaoSocial + "\nFuncionários: " + this.funcionarios;
    }
    //ou assim
    public void listarFuncionarios() {
        System.out.println("Funcionarios da empresa " + this.razaoSocial + ":");
        for (Funcionarios funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
