package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero {

    private List<Integer> listaNumeros;

    public SomaNumero() {
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);

    }

    public int calcularSoma(){
       int y = 0;

        for (int x : listaNumeros){
             y =+ x;

        }
        return y;
    }

    public int encontrarMaiorNumero(){
        int y = 0;

        for (int x : listaNumeros){
            if (x >= y){
                y = x;
            }
        }
        return y;
    }

    public int encontrarMenorNumero(){
        int y = Integer.MAX_VALUE;
        for (int x : listaNumeros){
            if (x <= y){
                y = x;
            }
        }
        return y;
    }

    public void exibirNumeros(){
        System.out.println(listaNumeros);
    }

    @Override
    public String toString() {
        return "SomaNumero{" +
                "listaNumeros=" + listaNumeros +
                '}';
    }
}
