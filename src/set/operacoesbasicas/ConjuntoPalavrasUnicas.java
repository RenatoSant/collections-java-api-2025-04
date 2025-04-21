package set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> conjuntoPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        conjuntoPalavrasUnicas.add(new String(palavra));

    }

    public void removerPalavra(String palavra){
        if (!conjuntoPalavrasUnicas.isEmpty()) {
            if (conjuntoPalavrasUnicas.contains(palavra)) {
                conjuntoPalavrasUnicas.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public Boolean verificarPalavra(String palavra){
       return conjuntoPalavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(conjuntoPalavrasUnicas);
    }
}
