package main.map.operacoesbasicas.dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionario;

    public Dicionario(){
        dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if (!dicionario.isEmpty()) {

            if(dicionario.containsKey(palavra)){
                dicionario.remove(palavra);
            }else {
                System.out.println("Palavra não encontrada.");
            }

        }else {
            System.out.println("Dicionario vazio.");
        }
    }

    public Map<String, String> exibirPalavras(){
        if(!dicionario.isEmpty()){
            return dicionario;
        }else {
            throw new IllegalArgumentException("Dicionario vazio.");
        }
    }

    public String pesquisaPorPalavra(String palavra){
        if(!dicionario.isEmpty()){
            for(String key : dicionario.keySet()){
                if(key.equalsIgnoreCase(palavra)){
                    return key +": "+dicionario.get(key);
                }
            }
        }else {
            return "Dicionario vazio.";
        }
        return "Palavra não encontrada.";
    }
}
