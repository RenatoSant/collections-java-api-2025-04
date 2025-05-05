package map.operaçõesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos() {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){

        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome){

        if (!agendaContatosMap.isEmpty()){
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroTelefone = null;
        if (!agendaContatosMap.isEmpty()){
           numeroTelefone = agendaContatosMap.get(nome);
        }
        return numeroTelefone;
    }
}
