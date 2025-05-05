package map.ordenação;

import java.util.*;

public class LivrariaOnline {

    private Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro){
        livroMap.put(link,livro);

    }

    public void removerLivro(String titulo){
        List<String> listaChave = new ArrayList<>();

        for (Map.Entry<String, Livro> entry : livroMap.entrySet()){
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                listaChave.add(entry.getKey());
            }
        }
        for (String chave : listaChave){
            livroMap.remove(chave);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> ordenadosPorPreco = new ArrayList<>(livroMap.entrySet());

        Collections.sort(ordenadosPorPreco, new ComparatorPorPreco());

        Map<String, Livro> ordemCrescente = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : ordenadosPorPreco){
            ordemCrescente.put(entry.getKey(), entry.getValue());
        }

        return ordemCrescente;
    }

    public Map<String, Livro> livrosOrdenadosPorAutor(){
        List<Map.Entry<String,Livro>> pesquisaPorAutor = new ArrayList<>(livroMap.entrySet());

        Collections.sort(pesquisaPorAutor, new ComparatorPorAutor());

        Map<String, Livro> ordemAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : pesquisaPorAutor){
                ordemAutor.put(entry.getKey(), entry.getValue());
            }
            return ordemAutor;

    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
            Map<String, Livro> pesquisaAutor = new LinkedHashMap<>();

            for (Map.Entry<String, Livro> entry : livroMap.entrySet()){
                if (entry.getValue().getAutor().equalsIgnoreCase(autor)){
                    pesquisaAutor.put(entry.getKey(), entry.getValue());
                }
            }
            return pesquisaAutor;

    }

    public String obterLivroMaisCaro(){
        String livroMaisCaro = null;
        double precoMaior = Double.MIN_VALUE;

        for (Map.Entry<String, Livro> entry : livroMap.entrySet()){

            if (entry.getValue().getPreco() > precoMaior){
                precoMaior = entry.getValue().getPreco();
                livroMaisCaro = entry.getValue().getTitulo();
            }
        }
        return livroMaisCaro;
    }

    public String exibirLivroMaisBarato(){
        String livroMaisBarato = null;
        double precoMenor = Double.MAX_VALUE;

        for (Map.Entry<String, Livro> entry : livroMap.entrySet()){

            if (entry.getValue().getPreco() < precoMenor){
                precoMenor = entry.getValue().getPreco();
                livroMaisBarato = entry.getValue().getTitulo();
            }
        }
        return livroMaisBarato;
    }

}
