package main.map.operacoesbasicas.operacoesbasicasteste;

import main.map.operacoesbasicas.dicionario.Dicionario;

public class DicionarioTeste {
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("amor", "sentimento de carinho, bondade, querer bem.");
        dicionario.adicionarPalavra("lógica", "tipo de raciocínio, pensamento geral como dedução, indução, hipótese, inferência etc. Operação intelectual do que é verdadeiro ou não.");
        dicionario.adicionarPalavra("conceito", "compreensão que alguém tem de uma palavra; noção, concepção, ideia.");

        System.out.println(dicionario.exibirPalavras());
        dicionario.removerPalavra("lógica");
        System.out.println(dicionario.exibirPalavras());
        System.out.println(dicionario.pesquisaPorPalavra("conceito"));
        System.out.println(dicionario.pesquisaPorPalavra("lógica"));
    }
}
