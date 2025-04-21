package set.ordenacao;

import java.util.Comparator;

public class ComparatorAluno implements Comparator<Alunos> {
    @Override
    public int compare(Alunos a1, Alunos a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
