import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Criar o cliente
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o CPF do cliente: ");
        String cpfCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente);

        boolean executar = true;

        while (executar) {
            System.out.println("\n===== Menu de Opções =====");
            System.out.println("1. Adicionar Cartão");
            System.out.println("2. Realizar Compra");
            System.out.println("3. Realizar Compra com Cashback");
            System.out.println("4. Consultar Histórico de Transações");
            System.out.println("5. Consultar Histórico por Tipo");
            System.out.println("6. Consultar Histórico por Intervalo de Datas");
            System.out.println("7. Exibir Relatório de Fatura");
            System.out.println("8. Remover Cartão");
            System.out.println("9. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após o número

            switch (opcao) {
                case 1: // Adicionar Cartão
                    System.out.print("Número do cartão: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    System.out.print("Limite do cartão: ");
                    double limite = scanner.nextDouble();

                    System.out.print("Taxa de cashback (0 para nenhum): ");
                    double cashbackPercentual = scanner.nextDouble();

                    if (cashbackPercentual > 0) {
                        cliente.adicionarCartao(new CartaoDeCredito(numero, nomeCliente, limite, cashbackPercentual));
                    } else {
                        cliente.adicionarCartao(new CartaoDeCredito(numero, nomeCliente, limite));
                    }
                    break;

                case 2: // Realizar Compra
                    System.out.print("Número do cartão: ");
                    int numeroCompra = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    CartaoDeCredito cartaoCompra = cliente.buscarCartao(numeroCompra);
                    if (cartaoCompra == null) {
                        System.out.println("Cartão não encontrado.");
                        break;
                    }

                    System.out.print("Descrição da compra: ");
                    String descricaoCompra = scanner.nextLine();

                    System.out.print("Valor da compra: ");
                    double valorCompra = scanner.nextDouble();

                    cartaoCompra.fazerCompras(valorCompra, descricaoCompra);
                    break;

                case 3: // Realizar Compra com Cashback
                    System.out.print("Número do cartão: ");
                    int numeroCashback = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    CartaoDeCredito cartaoCashback = cliente.buscarCartao(numeroCashback);
                    if (cartaoCashback == null) {
                        System.out.println("Cartão não encontrado.");
                        break;
                    }

                    System.out.print("Descrição da compra: ");
                    String descricaoCashback = scanner.nextLine();

                    System.out.print("Valor da compra: ");
                    double valorCashback = scanner.nextDouble();

                    cartaoCashback.realizarCompraComCashback(valorCashback, descricaoCashback);
                    break;

                case 4: // Consultar Histórico de Transações
                    System.out.print("Número do cartão: ");
                    int numeroHistorico = scanner.nextInt();

                    CartaoDeCredito cartaoHistorico = cliente.buscarCartao(numeroHistorico);
                    if (cartaoHistorico == null) {
                        System.out.println("Cartão não encontrado.");
                        break;
                    }

                    cartaoHistorico.relatrioTransacoes();
                    break;

                case 5: // Consultar Histórico por Tipo
                    System.out.print("Número do cartão: ");
                    int numeroTipo = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    CartaoDeCredito cartaoTipo = cliente.buscarCartao(numeroTipo);
                    if (cartaoTipo == null) {
                        System.out.println("Cartão não encontrado.");
                        break;
                    }

                    System.out.print("Informe o tipo de transação (Ex: Compra, Pagamento): ");
                    String tipo = scanner.nextLine();

                    ArrayList<Transacao> historicoTipo = cartaoTipo.consultarHistoricoPorTipo(tipo);
                    for (Transacao transacao : historicoTipo) {
                        System.out.println(transacao);
                    }
                    break;

                case 6: // Consultar Histórico por Intervalo de Datas
                    System.out.print("Número do cartão: ");
                    int numeroData = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    CartaoDeCredito cartaoData = cliente.buscarCartao(numeroData);
                    if (cartaoData == null) {
                        System.out.println("Cartão não encontrado.");
                        break;
                    }

                    System.out.print("Data início (yyyy-MM-dd): ");
                    String dataInicioStr = scanner.nextLine();
                
                    System.out.print("Data fim (yyyy-MM-dd): ");
                    String dataFimStr = scanner.nextLine();
                
                    // Converter String para Date
                    Date dataInicio = new Date(dataInicioStr);
                    Date dataFim = new Date(dataFimStr);
                    
                    ArrayList<Transacao> historicoData = cartaoData.consultarHistoricoPorData(dataInicio, dataFim);
                    for (Transacao transacao : historicoData) {
                        System.out.println(transacao);
                    }
                    break;

                case 7: // Exibir Relatório de Fatura
                    System.out.print("Número do cartão: ");
                    int numeroFatura = scanner.nextInt();

                    CartaoDeCredito cartaoFatura = cliente.buscarCartao(numeroFatura);
                    if (cartaoFatura == null) {
                        System.out.println("Cartão não encontrado.");
                        break;
                    }

                    cartaoFatura.gerarRelatorioFatura();
                    break;

                case 8: // Remover Cartão
                    System.out.print("Número do cartão: ");
                    int numeroRemover = scanner.nextInt();

                    cliente.removerCartao(numeroRemover);
                    break;

                case 9: // Sair
                    executar = false;
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
