package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contatos> agendaContatos;

    public AgendaContatos() {
        this.agendaContatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        agendaContatos.add(new Contatos(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(agendaContatos);
    }

    public Set<Contatos> pesquisarPorNome(String nome){
        Set<Contatos> contatinhos = new HashSet<>();
        for (Contatos c : agendaContatos){
            //startsWith é um metodo para avalaiar apenas o item primario do objeto. ex: Camila
            // Camila pitanga, Camila sampaio. Ele vai apenas comparar com o nome Camila.
            if (c.getNome().startsWith(nome)){
                contatinhos.add(c);
            }
        }
        return contatinhos;
    }

    public Contatos atualizarNumeroContato(String nome, int novoNumero){
        Contatos contatoAtualizado = null;
        for (Contatos c : agendaContatos){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
}
