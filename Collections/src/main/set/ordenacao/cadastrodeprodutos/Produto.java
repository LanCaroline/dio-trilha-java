package main.set.ordenacao.cadastrodeprodutos;

import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

    private String nome;
    private long cod;
    private double preco;
    private int quantidade;

    public Produto(String nome, long cod, double preco, int quantidade){
        this.nome= nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public long getCod() {
        return cod;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return cod == produto.cod;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cod);
    }

    @Override
    public String toString() {
        return "\nProduto{" +
                "nome='" + nome + '\'' +
                ", cod=" + cod +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2)  {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}