package list.ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> ordemNumerica;

    public OrdenacaoNumeros() {
        this.ordemNumerica = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        ordemNumerica.add(numero);

    }

    public void ordenarAscendente(){
        Collections.sort(ordemNumerica);
        System.out.println(ordemNumerica);

    }

    public void ordenarDescendente(){
        ordemNumerica.sort(Collections.reverseOrder());
        System.out.println(ordemNumerica);
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "ordemNumerica=" + ordemNumerica +
                '}';
    }
}
