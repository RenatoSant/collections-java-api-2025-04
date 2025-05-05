package map.ordenação;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPorAutor implements Comparator<Map.Entry<String, Livro>> {

    public int compare(Map.Entry<String,Livro> i1, Map.Entry<String, Livro> i2){
        return i1.getValue().getAutor().compareToIgnoreCase(i2.getValue().getAutor());
    }
}
