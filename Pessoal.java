import java.util.ArrayList;

public class Pessoal
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private String nomeGerente;
    private ArrayList<Funcionario> funcionarios;

    /**
     * Construtor para objetos da classe Pessoal
     */
    public Pessoal(String nomeGerente)
    {
        this.nomeGerente = nomeGerente;
        this.funcionarios = new ArrayList<Funcionario>();
    }
    public void adicionarFuncionario(String nome, String funcao, String matricula, String departamento, double salario){
        Funcionario funcionario = new Funcionario(nome, funcao, matricula, departamento, salario);
        this.funcionarios.add(funcionario);
        System.out.println("Funcionario adicionado!");
    }

    public void exibirDados() {
        System.out.println("\n--- Dados do Gerente ---");
        System.out.println("Nome do Gerente: " + nomeGerente);

        System.out.println("\n--- Lista de Funcionários ---");
        for (Funcionario func : funcionarios) {
            System.out.println(func);
        }
}
}