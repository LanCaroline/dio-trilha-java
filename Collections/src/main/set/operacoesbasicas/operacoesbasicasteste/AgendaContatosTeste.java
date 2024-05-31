package main.set.operacoesbasicas.operacoesbasicasteste;

import main.set.operacoesbasicas.agendacontatos.AgendaContatos;

public class AgendaContatosTeste {
    public static void main(String[] args) {

        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Vick", 1564894351);
        agenda.adicionarContato("Vicktoria", 154651213);
        agenda.adicionarContato("Vickson", 787945641);
        agenda.adicionarContato("Vickyn", 1656565551);

        System.out.println(agenda.exibirContatos());

        agenda.atualizarNumeroContato("Vick", 111111111);
        System.out.println(agenda.exibirContatos());

        System.out.println(agenda.pesquisarPorNome("vickyn"));

    }
}
