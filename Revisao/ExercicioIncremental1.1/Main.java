public class Main {
    public static void main(String[] args) {
        
        Transacao transacao1 = new Transacao(20241022, 100.50f, "Compra em loja");
        
        
        Fatura fatura = new Fatura(20241030, 0);
        
        
        CartaoDeCredito cartao = new CartaoDeCredito("Raissa Luna", 1234, 5000.0f, fatura, 0);
        
        
        cartao.adicionarTransacao(transacao1);
        
        
        Cliente cliente = new Cliente("Raissa Luna", "123456789", cartao);
        
        
        cliente.verificarLimite(cartao);
        cliente.gerarFatura(fatura);
        
        
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Cartão de Crédito: " + cartao.getNumero());
        System.out.println("Saldo do Cartão: " + cartao.getSaldo());
        System.out.println("Total da Fatura: " + fatura.getTotal());
    }
}