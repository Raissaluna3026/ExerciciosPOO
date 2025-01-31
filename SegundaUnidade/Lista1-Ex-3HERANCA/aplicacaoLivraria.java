import java.util.ArrayList;

public class AplicacaoLivraria
{
    private ArrayList<Titulo> titulos;

    
    public AplicacaoLivraria()
    {
        titulos = new ArrayList<>();
    }

    public void criarRevista(String nome, String editora, float preco, String periodicidade){
        Revistas rev = new Revistas(nome, editora, preco, periodicidade);
        titulos.add(rev);
    }
    public void criarLivroDidatico(String nome, String editora, float preco,String autorPrincipal, String resumo, String area){
        LivrosDidaticos liv = new LivrosDidaticos(nome, editora, preco, autorPrincipal, resumo, area);
        titulos.add(liv);
    }
    public void consultarResumoLivros(String nome){
        for(Titulo tit : titulos){
            if(tit instanceof Livros && tit.getNome().equals(nome)){
                System.out.println("Resumo do livro '" + tit.getNome() + "': " + ((Livros) tit).getResumo());
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }
    public void verificarEditoraRevistas(Revistas rev1, Revistas rev2){
        if(rev1.getEditora().equals(rev2.getEditora())){
            System.out.println("As revistas possuem a mesma editora: " + rev1.getEditora());
        }else{
            System.out.println("As revistas n possuem a mesma editora");
        }
    }
}
