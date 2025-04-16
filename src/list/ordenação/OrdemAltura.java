package list.ordenação;

import java.util.Comparator;

public class OrdemAltura implements Comparator<Pessoas> {

    @Override
    public int compare(Pessoas p1, Pessoas p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}
