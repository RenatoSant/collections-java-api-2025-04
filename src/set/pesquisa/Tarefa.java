package set.pesquisa;

public class Tarefa {

    private String nomeTarefa;
    private boolean conclusaoTarefa;

    public Tarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
        this.conclusaoTarefa = false;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public void setConclusaoTarefa(boolean conclusaoTarefa) {
        this.conclusaoTarefa = conclusaoTarefa;
    }

    public boolean isConclusaoTarefa() {
        return conclusaoTarefa;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "nomeTarefa='" + nomeTarefa + '\'' +
                ", conclusaoTarefa=" + conclusaoTarefa +
                '}';
    }
}
