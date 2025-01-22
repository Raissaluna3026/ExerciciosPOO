package ExClasseabstrata3;

abstract class Curso {
    protected String codigo;
    protected String nome;
    protected String area;
    protected int numeroVagas;
    protected double taxaMatricula;

    public Curso(String codigo, String nome, String area, int numeroVagas, double taxaMatricula){
        this.codigo = codigo;
        this.nome = nome;
        this.area = area;
        this.numeroVagas = numeroVagas;
        this.taxaMatricula = taxaMatricula;
    }

    public String getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }

    public String getArea(){
        return area;
    }

    public int getNumeroVagas(){
        return numeroVagas;
    }
    public abstract double calcularPrecoComDesconto();

    public abstract String consultarInformacoes();
}
