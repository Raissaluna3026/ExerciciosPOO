import java.util.ArrayList;
import java.util.List;

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
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(String nome, String funcao, String matricula, String departamento, double salario){
        Funcionario funcionario = new Funcionario(nome, funcao, matricula, departamento, salario);
        this.funcionarios.add(funcionario);
        System.out.println("Funcionario adicionado!");
    }
    public void demitirFuncionario(String nome) {
        Funcionario funcionarioParaRemover = null;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(nome)) {
                funcionarioParaRemover = funcionario;
                break;
            }
        }
        if (funcionarioParaRemover != null) {
            funcionarios.remove(funcionarioParaRemover);
        }
    }

    public void exibirDados() {
        System.out.println("\n--- Dados do Gerente ---");
        System.out.println("Nome do Gerente: " + nomeGerente);

        System.out.println("\n--- Lista de Funcionários ---");
        for (Funcionario func : funcionarios) {
            System.out.println(func);
        }
    }
    public List<Funcionario> getFuncionarios() {

        return funcionarios;

    }
}
