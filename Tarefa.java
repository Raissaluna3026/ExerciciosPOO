
public class Tarefa {
    private String descricao;
    private double horasGastas;
    private String executor; 
    private String status;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.status = "iniciada";
        this.horasGastas = 0;
    }

    public Tarefa(String descricao, String executor) {
        this.descricao = descricao;
        this.executor = executor;
        this.status = "delegada";
        this.horasGastas = 0;
    }

    public Tarefa(String descricao, double horasGastas, String executor, String status) {
        this.descricao = descricao;
        this.horasGastas = horasGastas;
        this.executor = executor;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getHorasGastas() {
        return horasGastas;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void registrarHoras(double horas) {
        this.horasGastas += horas;
    }
}

