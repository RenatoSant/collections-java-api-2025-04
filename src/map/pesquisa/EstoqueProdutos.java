package map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutomap;

    public EstoqueProdutos() {
        this.estoqueProdutomap = new HashMap<>();

    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutomap.put(cod,new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutomap);
    }

    public double calcularValorTotalEstoque(){
        double totalEstoque = 0d;
        for (Produto p : estoqueProdutomap.values()){
            totalEstoque += p.getPreco() * p.getQuantidade();
        }
        return totalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutomap.isEmpty()){
            for (Produto p : estoqueProdutomap.values()){
                if (p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato =  null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutomap.isEmpty()){
            for (Produto p : estoqueProdutomap.values()){
                if (p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto maiorProduto = null;
        double maiorValor = Double.MIN_VALUE;
        if (!estoqueProdutomap.isEmpty()){
            for (Produto p : estoqueProdutomap.values()){
                if (p.getPreco() * p.getQuantidade() > maiorValor){
                    maiorProduto = p;
                    maiorValor = p.getPreco() * p.getQuantidade();
                }
            }
        }
        return maiorProduto;
    }
}
