package main.list.operacoesbasicas.operacoesbasicasteste;

import main.list.operacoesbasicas.carrinhodecompras.CarrinhoDeCompras;

public class CarrinhoDeComprasTeste {

    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //obter valor total de itens (o valor deve ser $0,00)
        System.out.println("Valor total de itens no carrinho de compras: $"+ carrinhoDeCompras.calcularValorTotal());

        //adicionar item
        carrinhoDeCompras.adicionarItem("banana", 7.86, 4);
        carrinhoDeCompras.adicionarItem("maçã", 8.40, 5);
        carrinhoDeCompras.adicionarItem("pêssego", 14.6, 8);
        carrinhoDeCompras.adicionarItem("romã", 24.22, 1);
        carrinhoDeCompras.adicionarItem("acerola", 3.80, 15);

        //obter valor total de itens
        System.out.println("Valor total de itens no carrinho de compras: $"+carrinhoDeCompras.calcularValorTotal());

        //listar os itens do carrinho de compras
        carrinhoDeCompras.exibirItens();

        //remover item
        carrinhoDeCompras.removerItem("maçã");
        carrinhoDeCompras.removerItem("acerola");

        //obter valor total de itens no carrinho de compras
        System.out.println("Valor total de itens no carrinho de compras: $"+carrinhoDeCompras.calcularValorTotal());

        //listar de itens
        carrinhoDeCompras.exibirItens();

    }
}
