package main.set.operacoesbasicas.palavrasunicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas(){
        palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra){

        for (String p : palavrasUnicas){
            if(p.equals(palavra)){
                palavrasUnicas.remove(p);
                break;
            }

        }
    }

    public boolean verificarPalavra(String palavra){
        return palavrasUnicas.contains(palavra);
    }

    public Set<String> exibirPalavrasUnicas(){
        return palavrasUnicas;
    }

}
