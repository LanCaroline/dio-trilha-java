package main.set.operacoesbasicas.operacoesbasicasteste;

import main.set.operacoesbasicas.conjuntodeconvidados.ConjuntoConvidados;

import java.util.Collections;

public class ConjuntoConvidadosTeste {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();

        convidados.adicionarConvidado("Lui", 4654882);
        convidados.adicionarConvidado("Barbara", 4654882);
        convidados.adicionarConvidado("Tony", 46546542);
        convidados.adicionarConvidado("Cleide", 4648562);
        convidados.adicionarConvidado("Bruna", 40234882);
        convidados.adicionarConvidado("Jerson", 6655211);
        convidados.adicionarConvidado("Bellien", 498645882);
        convidados.adicionarConvidado("Lorthe", 4654132);
        convidados.adicionarConvidado("Finn", 7979792);

        System.out.println(convidados.contarConvidados());
        System.out.println(convidados.exibirConvidados());

        convidados.removerConvidadoPorCodigoConvite(6655211);
        convidados.removerConvidadoPorCodigoConvite(46546542);

        System.out.println(convidados.contarConvidados());
        System.out.println(convidados.exibirConvidados());
    }
}
