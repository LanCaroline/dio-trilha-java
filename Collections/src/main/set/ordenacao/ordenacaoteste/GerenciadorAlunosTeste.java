package main.set.ordenacao.ordenacaoteste;

import main.set.ordenacao.listadealunos.GerenciadorAlunos;


public class GerenciadorAlunosTeste {

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Joana Lins", 789561L, 9.5);
        gerenciadorAlunos.adicionarAluno("Svetlana Frans", 258369L, 10);
        gerenciadorAlunos.adicionarAluno("Savana B.", 741852L, 6.2);
        gerenciadorAlunos.adicionarAluno("Georgina G.", 951753L, 4.5);
        gerenciadorAlunos.adicionarAluno("Gina Tony", 467139L, 8.4);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        gerenciadorAlunos.removerAluno(741852L);
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

    }
}
