package main.set.pesquisa.listatarefas;


import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {

    private Set<Tarefa> lista;

    public ListaTarefas(){
        lista = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        lista.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        if(!lista.isEmpty()){
            for(Tarefa t : lista){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    lista.remove(t);
                    break;
                }
            }
        }
    }

    public Set<Tarefa> exibirTarefa(){
        return lista;
    }

    public int contarTarefas(){
        return lista.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();

        if(!lista.isEmpty()){
            for (Tarefa t: lista){
                if(t.getConluido()){
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();

        if(!lista.isEmpty()){
            for (Tarefa t: lista){
                if(!t.getConluido()){
                    tarefasPendentes.add(t);
                }
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!lista.isEmpty()){
            for(Tarefa t: lista){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluido(true);
                    break;
                }
            }
        }
    }

    public void marcarTarefaPendente(String descricao){
        if(!lista.isEmpty()){
            for(Tarefa t: lista){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConcluido(false);
                    break;
                }
            }
        }
    }

    public void limparListaTarefas(){
        if(!lista.isEmpty()){
            lista.removeAll(lista);
            System.out.println("Lista foi esvaziada com sucesso!");
        }else{

        System.out.println("Lista está vazia.");}
    }

}
