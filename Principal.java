import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
      Pessoal setorPessoal = new Pessoal("Gerente 1");
      adicionarFuncionario(setorPessoal);
    }

    public static void adicionarFuncionario(Pessoal setorPessoal) {
      Scanner scanner = new Scanner(System.in);

      String nome;
      while(true){
        System.out.println("Digite o nome do funcionário: ");
        nome = scanner.nextLine();
        if(nome.isEmpty()){
          System.out.println("Erro: O nome não pode estar vazio.");
        } else if (!nome.matches("[a-zA-Z\\s]+")) {
          System.out.println("Erro: O nome não pode conter números ou caracteres especiais.");
        } else {
          break;
      }
    }
      String funcao;
      while(true){
        System.out.println("Digite a função do funcionário: ");
          funcao = scanner.nextLine();
          if (funcao.isEmpty()) {
              System.out.println("Erro: A função não pode estar vazia.");
          } else {
              break;
          }
      }
      
      String matricula;
      while(true){
        System.out.println("Digite a matrícula do funcionário: ");
            matricula = scanner.nextLine();
            if (matricula.isEmpty()) {
                System.out.println("Erro: A matrícula não pode estar vazia.");
            } else {
                break;
            }
      }
      String departamento;
      while(true){
        System.out.println("Digite o departamento do funcionário: ");
        departamento = scanner.nextLine();
        if (departamento.isEmpty()) {
          System.out.println("Erro: O departamento não pode estar vazio.");
        } else {
          break;
        }
      }
      
      double salario;
      while(true){
        System.out.println("Digite o salário do funcionário: ");
          if (!scanner.hasNextDouble()) {
              System.out.println("Erro: O salário deve ser um número válido.");
              scanner.next(); // Descartar a entrada inválida
          } else {
              salario = scanner.nextDouble();
              if (salario <= 0) {
                  System.out.println("Erro: O salário deve ser maior que 0.");
              } else {
                  break;
              }
          }
      }
      scanner.nextLine();

      setorPessoal.adicionarFuncionario(nome, funcao, matricula, departamento, salario);
      System.out.println("Funcionário adicionado com sucesso!");

      scanner.close();
    }
}