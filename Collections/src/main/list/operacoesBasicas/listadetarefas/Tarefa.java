package main.list.operacoesBasicas.listadetarefas;

import java.util.List;

public class Tarefa{
    private String descricao;

    public Tarefa(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{"+
                "descrição: "+
                descricao+" }";
    }
}
