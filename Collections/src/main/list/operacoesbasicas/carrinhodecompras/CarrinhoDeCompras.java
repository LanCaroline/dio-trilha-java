package main.list.operacoesbasicas.carrinhodecompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> listaItens;

    public CarrinhoDeCompras(){
        listaItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        ArrayList<Item> itensremovidos = new ArrayList<>();

        if(!listaItens.isEmpty()){
            for(Item item: listaItens){
                if(item.getNome().equalsIgnoreCase(nome)){
                    itensremovidos.add(item);
                }
            }

            listaItens.removeAll(itensremovidos);
        }else {
            System.out.println("Carrinho de compras vazia. Nenhum item há ser removido.");
        }
    }

    public double calcularValorTotal() {
        double precoTotal = 0;
        if (listaItens.isEmpty()) {
            System.out.println("Lista vazia. Valor total: $"+precoTotal);
        } else {
            for (Item item : listaItens) {

                precoTotal += item.getPreco();

            }
        }
        return precoTotal;
    }

    public void exibirItens(){

        if (listaItens.isEmpty()) {
            System.out.println("Lista de descrições vazia.");
        }else {
            for(Item item: listaItens){
                System.out.println(item.toString());
            }
        }
    }


}
