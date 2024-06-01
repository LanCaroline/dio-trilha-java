package main.set.ordenacao.cadastrodeprodutos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

     private Set<Produto> produtos;

     public CadastroProdutos(){
         produtos = new HashSet<>();
     }

     public void adicionarProduto(long cod, String nome, double preco, int quantidade){
         produtos.add(new Produto(nome, cod, preco, quantidade));
     }

     public Set<Produto> exibirProdutosPorNome(){
         Set<Produto> produtosPorNome = new TreeSet<>(produtos);
         return produtosPorNome;

     }

     public Set<Produto> exibirProdutosPorPreco(){
         Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
         produtosPorPreco.addAll(produtos);
         return produtosPorPreco;

     }




}

