package ExClasseabstrata3;

import java.util.ArrayList;
import java.util.Scanner;

public class AplicacaoFaculdade {
    private ArrayList<Curso> cursos = new ArrayList<>();
    private Scanner scanner =  new Scanner(System.in);

    public void criarCursoGraduacao(){
        System.out.println("Criando um curso de graduação. ");
        System.out.println("Digite o código do curso: ");
        String codigo = scanner.nextLine();

        System.out.println("Digite o nome do curso: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a area do curso: ");
        String area = scanner.nextLine();

        System.out.println("Digite o número de vagas do curso: ");
        int numeroVagas = scanner.nextInt();
        

        System.out.println("Digite a quantidade de disciplinas obrigatórias: ");
        int obrigatorias = scanner.nextInt();
        

        System.out.println("Digite a quantidade de disciplinas optativas: ");
        int optativas = scanner.nextInt();
        scanner.nextLine();

        Graduacao curso = new Graduacao(codigo, nome, area, numeroVagas, obrigatorias, optativas);
        cursos.add(curso);
        System.out.println("Curso de graduação criado com sucesso!");
    }

    public void criarCursoPosGraduacao(){
        System.out.println("Criando um curso de pós-graduação. ");
        System.out.println("Digite o código do curso: ");
        String codigo = scanner.nextLine();

        System.out.print("Digite o nome do curso: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a área do curso: ");
        String area = scanner.nextLine();

        System.out.print("Digite o número de vagas: ");
        int numeroVagas = scanner.nextInt();

        System.out.println("Digite a carga horária máxima: ");
        int cargaHorariaMax = scanner.nextInt();
        scanner.nextLine();

        PosGraduacao curso = new PosGraduacao(codigo, nome, area, numeroVagas, cargaHorariaMax);
        cursos.add(curso);

        System.out.println("Curso de pós-graduação criado com sucesso!");
    }

    public void consultarCurso(){
        System.out.println("Digite o curso que deseja consultar: ");
        String codigo = scanner.nextLine();
        for (Curso curso : cursos){
            if(curso.getCodigo().equals(codigo)){
                System.out.println("Detalhes do curso: ");
                System.out.println(curso);

                if(curso instanceof Graduacao){
                    Graduacao graduacao = (Graduacao) curso;
                    System.out.println("Total de disciplinas: " + graduacao.getTotalDisciplinas());
                }else if (curso instanceof PosGraduacao){
                    PosGraduacao posGraduacao = (PosGraduacao) curso;
                    System.out.println("Carga horária máxima: " + posGraduacao.getCargaHorariaMax() + "horas");
                }
                return;
            }
     
        }
        System.out.println("Curso não encontrado!");
    }

}
