package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

    private List<Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {

        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> pesquisaAutor = new ArrayList<>();

        for (Livro livro : livroList) {

            if (livro.getAutor().equalsIgnoreCase(autor)) {

                pesquisaAutor.add(livro);
            }
        }
        return pesquisaAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> pesquisaAnos = new ArrayList<>();

        for (Livro livro : livroList) {
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                pesquisaAnos.add(livro);
            }
        }
        return pesquisaAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro pesquisaTitulo = null;

        for (Livro livro : livroList){
            if (livro.getTitulo().equalsIgnoreCase(titulo)){
               pesquisaTitulo = livro;
               break;
            }
        }
        return pesquisaTitulo;
    }
}

