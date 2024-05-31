package main.set.operacoesbasicas.operacoesbasicasteste;

import main.set.operacoesbasicas.palavrasunicas.ConjuntoPalavrasUnicas;

public class ConjuntoPalavrasUnicasTeste {
    public static void main(String[] args) {

        ConjuntoPalavrasUnicas palavrasUnicas = new ConjuntoPalavrasUnicas();

        palavrasUnicas.adicionarPalavra("palavra1");
        palavrasUnicas.adicionarPalavra("palavra2");
        palavrasUnicas.adicionarPalavra("palavra2");
        palavrasUnicas.adicionarPalavra("palavra3");
        palavrasUnicas.adicionarPalavra("palavra4");

        System.out.println("Palavra está presente no conjunto? "+palavrasUnicas.verificarPalavra("palavra2"));
        System.out.println(palavrasUnicas.exibirPalavrasUnicas());
        palavrasUnicas.removerPalavra("palavra2");

        System.out.println("Palavra está presente no conjunto? "+palavrasUnicas.verificarPalavra("palavra2"));
        System.out.println(palavrasUnicas.exibirPalavrasUnicas());


    }

}
