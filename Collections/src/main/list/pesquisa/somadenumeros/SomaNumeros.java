package main.list.pesquisa.somadenumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeroList;

    public SomaNumeros(){
        numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeroList.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;

        for (int numero: numeroList){
            soma += numero;
        }

        return soma;
    }

    public int encontrarMaiorNumero(){
        List<Integer> maiornumlist = new ArrayList<>(numeroList);

        if (!numeroList.isEmpty()) {
            Collections.sort(maiornumlist);
            return maiornumlist.get(maiornumlist.size()-1);
        }else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public int encontrarMenorNumero(){
        List<Integer> menornumlist = new ArrayList<>(numeroList);

        if (!numeroList.isEmpty()) {
            menornumlist.sort(Collections.reverseOrder());
            return menornumlist.get(menornumlist.size()-1);
        }else {
            throw new RuntimeException("Lista vazia.");
        }
    }

    public List<Integer> exibirNumeros(){
        return numeroList;
    }





}
