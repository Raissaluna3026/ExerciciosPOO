import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Date;

public class CartaoDeCredito
{
    private int numero;
    private String nomeTitular;
    private double limite;
    private double saldo;
    private double fatura;
    private ArrayList<Transacao> transacoes;
    private double cashbackPercentual;
    private boolean ativo;
    
    //construtor basico
    public CartaoDeCredito(int numero, String nomeTitular, double limite)
    {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.limite = limite;
        this.saldo = 0.0;
        this.fatura = 0.0;
        this.cashbackPercentual = 0.0;
        this.transacoes = new ArrayList<>();
        this.ativo = true;
    }
    //construtor com cashback
    public CartaoDeCredito(int numero, String nomeTitular, double limite, double cashbackPercentual)
    {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.limite = limite;
        this.cashbackPercentual = cashbackPercentual;
        this.saldo = 0.0;
        this.fatura = 0.0;
        this.transacoes = new ArrayList<>();
        this.ativo = true; 
        
        System.out.println("Cashback configurado: " + this.cashbackPercentual);
    }
    
    public double getLimite(){
        return this.limite;
    }
    public int getNumero(){
        return this.numero;
    }
    
    public void desativar() {
        ativo = false;
        transacoes.clear();
    }
    
    public boolean fazerCompras(double valorCompra, String descricao){
        if(!ativo) {
            System.out.println("Cartão desativado");
            return false;
        }
        if((fatura + valorCompra) <= limite){
            fatura = fatura + valorCompra;
            Transacao novaT = new Transacao("Compra realizada", descricao, valorCompra);
            transacoes.add(novaT);
            System.out.println("Compra registrada: " + descricao + " - Valor: " + valorCompra);
            return true;
        }else{
            System.out.println("Compra recusada: limite insuficiente.");
            return false;
        }
    }
    public boolean realizarCompraComCashback(double valorCompra, String descricao) {
        if(!ativo){
            System.out.println("Cartão desativado");
            return false;
        }
        if ((fatura + valorCompra) <= limite) {
            double cashback = valorCompra * (cashbackPercentual / 100);
            fatura += valorCompra - cashback;
            Transacao novaT = new Transacao("Compra com cashback", descricao, valorCompra);
            transacoes.add(novaT);
            System.out.println("Compra com cashback registrada: " + descricao + " - Valor: " + valorCompra + " - Cashback: " + cashback);
            return true;
        } else {
            System.out.println("Compra com cashback recusada: limite insuficiente.");
            return false;
        }
    }
    
    public void relatrioTransacoes(){
        System.out.println("=== Relatório de Transações ===");
        if(transacoes.isEmpty()){
            System.out.println("Nenhuma transação realizada");
        } else{
            for (Transacao transacao : transacoes){
                System.out.println(transacao);
            }
        }
    }
    public void gerarRelatorioFatura() {
        System.out.println("=== Relatório da Fatura ===");
        relatrioTransacoes(); 
        System.out.println("Total da fatura: R$ " + fatura);
        System.out.println("===========================");
    }
    public ArrayList<Transacao> consultarHistorico(){
        return transacoes;
    }
    public ArrayList<Transacao> consultarHistoricoPorData(Date dataInicio, Date dataFim){
        ArrayList<Transacao> resultado = new ArrayList<>();
        for (Transacao transa : transacoes){
            if(!transa.getData().before(dataInicio) && !transa.getData().after(dataFim)){
                resultado.add(transa);
            }
        }
        return resultado; // Retorna as transações filtradas por data
    }
    public ArrayList<Transacao> consultarHistoricoPorTipo(String tipo){
        ArrayList<Transacao> resultado = new ArrayList<>();
        for(Transacao transa : transacoes){
            if(transa.getTipo().equals(tipo)){
                resultado.add(transa);
            }
        }
        return resultado;
    }
}
