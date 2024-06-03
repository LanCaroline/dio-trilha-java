package main.map.operacoesbasicas.operacoesbasicasteste;

import main.map.operacoesbasicas.agendacontatos.AgendaContatos;

public class AgendaContatosTeste {
    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Ana", 55676138);
        agendaContatos.adicionarContato("Bruno", 556787895);
        agendaContatos.adicionarContato("Luna", 55798458);
        agendaContatos.adicionarContato("Bárbara", 55642218);

        System.out.println(agendaContatos.exibirContatos());

        agendaContatos.removerContato("Bruno");
        System.out.println(agendaContatos.pesquisaPorNome("Luna"));

        System.out.println(agendaContatos.exibirContatos());
    }
}
