package ExClasseabstrata3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AplicacaoFaculdade app = new AplicacaoFaculdade();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Criar curso de graduação");
            System.out.println("2. Criar curso de pós-graduação");
            System.out.println("3. Consultar informações de um curso");
            System.out.println("4. Consultar preço com desconto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> app.criarCursoGraduacao();
                case 2 -> app.criarCursoPosGraduacao();
                case 3 -> app.consultarInformacoesCurso();
                case 4 -> app.consultarPrecoComDesconto();
                case 5 -> {
                    System.out.println("Saindo...");
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}
