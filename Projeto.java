import java.util.ArrayList;

public class Projeto {
    private String nome;
    private String nomeCliente;
    private ArrayList<Tarefa> tarefas;
    private int qtdTarefa;
    private double horaDeTrabalho;
    private int maxTarefas;

    public Projeto(String nome, String nomeCliente, double horaDeTrabalho, int maxTarefas) {
        this.nome = nome;
        this.nomeCliente = nomeCliente;
        this.horaDeTrabalho = horaDeTrabalho;
        this.tarefas = new ArrayList<>();
        this.maxTarefas = maxTarefas;
    }

    public Projeto(String nome, String nomeCliente, double horaDeTrabalho, String descricaoTarefaInicial, int maxTarefas) {
        this(nome, nomeCliente, horaDeTrabalho, maxTarefas);
        
    }

    public void adicionarTarefa(String descricao) {
        if (qtdTarefa < maxTarefas) {
            tarefas.add(new Tarefa(descricao));
            qtdTarefa++;
        } else {
            System.out.println("Número máximo de tarefas atingido.");
        }
    }

    public void adicionarTarefa(String descricao, String executor, double horasGastas, String status) {
        if (qtdTarefa < maxTarefas) {
            tarefas.add(new Tarefa(descricao, horasGastas, executor, status));
            qtdTarefa++;
        } else {
            System.out.println("Número máximo de tarefas atingido.");
        }
    }

    public void finalizarTarefa(String descricao, double horasGastas) {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getDescricao().equals(descricao)) {
                tarefa.registrarHoras(horasGastas);
                tarefa.atualizarStatus("finalizada");
                break;
            }
        }
    }

    public boolean projetoFinalizado() {
        for (Tarefa tarefa : tarefas) {
            if (!tarefa.getStatus().equals("finalizada")) {
                return false;
            }
        }
        return true;
    }

    public double calcularValorTotal() {
        double totalHoras = 0;
        for (Tarefa tarefa : tarefas) {
            totalHoras += tarefa.getHorasGastas();
        }
        return totalHoras * horaDeTrabalho;
    }

    public static void listarProjetosFinalizados(ArrayList<Projeto> projetos) {
        for (Projeto projeto : projetos) {
            if (projeto.projetoFinalizado()) {
                System.out.println("Projeto: " + projeto.nome + ", Cliente: " + projeto.nomeCliente);
            }
        }
    }
}


