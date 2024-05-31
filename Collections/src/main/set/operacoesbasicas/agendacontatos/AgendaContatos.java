package main.set.operacoesbasicas.agendacontatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos(){
        contatos = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }

    public Set<Contato> exibirContatos(){
        return contatos;
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatosComNome = new HashSet<>();

        for (Contato c: contatos) {
            if(c.getNome().equalsIgnoreCase(nome)){
                contatosComNome.add(c);
            }
        }

        return contatosComNome;
    }

    public void atualizarNumeroContato(String nome, int novoNumero){

        if(!contatos.isEmpty()){
            for(Contato c: contatos){
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumeroTelefone(novoNumero);
                    break;
                }
            }
        }
    }


}
