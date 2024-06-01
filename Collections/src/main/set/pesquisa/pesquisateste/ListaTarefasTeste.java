package main.set.pesquisa.pesquisateste;

import main.set.pesquisa.listatarefas.ListaTarefas;

public class ListaTarefasTeste {

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Planejar projeto");
        listaTarefas.adicionarTarefa("Design do projeto");
        listaTarefas.adicionarTarefa("Documentação");
        listaTarefas.adicionarTarefa("Script dos mapas");
        listaTarefas.adicionarTarefa("Montagem do protótipo");
        listaTarefas.adicionarTarefa("Limpeza e checagem de andamento do projeto");

        System.out.println(listaTarefas.contarTarefas());
        System.out.println(listaTarefas.exibirTarefa());
        listaTarefas.marcarTarefaConcluida("design do projeto");
        listaTarefas.marcarTarefaConcluida("documentação");
        listaTarefas.marcarTarefaConcluida("script dos mapas");
        System.out.println(listaTarefas.exibirTarefa());

        System.out.println(listaTarefas.obterTarefasConcluidas());
        System.out.println(listaTarefas.obterTarefasPendentes());

        listaTarefas.removerTarefa("limpeza e checagem de andamento do projeto");

        System.out.println(listaTarefas.exibirTarefa());

        System.out.println(listaTarefas.contarTarefas());

        listaTarefas.limparListaTarefas();

        System.out.println(listaTarefas.exibirTarefa());
        System.out.println(listaTarefas.contarTarefas());

    }
}
