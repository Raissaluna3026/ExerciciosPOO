package Fixação7.Fixação7;

public abstract class Cliente {
    private String nome;

    public Cliente(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public abstract void beneficio();

    @Override
    public String toString(){
        return "Nome: " + nome;
    }
}


