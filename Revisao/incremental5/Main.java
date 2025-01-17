import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cadastro do cliente
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o CPF do cliente: ");
        String cpfCliente = scanner.nextLine();

        Cliente cliente = new Cliente(nomeCliente, cpfCliente);
        System.out.println("Cliente cadastrado com sucesso!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar cartão");
            System.out.println("2. Remover cartão");
            System.out.println("3. Realizar compra");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o número do cartão: ");
                    String numeroCartao = scanner.nextLine();

                    System.out.print("Digite o limite do cartão: ");
                    float limiteCartao = scanner.nextFloat();
                    scanner.nextLine(); // Limpar o buffer

                    Fatura fatura = new Fatura();
                    CartaoDeCredito cartao = new CartaoDeCredito(nomeCliente, numeroCartao, limiteCartao, fatura);
                    cliente.adicionarCartao(cartao);
                }
                case 2 -> {
                    System.out.print("Digite o número do cartão a ser removido: ");
                    String numeroCartaoRemover = scanner.nextLine();
                    cliente.removerCartao(numeroCartaoRemover);
                }
                case 3 -> {
                    System.out.print("Digite o número do cartão para a compra: ");
                    String numeroCartaoCompra = scanner.nextLine();

                    System.out.print("Digite o valor da compra: ");
                    float valorCompra = scanner.nextFloat();
                    scanner.nextLine(); // Limpar o buffer

                    cliente.realizarCompra(numeroCartaoCompra, valorCompra);
                }
                case 4 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                }
            }
        }

    
    }
}
