import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Criar uma lista de projetos
        ArrayList<Projeto> projetos = new ArrayList<>();

        // Criar um projeto com tarefas
        Projeto projeto1 = new Projeto("Desenvolvimento de App", "Cliente X", 100.0, 5);
        projeto1.adicionarTarefa("Criar interface do usuário");
        projeto1.adicionarTarefa("Implementar backend", "João", 0, "delegada");
        projeto1.adicionarTarefa("Testar funcionalidades", "Maria", 0, "iniciada");

        // Finalizar algumas tarefas
        projeto1.finalizarTarefa("Criar interface do usuário", 8);
        projeto1.finalizarTarefa("Implementar backend", 12);
        projeto1.finalizarTarefa("Testar funcionalidades", 6);

        // Adicionar o projeto à lista
        projetos.add(projeto1);

        // Criar outro projeto
        Projeto projeto2 = new Projeto("Desenvolvimento de Site", "Cliente Y", 80.0, 3);
        projeto2.adicionarTarefa("Definir layout");
        projeto2.adicionarTarefa("Desenvolver páginas principais", "Carlos", 0, "iniciada");
        projeto2.finalizarTarefa("Definir layout", 5);
        projeto2.finalizarTarefa("Desenvolver páginas principais", 10);

        // Adicionar o segundo projeto à lista
        projetos.add(projeto2);

        // Exibir valor total do projeto 1
        System.out.println("Valor total do projeto 1: R$" + projeto1.calcularValorTotal());

        // Exibir valor total do projeto 2
        System.out.println("Valor total do projeto 2: R$" + projeto2.calcularValorTotal());

        // Listar projetos finalizados
        System.out.println("\nProjetos finalizados:");
        Projeto.listarProjetosFinalizados(projetos);
    }
}
