package main.list.ordenacao.ordenacaoteste;

import main.list.ordenacao.ordenacaonumeros.OrdenacaoNumeros;

public class OrdenacaoNumerosTeste {

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(0);
        ordenacaoNumeros.adicionarNumero(34);
        ordenacaoNumeros.adicionarNumero(05);
        ordenacaoNumeros.adicionarNumero(67);
        ordenacaoNumeros.adicionarNumero(8);

        System.out.println("Ordenar números ascendentes: "+ ordenacaoNumeros.ordenarAscendente());
        System.out.println("Ordenar números descendentes: "+ ordenacaoNumeros.ordenarDescendente());
    }
}
