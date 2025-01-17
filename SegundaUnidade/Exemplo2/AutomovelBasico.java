public class AutomovelBasico extends Automovel{
    private boolean quintaMarcha;
    private boolean limpadorDoVidroTraseiro;
    private boolean multmidia;

    public AutomovelBasico(String modelo, String cor, int combustivel, boolean qm, boolean lvt, boolean mm){
        super(modelo, cor, combustivel);
        this.quintaMarcha = qm;
        this.limpadorDoVidroTraseiro = lvt;
        this.multmidia = mm;
    }
    public boolean getQuintaMarcha() {
        return quintaMarcha;
    }

    public boolean getLimpadorDoVidroTraseiro() {
        return limpadorDoVidroTraseiro;
    }

    public boolean getMultmidia() {
        return multmidia;
    }
    public AutomovelBasico (String m, String c, byte comb)
    { super(m,c,comb);
        this.quintaMarcha = true;
        this.limpadorDoVidroTraseiro =true;
        this.multmidia =true;
    }
    public float quantoCusta(){
        float preco = super.quantoCusta();
        if (getQuintaMarcha())
            preco = preco + 2800;
        if (getLimpadorDoVidroTraseiro())
            preco = preco + 650;
        if (getMultmidia() )
            preco = preco +3000;
        return preco;
    }
    public String toString(){
        String resultado = super.toString();
    if (getQuintaMarcha() == true)
        resultado += "Com cinco marchas \n";
    if (getLimpadorDoVidroTraseiro() == true)
        resultado += "Com limpador traseiro \n";
    if (getMultmidia() == true)
        resultado += "Com \nkit multmidia \n";
    return resultado;
    }
       
}
