package main.list.operacoesbasicas.listadetarefas;

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
