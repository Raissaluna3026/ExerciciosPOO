
public class Funcionario
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nome;
    private String funcao;
    private String matricula;
    private String departamento;
    private double salario;


  
    public Funcionario(String nome, String funcao, String matricula, String departamento, double salario)
    {
        // inicializa variáveis de instância
        this.nome = nome;
        this.funcao = funcao;
        this.matricula = matricula;
        this.departamento = departamento;
        this.salario = salario;
    }
    public Funcionario(String nome)
    {
        this(nome, null, null, null, 0);
        //this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return this.funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}

