package main.list.pesquisa.pesquisateste;

import main.list.pesquisa.somadenumeros.SomaNumeros;

public class SomaNumerosTeste {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        //adicionando números negativos
        somaNumeros.adicionarNumero(-12);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(-1);
        somaNumeros.adicionarNumero(-20);
        somaNumeros.adicionarNumero(-7);

        System.out.println("Soma dos números: "+somaNumeros.calcularSoma());

        System.out.println("O maior número: "+somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número: "+somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.exibirNumeros());

    }
}
