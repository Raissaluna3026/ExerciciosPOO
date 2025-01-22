package ExClasseabstrata3;

import java.util.ArrayList;
import java.util.Scanner;

public class AplicacaoFaculdade {
    private ArrayList<Curso> cursos = new ArrayList<>();
    private Scanner scanner =  new Scanner(System.in);

    public void criarCursoGraduacao() {
        System.out.println("Criando um curso de graduação...");
        System.out.print("Digite o código do curso: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite o nome do curso: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a área do curso: ");
        String area = scanner.nextLine();
        System.out.print("Digite o número de vagas: ");
        int numeroVagas = scanner.nextInt();
        System.out.print("Digite a taxa de matrícula: ");
        double taxaMatricula = scanner.nextDouble();
        System.out.print("Digite o número de disciplinas obrigatórias: ");
        int obrigatorias = scanner.nextInt();
        System.out.print("Digite o número de disciplinas optativas: ");
        int optativas = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        Graduacao curso = new Graduacao(codigo, nome, area, numeroVagas, taxaMatricula, obrigatorias, optativas);
        cursos.add(curso);
        System.out.println("Curso de graduação criado com sucesso!");
    }

    public void criarCursoPosGraduacao(){
        System.out.println("Criando um curso de pós-graduação...");
        System.out.print("Digite o código do curso: ");
        String codigo = scanner.nextLine();
        System.out.print("Digite o nome do curso: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a área do curso: ");
        String area = scanner.nextLine();
        System.out.print("Digite o número de vagas: ");
        int numeroVagas = scanner.nextInt();
        System.out.print("Digite a taxa de matrícula: ");
        double taxaMatricula = scanner.nextDouble();
        System.out.print("Digite a carga horária máxima: ");
        int cargaHoraria = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer

        PosGraduacao curso = new PosGraduacao(codigo, nome, area, numeroVagas, taxaMatricula, cargaHoraria);
        cursos.add(curso);
        System.out.println("Curso de pós-graduação criado com sucesso!");
    }

    public void consultarInformacoesCurso() {
        System.out.print("Digite o código do curso: ");
        String codigo = scanner.nextLine();

        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                System.out.println(curso.consultarInformacoes());
                return;
            }
        }
        System.out.println("Curso não encontrado.");
    }

    public void consultarPrecoComDesconto() {
        System.out.print("Digite o código do curso: ");
        String codigo = scanner.nextLine();

        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                System.out.printf("Preço com desconto: R$ %.2f\n", curso.calcularPrecoComDesconto());
                return;
            }
        }
        System.out.println("Curso não encontrado.");
    }

}
