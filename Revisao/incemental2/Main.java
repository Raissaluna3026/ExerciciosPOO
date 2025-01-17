public class Main {
    public static void main(String[] args) {
        
        Transacao transacao1 = new Transacao(20241022, 100.50f, "Compra em loja");
        
        
        CartaoDeCredito cartaoCashback = new CartaoDeCredito("Raissa Luna", 1234, 5000.0f, 0.02f);
        
        
        CartaoDeCredito cartaoBasico = new CartaoDeCredito("Lucas Silva", 5678, 3000.0f);

        
        cartaoCashback.realizarCompraComCashback(200.0f);
        
        
        cartaoBasico.realizarCompraBasica(150.0f);
        
        
        System.out.println("Cartão com Cashback - Saldo: " + cartaoCashback.getSaldo());
        System.out.println("Cartão Básico - Saldo: " + cartaoBasico.getSaldo());
    }
}
