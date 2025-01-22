package ExInterface1;

public class Alarmes implements Dispositivo{
    private String marca;
    private float volume;
    private boolean ligado;

    public Alarmes(String marca, float volume, boolean ligado){
        this.marca = marca;
        this.volume = volume;
        this.ligado = ligado;
    }

    @Override
    public void ligar(){
        this.ligado = true;
        System.out.println("Alarme " + marca + " foi ligado.");
    }
    @Override
    public void desligar(){
        this.ligado = false;
        System.out.println("Alarme " + marca + " foi desligado.");
    }
    @Override
    public void enviarMensagem(String msg){
        System.out.println("Alarme " + marca + " enviou mensagem.");
    }
    public void ativarRemotamente(){
        if (ligado){
            System.out.println("Alarme " + marca + " foi ativado remotamente.");
        } else {
            System.out.println("Alarme " + marca + " não pode ser ativado remotamente.");
        }
    }


}
