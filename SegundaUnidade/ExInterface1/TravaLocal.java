package ExInterface1;

public class TravaLocal {
    private String marca;
    private boolean travado;

    public TravaLocal(String marca, boolean travado){
        this.marca = marca;
        this.travado = true;
    }

    public void destrancar(String digital){
        if ("1234".equals(digital)){
            travado = false;
            System.out.println("Trava " + marca + " foi destrancada.");
        }else{
            System.out.println("Trava " + marca + " não foi destrancada.");
        }
    }
    public void trancar(){
        if(!travado){
            travado = true;
            System.out.println("Trava " + marca + " foi trancada.");
        }else{
            System.out.println("Trava " + marca + " não foi trancada.");
        }
    }

}
