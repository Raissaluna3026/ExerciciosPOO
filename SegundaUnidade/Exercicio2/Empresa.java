package SegundaUnidade.Exercicio2;



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
    
    //ou assim
    public void listarFuncionarios() {
        System.out.println("Funcionarios da empresa " + this.razaoSocial + ":");
        for (Funcionarios funcionario : funcionarios) {
            System.out.println(funcionario);
        }
    }
}
