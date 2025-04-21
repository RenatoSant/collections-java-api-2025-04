package set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Alunos> gerenciador;

    public GerenciadorAlunos() {
        this.gerenciador = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        gerenciador.add(new Alunos(matricula,nome,media));
    }

    public void removerAluno(long matricula){
       Alunos removedor = null;
        for (Alunos a : gerenciador){
            if (a.getMatricula() == matricula){
                removedor = a;
            }
        }
        gerenciador.remove(removedor);
    }

    public Set<Alunos> exibirAlunosPorNome(){
        Set<Alunos> exibirPorNome = new TreeSet<>(gerenciador);
        return exibirPorNome;
    }

    public Set<Alunos> exibirAlunosPorNota(){
        Set<Alunos> exibirPorNota = new TreeSet<>(new ComparatorAluno());
        exibirPorNota.addAll(gerenciador);
        return exibirPorNota;
    }

    public void exibirAlunos(){
        System.out.println(gerenciador);
    }
}
