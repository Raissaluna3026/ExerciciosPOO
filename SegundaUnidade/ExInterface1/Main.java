package ExInterface1;

public class Main {
    public static void main(String[] args){
        Camera cam = new Camera("Sony", "1080p", false);
        Alarmes alar = new Alarmes("Intelbras", 100, false);
        FechaduraEletronica fech = new FechaduraEletronica("Samsung", "345", false);
        TravaLocal tr = new TravaLocal("Trava1", true);


        Dispositivo[] dispositivosRem = {cam, alar, fech};

        System.out.println("Dispositivos controlados remotamente: ");
        for (Dispositivo d : dispositivosRem){
            d.ligar();
            d.enviarMensagem("Pronto pra uso.");
        }
        System.out.println("\nLigando todos os dispositivos");
        for(Dispositivo d : dispositivosRem){
            d.ligar();
        }
        cam.iniciarGravacaoRemotamente();
        alar.ligar();
        fech.trancar("1234");
        fech.destrancar("1234");

        System.out.println("\nDesligando todos os dispositivos");
        for(Dispositivo d : dispositivosRem){
            d.desligar();
        }
        System.out.println("\nControle de Trava Local:");
        TravaLocal trava = new TravaLocal("Yale", false);

        System.out.println("Tentativa de destrancar com digital inválida:");
        trava.destrancar("0000"); // Testando digital inválida

        System.out.println("Tentativa de destrancar com digital válida:");
        trava.destrancar("1234"); // Testando digital válida

        System.out.println("Trancando a trava:");
        trava.trancar();
    }
}
