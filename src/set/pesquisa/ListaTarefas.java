package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    Set<Tarefa> listaTarefa;

    public ListaTarefas() {
        this.listaTarefa = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;
        if (!listaTarefa.isEmpty()){
            for (Tarefa t : listaTarefa) {
                if (t.getNomeTarefa().equalsIgnoreCase(descricao)) {
                    tarefaParaRemover = t;
                    break;
                }
            }
            listaTarefa.remove(tarefaParaRemover);
        } else
            System.out.println("Não há tarefas registradas.");
    }

    public void exibirTarefas(){
        if (!listaTarefa.isEmpty()){
            System.out.println(listaTarefa);
        } else
            System.out.println("A lista está vazia.");
    }

    public int contarTarefas(){
        return listaTarefa.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa>tarefaConcluidas = new HashSet<>();
        for (Tarefa t : listaTarefa){
            if (t.isConclusaoTarefa()){;
            tarefaConcluidas.add(t);
            }
        }
        return tarefaConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa>tarefaPendentes = new HashSet<>();
        for (Tarefa t : listaTarefa){
            if (!t.isConclusaoTarefa());
            tarefaPendentes.add(t);
        }
        return tarefaPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        for (Tarefa t : listaTarefa){
            if (t.getNomeTarefa().equalsIgnoreCase(descricao)){
                t.setConclusaoTarefa(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        for (Tarefa t : listaTarefa){
            if (t.getNomeTarefa().equalsIgnoreCase(descricao)){
                t.setConclusaoTarefa(false);
            }
        }
    }

    public void limparListaTarefas(){
        Set<Tarefa> limpaTarefas = new HashSet<>();
        limpaTarefas.addAll(listaTarefa);
        listaTarefa.removeAll(limpaTarefas);
    }
}
