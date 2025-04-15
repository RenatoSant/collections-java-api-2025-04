package list.operaçõesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

  private List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinho.add(new Item(nome, preco, quantidade));

    }

    public void removerItem(String nome){
        List<Item> novaLista = new ArrayList<>();

        for (Item item : carrinho){
            if (item.getNome().equalsIgnoreCase(nome)){

                novaLista.add(item);
            }
        }
        carrinho.removeAll(novaLista);
    }

    public double calcularValorTotal(){
            double valorTotal= 0d;
        for (Item item : carrinho){

            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem;

        }
        return valorTotal;

    }

    public void exibirItens(){

        System.out.println("Itens comprados: " + carrinho);
    }
}

