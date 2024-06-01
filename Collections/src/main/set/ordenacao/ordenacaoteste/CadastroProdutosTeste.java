package main.set.ordenacao.ordenacaoteste;

import main.set.ordenacao.cadastrodeprodutos.CadastroProdutos;

public class CadastroProdutosTeste {

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos =new CadastroProdutos();
        cadastroProdutos.adicionarProduto(456, "Maçã",3.20, 4);
        cadastroProdutos.adicionarProduto(896, "Pêra",7.20, 4);
        cadastroProdutos.adicionarProduto(054, "Banana",2.20, 4);
        cadastroProdutos.adicionarProduto(233, "Uva",6.50, 4);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }
}
