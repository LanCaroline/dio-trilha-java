package main.map.operacoesbasicas.agendacontatos;

import main.set.pesquisa.agendacontatos.Contato;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> contatos;

    public AgendaContatos(){
        contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        contatos.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!contatos.isEmpty()){
            if(contatos.containsKey(nome)){
                contatos.remove(nome);
            }
        }else {
            System.out.println("Agenda vazia.");
        }
    }

    public Map<String, Integer> exibirContatos(){
        if(!contatos.isEmpty()){
            return contatos;
        }else {
            throw new IllegalArgumentException("Agenda vazia.");
        }

    }

    public Integer pesquisaPorNome(String nome){

        if(!contatos.isEmpty()){
            for(String key : contatos.keySet()){
                if(key.equalsIgnoreCase(nome)){
                    System.out.println(key);
                    return contatos.get(key);
                }
            }
        }else {
            throw new IllegalArgumentException("Agenda vazia.");
        }
        return null;
    }
}

