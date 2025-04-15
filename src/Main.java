import list.operaçõesbasicas.CarrinhoDeCompras;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras compras = new CarrinhoDeCompras();

        compras.adicionarItem("Banana", 4.52, 5);

        compras.exibirItens();
        System.out.println("E o valor total é: " + compras.calcularValorTotal());
    }
}