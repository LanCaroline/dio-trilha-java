package main.map.pesquisa.pesquisateste;

import main.map.pesquisa.estoquedeprodutos.EstoqueProdutos;

public class EstoqueProdutosTeste {

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(852357L, "Arroz", 400, 12);
        estoqueProdutos.adicionarProduto(456157L, "Feijão", 460, 7);
        estoqueProdutos.adicionarProduto(789657L, "Pipoca", 230, 5);
        estoqueProdutos.adicionarProduto(864547L, "Chocolate", 300, 8);
        estoqueProdutos.adicionarProduto(112347L, "Leite", 150, 22);
        estoqueProdutos.adicionarProduto(210237L, "Açúcar", 200, 11);

        System.out.println("Estoque: "+estoqueProdutos.exibirProdutos());
        System.out.println("Valor total do estoque: "+estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: "+estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: "+estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("Produto com mais quantidade e valor total no estoque: "+estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

    }
}
