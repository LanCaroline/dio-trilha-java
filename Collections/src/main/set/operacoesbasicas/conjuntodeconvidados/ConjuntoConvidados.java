package main.set.operacoesbasicas.conjuntodeconvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados(){
        convidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidados.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){

        Convidado removerConvidado = null;

        for (Convidado convidado: convidados){
            if(convidado.getCodigoConvite() == codigoConvite){
                removerConvidado = convidado;
                break;
            }
        }

        convidados.remove(removerConvidado);
    }

    public int contarConvidados(){
        return convidados.size()!= 0 ? convidados.size(): 0;
    }

    public Set<Convidado> exibirConvidados(){

        return convidados;
    }



}
