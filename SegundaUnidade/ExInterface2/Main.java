package ExInterface2;

public class Main {
    public static void main(String[] args){
        Banco banco = new Banco("Banco do Brasil");

        ContaCorrente cc = new ContaCorrente("João", 123, 1, 1000, 20, 500);

        ContaPoupanca cp = new ContaPoupanca("Maria", 456, 2, 2000, 0.02f);

        // Adicionando contas ao banco
        banco.adcConta(cc);
        banco.adcConta(cp);

        // Realizando operações
        banco.realizarSaque(cc, 600); // Saque maior que 500
        banco.realizarSaque(cp, 400);

        // Exibindo registros de auditoria
        System.out.println(banco.consultarSaquesMaioresQue500());
    }
}
