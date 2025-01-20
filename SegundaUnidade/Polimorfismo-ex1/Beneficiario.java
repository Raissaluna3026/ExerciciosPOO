
package SegundaUnidade.Polimorfismo-ex1;

public class Beneficiario {
    private String nome;
    private String cpf;
    private String telefone;

    public Beneficiario(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }
    public Beneficiario(String nome, String cpf, String telefone) {
        this(nome, cpf, null)
    }

    public String getNome() {
        return nome;
    }
    
}
