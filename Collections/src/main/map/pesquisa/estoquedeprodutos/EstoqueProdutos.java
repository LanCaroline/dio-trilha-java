package main.map.pesquisa.estoquedeprodutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutos;

    public EstoqueProdutos(){
        estoqueProdutos = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutos.put(cod,new Produto(nome, quantidade, preco));

    }

    public Map<Long, Produto> exibirProdutos(){
        if(!estoqueProdutos.isEmpty()){
            return estoqueProdutos;
        }else {
            throw new IllegalArgumentException("Estoque vazio.");
        }
    }

    public double calcularValorTotalEstoque(){
        double total = 0;
        if(!estoqueProdutos.isEmpty()){
            for(Long key: estoqueProdutos.keySet()){
                total += estoqueProdutos.get(key).getQuantidade() * estoqueProdutos.get(key).getPreco();
            }
        }else {
            throw new IllegalArgumentException("Estoque vazio");
        }

        return total;
    }

    public Produto obterProdutoMaisCaro(){
        double preco = Double.MIN_VALUE;
        Produto produto = null;
        if(!estoqueProdutos.isEmpty()){
            for(Produto p: estoqueProdutos.values()){
                if(p.getPreco() > preco){
                    produto = p;
                    preco = p.getPreco();
                }
            }
        }

        return produto;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produto = null;
        double preco = Double.MAX_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for(Produto p : estoqueProdutos.values()){
                if(p.getPreco() < preco){
                    produto = p;
                    preco = p.getPreco();
                }
            }
        }
        return produto;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produto = null;
        double valorTotal = Double.MIN_VALUE;
        if(!estoqueProdutos.isEmpty()){
            for(Produto p : estoqueProdutos.values()){
                if(p.getQuantidade() * p.getPreco() > valorTotal){
                    produto = p;
                    valorTotal = p.getQuantidade() * p.getPreco();
                }
            }
        }

        return produto;
    }

}
