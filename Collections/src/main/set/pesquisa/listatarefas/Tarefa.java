package main.set.pesquisa.listatarefas;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean concluido;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.concluido = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public boolean getConluido(){
        return concluido;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return getDescricao().equals(tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }


    @Override
    public String toString() {
        return "\n Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", concluido=" + concluido +
                '}';
    }
}
