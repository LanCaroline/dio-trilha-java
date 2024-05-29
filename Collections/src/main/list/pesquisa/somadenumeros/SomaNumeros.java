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
        int maiorNum = Integer.MIN_VALUE;

        if (!numeroList.isEmpty()) {
            for(Integer numero: numeroList){
                if(numero>= maiorNum){
                    maiorNum = numero;
                }
            }
            return maiorNum;
        }else {
            return 0;
        }
    }

    public int encontrarMenorNumero(){
        int menorNum = Integer.MAX_VALUE;

        if (!numeroList.isEmpty()) {
            for (Integer numero: numeroList){
                if(numero <= menorNum){
                    menorNum = numero;
                }
            }
            return menorNum;

        }else {
            return 0;
        }
    }

    public List<Integer> exibirNumeros(){
        return numeroList;
    }





}
