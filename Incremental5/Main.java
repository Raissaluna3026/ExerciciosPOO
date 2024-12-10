import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do projeto:");
        String nome = scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o valor da hora de trabalho:");
        double horaTrabalho = scanner.nextDouble();

        System.out.println("Digite o número máximo de tarefas permitido:");
        int qtdMaxTarefa = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        Projeto projeto = new Projeto(nome, nomeCliente, horaTrabalho, qtdMaxTarefa);
        System.out.println("Projeto criado com sucesso!");

        boolean running = true;

        while (running) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar uma tarefa completa");
            System.out.println("2. Adicionar uma tarefa com descrição");
            System.out.println("3. Registrar horas em uma tarefa");
            System.out.println("4. Finalizar uma tarefa");
            System.out.println("5. Verificar se o projeto está finalizado");
            System.out.println("6. Calcular o valor total do projeto");
            System.out.println("7. Exibir total de horas trabalhadas");
            System.out.println("8. Exibir informações do projeto");
            System.out.println("9. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite a descrição da tarefa:");
                    String descricao = scanner.nextLine().trim();

                    System.out.println("Digite o nome do executor:");
                    String nomeExecutor = scanner.nextLine();

                    System.out.println("Digite as horas gastas inicialmente (ou 0):");
                    double horasGastas = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer

                    System.out.println("Digite o status inicial (iniciada/delegada):");
                    String status = scanner.nextLine();

                    projeto.adicionarTarefa(descricao, nomeExecutor, horasGastas, status);
                
                }
                case 2 -> {
                    System.out.println("Digite a descrição da tarefa:");
                    String descricao = scanner.nextLine().trim();
                    projeto.adicionarTarefa(descricao);
                }
                case 3 -> {
                    System.out.println("Digite a descrição da tarefa para registrar horas:");
                    String descricao  = scanner.nextLine();

                    System.out.println("Digite o número de horas a registrar:");
                    double horas = scanner.nextDouble();
                    scanner.nextLine(); // Consumir quebra de linha

                    projeto.registrarHorasTarefa(descricao, horas);
                }
                case 4 -> {
                    System.out.println("Digite a descrição da tarefa a ser finalizada:");
                    String descricao = scanner.nextLine();

                    System.out.println("Digite as horas gastas para finalizar a tarefa:");
                    double horasGastas = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer

                    projeto.finalizarTarefa(descricao, horasGastas);
                }
                case 5 -> {
                    boolean finalizado = projeto.estaFinalizada();
                    if (finalizado) {
                        System.out.println("O projeto está completamente finalizado!");
                    } else {
                        System.out.println("O projeto ainda não está finalizado.");
                    }
                }
                case 6 -> {
                    double valorTotal = projeto.valorTotalProjeto();
                    System.out.println("O valor total do projeto é: R$" + valorTotal);
                }
                case 7 -> {
                    double totalHoras = projeto.calculoHoraDeTrabalho();
                    System.out.println("O total de horas trabalhadas no projeto é: " + totalHoras);
                }
                case 8 -> {
                    projeto.exibirProjeto();
                }
                case 9 -> {
                    running = false;
                    System.out.println("Encerrando o programa...");
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }
}
