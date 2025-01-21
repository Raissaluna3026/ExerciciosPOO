package SegundaUnidade.Fixacao8;

import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<String> registrosAud;

    public Banco(String nome){
        this.nome = nome;
        this.registrosAud = new ArrayList<>();
    }
    public void adicionarRegistro(String reg){
        registrosAud.add(reg);
    }
    public void consultarSaquesMaioresQue500() {
        if (registrosAud.isEmpty()) {
            System.out.println("Nenhum saque maior que 500 foi realizado.");
            return;
        }
    
        System.out.println("Registros de saques maiores que 500:");
        for (String registro : registrosAud) {
            System.out.println(registro); 
        }
    }
}
