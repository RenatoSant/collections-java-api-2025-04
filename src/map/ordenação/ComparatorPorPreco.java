package map.ordenação;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPorPreco implements Comparator<Map.Entry<String, Livro>> {
    @Override
    public int compare(Map.Entry<String, Livro> i1, Map.Entry<String, Livro> i2){
        return Double.compare(i1.getValue().getPreco(), i2.getValue().getPreco());
    }

}
