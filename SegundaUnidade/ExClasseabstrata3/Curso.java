package ExClasseabstrata3;

public class Curso {
    private String codigo;
    private String nome;
    private String area;
    private int numeroVagas;

    public Curso(String codigo, String nome, String area, int numeroVagas){
        this.codigo = codigo;
        this.nome = nome;
        this.area = area;
        this.numeroVagas = numeroVagas;
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
}
