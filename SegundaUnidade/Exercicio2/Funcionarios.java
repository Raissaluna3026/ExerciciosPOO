package SegundaUnidade.Exercicio2;

public class Funcionarios {
    private String nome;
    private String funcao;
    private double salario;

    public Funcionarios(String nome, String funcao, double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public double getSalario() {
        return this.salario;
    }
    public void promover(double novoSalario, String novaFuncao) {
        this.salario = novoSalario;
        this.funcao = novaFuncao;   
    }
    public double emprestimo() {
        return this.salario * 0.3;
    }
    

}
