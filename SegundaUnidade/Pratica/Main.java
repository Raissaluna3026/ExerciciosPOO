public class Main {
    public static void main(String[] args){
        String i;
        Pessoas pe = new Pessoas("Raissa", "Rua da paz N1");
        Pessoas pi = new Pessoas("Lucas", "Livramento de nsosa senhroa");
        i = pe.qualEndereco();
        Estudante es = new Estudante("Fernando", "Rua das pamonhas", "UFBA", 2);
        System.out.println(pe);
        System.out.println(pi);
        System.out.println(es);
        System.out.println(i);
    }
}
