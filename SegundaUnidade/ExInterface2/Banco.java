package ExInterface2;

import java.util.ArrayList;

public class Banco implements Auditoria{
    private String nome;
    private ArrayList<String> registrosAuditoria;
    private ArrayList<ContaInterface> contas;

    public Banco(String nome){
        this.nome = nome;
        registrosAuditoria = new ArrayList<>();
        contas = new ArrayList<>();
    }
    public void adcConta(ContaInterface conta){
        contas.add(conta);
    }
    public void realizarSaque(ContaInterface conta, float valor){
        conta.sacar(valor);
        if (valor > 500){
            registrosAuditoria.add(conta.getDetalhes() + "Saque de R$" + valor + " realizado na conta ");
        }
    }
    @Override
    public String consultarSaquesMaioresQue500(){
        if(registrosAuditoria.isEmpty()){
            return "Nenhum saque maior que R$500,00 foi realizado.";
        }

        String resultado = "";
        for(String registro : registrosAuditoria){
            resultado = resultado + registro + "\n";
        }
        return resultado;
    }

}
