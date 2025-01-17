public class Main {
    public static void main(String[] args) {
        Fatura fatura1 = new Fatura();
        CartaoDeCredito cartao1 = new CartaoDeCredito("Raissa Luna", 1234, 5000.0f, 0.02f, 0.05f, fatura1);

        cartao1.realizarCompraComCashback(200.0f);
        cartao1.finalizarTransacao();

        cartao1.realizarCompraBasica(150.0f);
        cartao1.desativarCartao();

        Cliente cliente1 = new Cliente("Lucas Silva", "123.456.789-00");
        cliente1.adicionarCartao(cartao1);
        cliente1.verificarLimite();
    }
}