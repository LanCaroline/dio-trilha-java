package main.list.operacoesbasicas.operacoesbasicasteste;

import main.list.operacoesbasicas.listadetarefas.ListaTarefas;

public class ListaTarefasTeste {

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();

        //obter número total de tarefas (o valor deve ser 0)
        System.out.println("Total de elementos na lista: "+listaTarefa.obterNumeroTotalTarefas());

        //adicionar tarefa
//        listaTarefa.adicionarTarefa("Arrumar o guarda-roupa");
//        listaTarefa.adicionarTarefa("Passar roupa");
//        listaTarefa.adicionarTarefa("Lavar a louça");
//        listaTarefa.adicionarTarefa("Lavar roupa");
//        listaTarefa.adicionarTarefa("Arrumar a cama");

        //obter número total de tarefas
        System.out.println("Total de elementos na lista: "+listaTarefa.obterNumeroTotalTarefas());

        //listar as tarefas/descrições
        listaTarefa.obterDescricoesTarefas();

        //remover tarefa
        listaTarefa.removerTarefa("Passar roupa");
        listaTarefa.removerTarefa("lavar roupa");

        //obter número total de tarefas
        System.out.println("Total de elementos na lista: "+listaTarefa.obterNumeroTotalTarefas());

        //listar as tarefas/descrições
        listaTarefa.obterDescricoesTarefas();

    }
}
