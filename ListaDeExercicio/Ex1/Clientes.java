package ListaDeExercicio.Ex1;

public class Clientes {
    private String nome;
    private String cpf;
    

    public Clientes(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }
    public double calcularEmprestimo() {
        return 1000.0;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\n";
    }
}
