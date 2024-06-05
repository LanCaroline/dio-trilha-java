package main.map.ordenacao.livrariaonline;

import java.net.URL;
import java.util.*;

public class LivrariaOnline {

    private Map<String,Livro> livraria;

    public LivrariaOnline(){
        livraria = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livraria.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        if(!livraria.isEmpty()){
            for(String url: livraria.keySet()){
                if(livraria.get(url).getTitulo().equalsIgnoreCase(titulo)){
                    livraria.remove(url);
                }
            }
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        Map<String, Livro> livrosOrdenadosPorPreco = new TreeMap<>(livraria);
        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> pesquisarLivroPorAutor(String autor) {
        Map<String, Livro> livrosDoAutor = new HashMap<>();
        if (!livraria.isEmpty()) {
            for (String url: livraria.keySet()){
                if(livraria.get(url).getAutor().equalsIgnoreCase(autor) ||
                        livraria.get(url).getAutor().endsWith(autor) ||
                        livraria.get(url).getAutor().startsWith(autor)){
                    livrosDoAutor.put(url, livraria.get(url));
                }
            }

        }else {
            throw new IllegalArgumentException("Livraria vazia.");
        }
        return livrosDoAutor;

    }

    public Livro obterLivroMaisCaro(){
        double preco = Double.MIN_VALUE;
        Livro livroMaisCaro = null;
        if(!livraria.isEmpty()){
            for (Livro l: livraria.values()){
                if(l.getPreco() > preco){
                    livroMaisCaro = l;
                    preco = l.getPreco();
                }
            }
        }else {
            throw new IllegalArgumentException("Livraria vazia.");
        }

        return livroMaisCaro;

    }

    public Livro obterLivroMaisBarato(){
        double preco = Double.MAX_VALUE;
        Livro livroMaisBarato = null;
        if(!livraria.isEmpty()){
            for (Livro l: livraria.values()){
                if(l.getPreco() < preco){
                    livroMaisBarato = l;
                    preco = l.getPreco();
                }
            }
        }else {
            throw new IllegalArgumentException("Livraria vazia.");
        }

        return livroMaisBarato;

    }


}
