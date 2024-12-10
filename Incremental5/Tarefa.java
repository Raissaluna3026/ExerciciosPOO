public class Tarefa {
    private String descricaoT;
    private double horasGastas;
    private String nomeExecutor;
    private String status; 

    public Tarefa(String descricao, String nomeExecutor, double horasGastas, String status) {
        this.descricaoT = descricao; // Aqui estava errado
        this.nomeExecutor = nomeExecutor;
        this.horasGastas = horasGastas;
        this.status = status;
    }

    public Tarefa(String descricao, String nomeExecutor) {
        this.descricaoT = descricao; // Aqui estava errado
        this.nomeExecutor = nomeExecutor;
        this.horasGastas = 0;
        this.status = "delegada";
    }

    public Tarefa(String descricao) {
        this.descricaoT = descricao; // Aqui estava errado
        this.horasGastas = 0;
        this.status = "iniciada";
    }

    public String getStatus() {
        return this.status;
    }

    public String getDescricaoT() {
        return this.descricaoT;
    }

    public double getHorasGastas() {
        return this.horasGastas;
    }
    public String getNomeExecutor(){
        return this.nomeExecutor;
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
    }

    public void registrarTempoGasto(double horas) {
        this.horasGastas += horas;
    }
}
