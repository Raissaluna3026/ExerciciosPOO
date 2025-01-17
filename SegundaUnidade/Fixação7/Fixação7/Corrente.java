package Fixação7.Fixação7;

public class Corrente extends Conta{
    
    private String endereco;
    private String cpf;

	public Corrente(String nomeTitular, String agencia, float saldo,  String endereco, String cpf) {
		super(nomeTitular, agencia, saldo);
        this.endereco = endereco;
        this.cpf = cpf;
	}

    @Override
    public void processarMensalidade(){

    }

    @Override
    public String toString() {
        return super.toString() +
               "\nEndereço: " + endereco +
               "\nCPF: " + cpf;
    }

}
