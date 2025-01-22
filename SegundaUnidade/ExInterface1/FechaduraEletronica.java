package ExInterface1;

public class FechaduraEletronica implements Dispositivo{
    private String marca;
    private String codigoAcesso;
    private boolean ligado;

    public FechaduraEletronica(String marca, String codigoAcesso, boolean ligado){
        this.marca = marca;
        this.codigoAcesso = codigoAcesso;
        this.ligado = ligado;
    }
    @Override
    public void ligar(){
        this.ligado = true;
        System.out.println("Fechadura " + marca + " foi ligada.");
    }
    @Override
    public void desligar(){
        this.ligado = false;
        System.out.println("Fechadura " + marca + " foi desligada.");
    }
    @Override
    public void enviarMensagem(String msg){
        System.out.println("Fechadura " + marca + " enviou mensagem.");
    }
    public void trancar(String senha){
        if(ligado && senha.equals(codigoAcesso)){
            System.out.println("Fechadura " + marca + " foi trancada.");
        }else{
            System.out.println("Fechadura " + marca + " não foi trancada.");
        }
    }
    public void destrancar(String senha){
        if(ligado && senha.equals(codigoAcesso)){
            System.out.println("Fechadura " + marca + " foi destrancada.");
        }else{
            System.out.println("Fechadura " + marca + " não foi destrancada.");
        }
    }
}
