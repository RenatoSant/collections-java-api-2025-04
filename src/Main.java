import list.pesquisa.SomaNumero;
import map.operaçõesbasicas.Dicionario;
import map.ordenação.LivrariaOnline;
import map.ordenação.Livro;
import map.pesquisa.ContagemPalavras;
import map.pesquisa.EstoqueProdutos;
import set.operacoesbasicas.ConjuntoConvidados;
import set.operacoesbasicas.ConjuntoPalavrasUnicas;
import set.ordenacao.GerenciadorAlunos;
import set.pesquisa.ListaTarefas;


import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));


        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());
        System.out.println(livrariaOnline.livrosOrdenadosPorAutor());
        System.out.println(livrariaOnline.obterLivroMaisCaro());
        System.out.println(livrariaOnline.exibirLivroMaisBarato());
        livrariaOnline.removerLivro("Malorie");
        System.out.println(livrariaOnline.exibirLivrosOrdenadosPorPreco());


    }
}