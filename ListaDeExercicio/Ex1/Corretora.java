package ListaDeExercicio.Ex1;

import java.util.ArrayList;

public class Corretora {
    private ArrayList<Clientes> clientes;

    public Corretora() {
        this.clientes = new ArrayList<>();
    }
    public void adicionarCliente (Clientes cliente){
        clientes.add(cliente);
    }
    public void listarClientes(){
        for (Clientes cliente : clientes){
            System.out.println(cliente);
        }
    }

}
