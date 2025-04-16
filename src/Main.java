import list.pesquisa.SomaNumero;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SomaNumero somaNumero = new SomaNumero();
        somaNumero.adicionarNumero(9);
        somaNumero.adicionarNumero(7);
        somaNumero.adicionarNumero(1);
        somaNumero.adicionarNumero(6);
        somaNumero.adicionarNumero(4);
        somaNumero.calcularSoma();
        System.out.println(somaNumero.encontrarMaiorNumero());
        System.out.println(somaNumero.encontrarMenorNumero());
        somaNumero.exibirNumeros();
    }
}