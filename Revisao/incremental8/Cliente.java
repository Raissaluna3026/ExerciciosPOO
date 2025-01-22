package Revisao.incremental8;

class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;

    public Cliente(String nome, String cpf, String endereco, String telefone, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s | CPF: %s | Endereço: %s | Telefone: %s | Email: %s", 
                nome, cpf, endereco, telefone, email);
    }
}

