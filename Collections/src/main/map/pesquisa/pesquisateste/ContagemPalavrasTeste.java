package main.map.pesquisa.pesquisateste;

import main.map.pesquisa.contagemdepalavras.ContagemPalavras;

public class ContagemPalavrasTeste {

    public static void main(String[] args) {
        ContagemPalavras contagem = new ContagemPalavras();

        contagem.adicionarPalavra("amanhã", 5);
        contagem.adicionarPalavra("estou", 6);
        contagem.adicionarPalavra("na", 40);
        contagem.adicionarPalavra("academia", 4);
        contagem.adicionarPalavra("supino", 3);
        contagem.adicionarPalavra("malhar", 10);

        System.out.println(contagem.exibirContagemPalavras());
        System.out.println(contagem.encontraPalavraMaisFrequente());
        contagem.removerPalavra("na");
        System.out.println(contagem.exibirContagemPalavras());
        System.out.println(contagem.encontraPalavraMaisFrequente());




    }
}
