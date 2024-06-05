package main.map.pesquisa.contagemdepalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> contagemP;

    public ContagemPalavras(){
        contagemP = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemP.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        if(!contagemP.isEmpty()){
            contagemP.remove(palavra);
        }else {
            System.out.println("Contagem de palavras está vazio.");
        }
    }

    public Map<String, Integer> exibirContagemPalavras(){
        if(!contagemP.isEmpty()){
            return contagemP;
        }else {
            throw new IllegalArgumentException("Contagem vazia.");
        }
    }

    public Map<String, Integer> encontraPalavraMaisFrequente(){
        int contagem = Integer.MIN_VALUE;
        Map<String, Integer> palavraMaisFrequente = new HashMap<>();
        if(!contagemP.isEmpty()){
            for(String p : contagemP.keySet()){
                if(contagemP.get(p) > contagem){
                    contagem = contagemP.get(p);
                    palavraMaisFrequente.clear();
                    palavraMaisFrequente.put(p,contagemP.get(p));
                }
            }
        }

        return palavraMaisFrequente;
    }
}
