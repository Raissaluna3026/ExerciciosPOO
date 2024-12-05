public class Automovel {
    public static final byte movidoAGasolina = 1;
    public static final byte movidoAAlcool = 2;
    public static final byte movidoADiesel = 3;
    public static final byte numeroMaxPrestacoes = 24;

    public static byte getMovidoAGasolina() {
        return movidoAGasolina;
    }

    public static byte getMovidoAAlcool() {
        return movidoAAlcool;
    }

    public static byte getMovidoADiesel() {
        return movidoADiesel;
    }

    public static byte getNumeroMaxPrestacoes() {
        return numeroMaxPrestacoes;
    }

    private String modelo;
    private String cor;
    private int combustivel;

    public Automovel(String modelo, String cor, int combustivel){
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
    }
    public byte quantasPrestacoes(){
        return numeroMaxPrestacoes;
    }

    public int getCombustivel(){
        return this.combustivel;
    }  

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }
    public float quantoCusta(){
        float preco = 0;
        switch(getCombustivel()){
            case movidoAGasolina -> preco = 20000;
            case movidoAAlcool -> preco = 18000;
            case movidoADiesel -> preco = 25000;
        }
        return preco;
    }
    public String toString(){
        String resultado;
        resultado = "Modelo: " + getModelo() + "\nCor: " + getCor() + "\n";
        switch(getCombustivel()){
            case movidoAGasolina -> resultado += "Combustível: Gasolina\n";
            case movidoAAlcool -> resultado += "Combustível: Álcool\n";
            case movidoADiesel -> resultado += "Combustível: Diesel\n";
        }
        return resultado;
    }
}
