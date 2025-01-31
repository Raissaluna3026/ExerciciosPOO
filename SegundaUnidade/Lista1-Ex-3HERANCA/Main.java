
public class Main
{
    public static void main(String[] args){
        Titulo livr = new Livros("Mat", "Editora moderna", 5.0f, "Muhamad ali", "é um livro bom e ponto");
        Titulo revs = new Revistas("Revista Ciência", "Editora Abril", 20.0f, "Mensal");

        System.out.println("Preço Final do Livro: R$" + livr.calcularPrecoFinal(true)); 
        System.out.println("Preço Final da Revista: R$" + revs.calcularPrecoFinal(true)); 
    }

}
