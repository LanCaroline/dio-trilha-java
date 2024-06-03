package main.list.operacoesbasicas.listadetarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> listaTarefas;

    public ListaTarefas(){
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefas.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemovidas = new ArrayList<>();
        for(Tarefa tarefa: listaTarefas){
            if(tarefa.getDescricao().equalsIgnoreCase(descricao)){
                tarefasRemovidas.add(tarefa);
            }
        }

        listaTarefas.removeAll(tarefasRemovidas);
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefas.size();
    }

    public void obterDescricoesTarefas() {

        if (listaTarefas.isEmpty()) {
            System.out.println("Lista de descrições vazia.");
        }else {
            for (Tarefa tarefa : listaTarefas) {
                System.out.println(tarefa.getDescricao());
            }
              //System.out.println(listaTarefas);

        }
    }


}
