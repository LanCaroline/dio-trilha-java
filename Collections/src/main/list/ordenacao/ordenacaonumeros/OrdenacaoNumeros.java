package main.list.ordenacao.ordenacaonumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros(){
        numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numAscendente = new ArrayList<>(numeros);

        if(!numeros.isEmpty()){
            Collections.sort(numAscendente);
            return numAscendente;
        }else {
            throw new RuntimeException();
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numDescendente = new ArrayList<>(numeros);

        if (!numeros.isEmpty()){
            Collections.sort(numDescendente);
            numDescendente.sort(Collections.reverseOrder());
            return numDescendente;
        }else {
            throw new RuntimeException();
        }
    }
}
