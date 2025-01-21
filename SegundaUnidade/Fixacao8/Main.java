package SegundaUnidade.Fixacao8;

public class Main {
    public static void main(String[] args) {
        // Criando o banco
        Banco banco = new Banco("Banco Central");

        // Adicionando registros de auditoria manualmente
        banco.adicionarRegistro("Titular: João | Conta: 12345 | Agência: 001 | Valor: R$550.00");
        banco.adicionarRegistro("Titular: Maria | Conta: 54321 | Agência: 002 | Valor: R$800.00");
        banco.adicionarRegistro("Titular: Pedro | Conta: 98765 | Agência: 003 | Valor: R$1000.00");

        // Consultar registros de saques maiores que 500
        banco.consultarSaquesMaioresQue500();
    }
}
