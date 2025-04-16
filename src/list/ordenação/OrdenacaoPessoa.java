package list.ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

    private List<Pessoas> pessoasList;

    public OrdenacaoPessoa() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoasList.add(new Pessoas(nome, idade, altura));

    }

    public List<Pessoas> ordenarPorIdade(){
        List<Pessoas> ordemIdade = new ArrayList<>(pessoasList);
        Collections.sort(ordemIdade);
        return ordemIdade;

    }

    public List<Pessoas> ordenarPorAltura(){
        List<Pessoas> ordemAltura = new ArrayList<>(pessoasList);
        Collections.sort(ordemAltura, new OrdemAltura());
        return ordemAltura;
    }
}
