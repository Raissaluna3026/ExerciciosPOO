package ExInterface1;

public class Camera implements Dispositivo {
    private String marca;
    private String resolucao;
    private boolean ligado;

    public Camera(String marca, String resolucao, boolean ligado){
        this.marca = marca;
        this.resolucao = resolucao;
        this.ligado = ligado;
    }

    @Override
    public void ligar(){
        this.ligado = true;
        System.out.println("Câmera " + marca + " foi ligada.");
    }

    @Override
    public void desligar() {
        this.ligado = false;
        System.out.println("Câmera " + marca + " foi desligada.");
    }
    @Override
    public void enviarMensagem(String msg){
        System.out.println("Câmera " + marca + " enviou mensagem.");
    }

    public void iniciarGravacaoRemotamente(){
        if (ligado){
            System.out.println("Câmera " + marca + " iniciou gravação remotamente.");
        } else {
            System.out.println("Câmera " + marca + " não pode iniciar gravação remotamente.");
        }
    }

}
