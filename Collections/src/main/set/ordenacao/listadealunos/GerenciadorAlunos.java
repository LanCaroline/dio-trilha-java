package main.set.ordenacao.listadealunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunos;

    public GerenciadorAlunos(){
        alunos = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunos.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){

        if(!alunos.isEmpty()){
            for (Aluno a: alunos){
                if(a.getMatricula() == matricula){
                    alunos.remove(a);
                    break;
                }
            }
        }


    }


    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunos);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorNota());
        alunosPorNota.addAll(alunos);
        return alunosPorNota;
    }
}

