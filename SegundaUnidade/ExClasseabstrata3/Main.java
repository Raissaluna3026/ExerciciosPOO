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
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
    
            switch (opcao) {
                case 1 -> app.criarCursoGraduacao();
                case 2 -> app.criarCursoPosGraduacao();
                case 3 -> app.consultarCurso();
                case 4 -> {
                    System.out.println("Saindo...");
                    return;
                }
                default -> System.out.println("Opção inválida!");
            }
        }
    }
}
