import list.pesquisa.SomaNumero;
import set.operacoesbasicas.ConjuntoConvidados;
import set.operacoesbasicas.ConjuntoPalavrasUnicas;
import set.ordenacao.GerenciadorAlunos;
import set.pesquisa.ListaTarefas;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        GerenciadorAlunos alunos = new GerenciadorAlunos();

        alunos.adicionarAluno("João", 1L, 3.4);
        alunos.adicionarAluno("Maria", 3L, 6.3);
        alunos.adicionarAluno("Paulo", 5L, 7.6);
        alunos.adicionarAluno("Francisca", 4L, 7.4);

        alunos.exibirAlunos();
        System.out.println(alunos.exibirAlunosPorNome());
        System.out.println(alunos.exibirAlunosPorNota());
        alunos.removerAluno(1L);
        alunos.exibirAlunos();
    }
}