import java.util.ArrayList;
 

public class Projeto
{
    private String nome;
    private String nomeCliente;
    private ArrayList<Tarefa> tarefas;
    private int qtdTarefas;
    private double horaTrabalho;
    private int qtdMaxTarefa;
    private String descricaoTarefaInicial;
    
    public Projeto(String nome, String nomeCliente, double horaTrabalho, int qtdMaxTarefa){
        this.nome = nome;
        this.nomeCliente = nomeCliente;
        this.qtdTarefas = 0;
        this.horaTrabalho = horaTrabalho;
        this.qtdMaxTarefa = qtdMaxTarefa;
        this.tarefas = new ArrayList<>();
    }
    public Projeto(String descricaoTarefaInicial, int qtdMaxTarefa)
    {
        this.nome = nome;
        this.nomeCliente = nomeCliente;
        this.qtdMaxTarefa = qtdMaxTarefa;
        this.tarefas = new ArrayList<>();
        this.qtdTarefas = 0;
        adicionarTarefa(descricaoTarefaInicial);
    }
    public void adicionarTarefa(String descricao, String nomeExecutor, double horasGastas, String status){
        if (qtdTarefas < qtdMaxTarefa){
            Tarefa novaT = new Tarefa(descricao, nomeExecutor, horasGastas, status);
            tarefas.add(novaT);
            qtdTarefas++;
            System.out.println("Tarefa adicionada: " + novaT.getDescricaoT());
        } else {
            System.out.println("Limite máximo de tarefas atingido.");
        } 
    }

    public void adicionarTarefa(String descricao){
        if (qtdTarefas < qtdMaxTarefa){
            Tarefa novaT = new Tarefa(descricao);
            tarefas.add(novaT);
            qtdTarefas = qtdTarefas + 1;
            System.out.println("Tarefa adicionada com descrição: " + novaT.getDescricaoT());
        }
        
    }
    public void registrarHorasTarefa(String descricao, double horas) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricaoT().equals(descricao)) {
                tarefa.registrarTempoGasto(horas);
                System.out.println("Horas registradas na tarefa: " + descricao);
                return;
            }
        }
        System.out.println("Tarefa não encontrada: " + descricao);
    }
    
    public void finalizarTarefa(String descricao, double horasGastas){        
        for (Tarefa tar : tarefas){
            if (tar.getDescricaoT().equalsIgnoreCase(descricao)){
                tar.registrarTempoGasto(horasGastas);
                tar.atualizarStatus("finalizada");
                System.out.println("Tarefa finalizada com sucesso!");
                return; // Sai do loop após encontrar a tarefa
            }
        }
        System.out.println("Tarefa não encontrada: " + descricao);
    }
    public double calculoHoraDeTrabalho(){
        double totalHoras = 0;
        
        for (Tarefa tarf : tarefas){
            totalHoras = totalHoras + tarf.getHorasGastas();   
        }        
        return totalHoras;
    }
    public boolean estaFinalizada(){
        for(Tarefa tarf : tarefas){
            if (tarf.getStatus().equals("finalizada")){
                return true;
            }
        }
        return false;
    }
    public double valorTotalProjeto() {
        double totalHoras = calculoHoraDeTrabalho();
        double valorTotal = totalHoras * horaTrabalho;
        System.out.println("Valor total do projeto: " + valorTotal);
        return valorTotal; 
    }
    public void exibirProjeto() {
        System.out.println("Nome do Projeto: " + nome);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Tarefas:");
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa adicionada.");
        } else {
            for (Tarefa tarefa : tarefas) {
                System.out.println("- Descrição: " + tarefa.getDescricaoT());
                System.out.println("  Status: " + tarefa.getStatus());
                System.out.println("  Executor: " + tarefa.getNomeExecutor());
            }
        }
        System.out.println("Valor total: R$" + valorTotalProjeto());
    }

    
}
