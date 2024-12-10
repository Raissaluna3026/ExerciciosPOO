public class Pessoas {
    private String nome;
    private String endereco;

    public Pessoas(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String toString() {
        return "Nome: " + nome + "\nEndereço: " + endereco + "\n";
    }   
    final public String qualEndereco() {
        return endereco;
    } 
}