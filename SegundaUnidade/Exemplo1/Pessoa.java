
import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private int identidade;
    private LocalDate nasc;

    public Pessoa(String nome, int identidade, LocalDate nasc) {
        this.nome = nome;
        this.identidade = identidade;
        this.nasc = nasc;
    }
    public String toString() {
        return "Nome: " + nome + "\nIdentidade: " + identidade + "\nData de nascimento: " + nasc;
    }   
    final public int qualIdentidade() {
        return identidade;
    }    
}


