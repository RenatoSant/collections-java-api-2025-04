package map.pesquisa;

import java.lang.invoke.StringConcatFactory;
import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemDePalavras;

    public ContagemPalavras() {
        this.contagemDePalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemDePalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if (!contagemDePalavras.isEmpty()){
            contagemDePalavras.remove(palavra);
        }
    }

    public void exibirContagemPalavras(){
        System.out.println(contagemDePalavras);
    }

    public Map.Entry<String, Integer> encontrarPalavraMaisFrequente(){

        Map.Entry<String, Integer> palavraMaisFrequente = null;
        int maiorContagem = 0;

        for (Map.Entry<String, Integer> e : contagemDePalavras.entrySet()){
            if (e.getValue() > maiorContagem){
                maiorContagem = e.getValue();
                palavraMaisFrequente = e;

            }
        }
        return palavraMaisFrequente;
    }

}
