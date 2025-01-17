package Fixação7.Fixação7;

public class ClienteComum extends Cliente{
    private String endereco;
    private String telefone;

    public ClienteComum(String nome, String endereco, String telefone){
        super(nome);
        this.endereco = endereco;
        this.telefone = telefone;
    }

    @Override
    public void beneficio() {
        System.out.println("Cliente Comum não possui benefícios");
    }
    @Override
    public String toString(){
        return super.toString() +
               "\nEndereço: " + endereco +
               "\nTelefone: " + telefone;
    }
}
